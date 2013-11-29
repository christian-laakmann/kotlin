/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.jet.generators.tests.generator;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.intellij.openapi.util.io.FileUtil;
import com.intellij.openapi.util.text.StringUtil;
import com.intellij.util.Processor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.TestMetadata;
import org.jetbrains.jet.utils.Printer;
import org.junit.Assert;

import java.io.File;
import java.lang.reflect.Method;
import java.util.*;
import java.util.regex.Pattern;

public class SingleClassTestModel implements TestClassModel {
    private final File rootFile;
    private final Pattern filenamePattern;
    private final String doTestMethodName;
    private final String testClassName;

    private Collection<TestMethodModel> testMethods;

    public SingleClassTestModel(@NotNull File rootFile, @NotNull Pattern filenamePattern, @NotNull String doTestMethodName) {
        this.rootFile = rootFile;
        this.filenamePattern = filenamePattern;
        this.doTestMethodName = doTestMethodName;
        this.testClassName = StringUtil.capitalize(TestGeneratorUtil.escapeForJavaIdentifier(rootFile.getName()));
    }

    @NotNull
    @Override
    public final Collection<TestClassModel> getInnerTestClasses() {
        return Collections.emptyList();
    }

    @NotNull
    @Override
    public Collection<TestMethodModel> getTestMethods() {
        if (testMethods == null) {
            final List<TestMethodModel> result = Lists.newArrayList();

            result.add(new TestAllFilesPresentMethodModel());

            FileUtil.processFilesRecursively(rootFile, new Processor<File>() {
                @Override
                public boolean process(File file) {
                    if (!file.isDirectory() && filenamePattern.matcher(file.getName()).matches()) {
                        result.addAll(getTestMethodsFromFile(file));
                    }

                    return true;
                }
            });

            testMethods = result;
        }

        return testMethods;
    }

    protected Collection<TestMethodModel> getTestMethodsFromFile(File file) {
        return Collections.<TestMethodModel>singletonList(new SimpleTestMethodModel(rootFile, file, doTestMethodName, filenamePattern));
    }

    @Override
    public boolean isEmpty() {
        // There's always one test for checking if all tests are present
        return getTestMethods().size() <= 1;
    }

    @Override
    public String getDataString() {
        return JetTestUtils.getFilePath(rootFile);
    }

    @Override
    public String getName() {
        return testClassName;
    }

    private class TestAllFilesPresentMethodModel implements TestMethodModel {
        @Override
        public String getName() {
            return "testAllFilesPresentIn" + testClassName;
        }

        @Override
        public void generateBody(@NotNull Printer p, @NotNull String generatorClassFqName) {
            String assertTestsPresentStr = String.format(
                    "JetTestUtils.assertAllTestsPresentInSingleGeneratedClass(this.getClass(), \"%s\", new File(\"%s\"), Pattern.compile(\"%s\"));",
                    generatorClassFqName, JetTestUtils.getFilePath(rootFile), StringUtil.escapeStringCharacters(filenamePattern.pattern()));
            p.println(assertTestsPresentStr);
        }

        @Override
        public String getDataString() {
            return null;
        }
    }
}