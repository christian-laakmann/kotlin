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

package org.jetbrains.jet.plugin.codeInsight.surroundWith;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestSuite;

import java.io.File;
import java.util.regex.Pattern;
import org.jetbrains.jet.JetTestUtils;
import org.jetbrains.jet.test.InnerTestClasses;
import org.jetbrains.jet.test.TestMetadata;

import org.jetbrains.jet.plugin.codeInsight.surroundWith.AbstractSurroundWithTest;

/** This class is generated by {@link org.jetbrains.jet.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@InnerTestClasses({SurroundWithTestGenerated.If.class, SurroundWithTestGenerated.IfElse.class, SurroundWithTestGenerated.Not.class, SurroundWithTestGenerated.Parentheses.class, SurroundWithTestGenerated.StringTemplate.class, SurroundWithTestGenerated.When.class, SurroundWithTestGenerated.TryCatch.class, SurroundWithTestGenerated.TryCatchFinally.class, SurroundWithTestGenerated.TryFinally.class, SurroundWithTestGenerated.FunctionLiteral.class})
public class SurroundWithTestGenerated extends AbstractSurroundWithTest {
    @TestMetadata("idea/testData/codeInsight/surroundWith/if")
    @InnerTestClasses({If.MoveDeclarationsOut.class})
    public static class If extends AbstractSurroundWithTest {
        public void testAllFilesPresentInIf() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/if"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("block.kt")
        public void testBlock() throws Exception {
            doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/block.kt");
        }
        
        @TestMetadata("severalStatements.kt")
        public void testSeveralStatements() throws Exception {
            doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/severalStatements.kt");
        }
        
        @TestMetadata("singleStatement.kt")
        public void testSingleStatement() throws Exception {
            doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/singleStatement.kt");
        }
        
        @TestMetadata("singleStatementAtCaret.kt")
        public void testSingleStatementAtCaret() throws Exception {
            doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/singleStatementAtCaret.kt");
        }
        
        @TestMetadata("variable.kt")
        public void testVariable() throws Exception {
            doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/variable.kt");
        }
        
        @TestMetadata("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut")
        @InnerTestClasses({MoveDeclarationsOut.Class.class, MoveDeclarationsOut.Function.class, MoveDeclarationsOut.Object.class, MoveDeclarationsOut.Order.class, MoveDeclarationsOut.Val.class, MoveDeclarationsOut.Var.class})
        public static class MoveDeclarationsOut extends AbstractSurroundWithTest {
            public void testAllFilesPresentInMoveDeclarationsOut() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/class")
            public static class Class extends AbstractSurroundWithTest {
                public void testAllFilesPresentInClass() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/class"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("classInType.kt")
                public void testClassInType() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/class/classInType.kt");
                }
                
                @TestMetadata("localClass.kt")
                public void testLocalClass() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/class/localClass.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/function")
            public static class Function extends AbstractSurroundWithTest {
                public void testAllFilesPresentInFunction() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/function"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("firstChildLocalFun.kt")
                public void testFirstChildLocalFun() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/function/firstChildLocalFun.kt");
                }
                
                @TestMetadata("localFun.kt")
                public void testLocalFun() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/function/localFun.kt");
                }
                
                @TestMetadata("unusedLocalFun.kt")
                public void testUnusedLocalFun() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/function/unusedLocalFun.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/object")
            public static class Object extends AbstractSurroundWithTest {
                public void testAllFilesPresentInObject() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/object"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("localObject.kt")
                public void testLocalObject() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/object/localObject.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/order")
            public static class Order extends AbstractSurroundWithTest {
                public void testAllFilesPresentInOrder() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/order"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("twoClasses.kt")
                public void testTwoClasses() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/order/twoClasses.kt");
                }
                
                @TestMetadata("valAndClass.kt")
                public void testValAndClass() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/order/valAndClass.kt");
                }
                
                @TestMetadata("valOrder.kt")
                public void testValOrder() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/order/valOrder.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/val")
            public static class Val extends AbstractSurroundWithTest {
                public void testAllFilesPresentInVal() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/val"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("fullQualifiedType.kt")
                public void testFullQualifiedType() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/val/fullQualifiedType.kt");
                }
                
                @TestMetadata("fullQualifiedTypeWithoutTypeRef.kt")
                public void testFullQualifiedTypeWithoutTypeRef() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/val/fullQualifiedTypeWithoutTypeRef.kt");
                }
                
                @TestMetadata("valWithTypeWithInitializer.kt")
                public void testValWithTypeWithInitializer() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/val/valWithTypeWithInitializer.kt");
                }
                
                @TestMetadata("valWithTypeWoInitializer.kt")
                public void testValWithTypeWoInitializer() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/val/valWithTypeWoInitializer.kt");
                }
                
                @TestMetadata("valWoTypeWithInitializer.kt")
                public void testValWoTypeWithInitializer() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/val/valWoTypeWithInitializer.kt");
                }
                
            }
            
            @TestMetadata("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/var")
            @InnerTestClasses({Var.DefaultValue.class})
            public static class Var extends AbstractSurroundWithTest {
                public void testAllFilesPresentInVar() throws Exception {
                    JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/var"), Pattern.compile("^(.+)\\.kt$"), true);
                }
                
                @TestMetadata("varWithNotNullableTypeWithInitializer.kt")
                public void testVarWithNotNullableTypeWithInitializer() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/varWithNotNullableTypeWithInitializer.kt");
                }
                
                @TestMetadata("varWithTypeWoInitializer.kt")
                public void testVarWithTypeWoInitializer() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/varWithTypeWoInitializer.kt");
                }
                
                @TestMetadata("varWoTypeWithInitializer.kt")
                public void testVarWoTypeWithInitializer() throws Exception {
                    doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/varWoTypeWithInitializer.kt");
                }
                
                @TestMetadata("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/defaultValue")
                public static class DefaultValue extends AbstractSurroundWithTest {
                    public void testAllFilesPresentInDefaultValue() throws Exception {
                        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/defaultValue"), Pattern.compile("^(.+)\\.kt$"), true);
                    }
                    
                    @TestMetadata("boolean.kt")
                    public void testBoolean() throws Exception {
                        doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/defaultValue/boolean.kt");
                    }
                    
                    @TestMetadata("nullable.kt")
                    public void testNullable() throws Exception {
                        doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/defaultValue/nullable.kt");
                    }
                    
                    @TestMetadata("primitiveNumbers.kt")
                    public void testPrimitiveNumbers() throws Exception {
                        doTestWithIfSurrounder("idea/testData/codeInsight/surroundWith/if/moveDeclarationsOut/var/defaultValue/primitiveNumbers.kt");
                    }
                    
                }
                
                public static Test innerSuite() {
                    TestSuite suite = new TestSuite("Var");
                    suite.addTestSuite(Var.class);
                    suite.addTestSuite(DefaultValue.class);
                    return suite;
                }
            }
            
            public static Test innerSuite() {
                TestSuite suite = new TestSuite("MoveDeclarationsOut");
                suite.addTestSuite(MoveDeclarationsOut.class);
                suite.addTestSuite(Class.class);
                suite.addTestSuite(Function.class);
                suite.addTestSuite(Object.class);
                suite.addTestSuite(Order.class);
                suite.addTestSuite(Val.class);
                suite.addTest(Var.innerSuite());
                return suite;
            }
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("If");
            suite.addTestSuite(If.class);
            suite.addTest(MoveDeclarationsOut.innerSuite());
            return suite;
        }
    }
    
    @TestMetadata("idea/testData/codeInsight/surroundWith/ifElse")
    public static class IfElse extends AbstractSurroundWithTest {
        public void testAllFilesPresentInIfElse() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/ifElse"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("block.kt")
        public void testBlock() throws Exception {
            doTestWithIfElseSurrounder("idea/testData/codeInsight/surroundWith/ifElse/block.kt");
        }
        
        @TestMetadata("moveDeclarationsOutVal.kt")
        public void testMoveDeclarationsOutVal() throws Exception {
            doTestWithIfElseSurrounder("idea/testData/codeInsight/surroundWith/ifElse/moveDeclarationsOutVal.kt");
        }
        
        @TestMetadata("moveDeclarationsOutVar.kt")
        public void testMoveDeclarationsOutVar() throws Exception {
            doTestWithIfElseSurrounder("idea/testData/codeInsight/surroundWith/ifElse/moveDeclarationsOutVar.kt");
        }
        
        @TestMetadata("severalStatements.kt")
        public void testSeveralStatements() throws Exception {
            doTestWithIfElseSurrounder("idea/testData/codeInsight/surroundWith/ifElse/severalStatements.kt");
        }
        
        @TestMetadata("singleStatement.kt")
        public void testSingleStatement() throws Exception {
            doTestWithIfElseSurrounder("idea/testData/codeInsight/surroundWith/ifElse/singleStatement.kt");
        }
        
        @TestMetadata("singleStatementAtCaret.kt")
        public void testSingleStatementAtCaret() throws Exception {
            doTestWithIfElseSurrounder("idea/testData/codeInsight/surroundWith/ifElse/singleStatementAtCaret.kt");
        }
        
        @TestMetadata("variable.kt")
        public void testVariable() throws Exception {
            doTestWithIfElseSurrounder("idea/testData/codeInsight/surroundWith/ifElse/variable.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/surroundWith/not")
    public static class Not extends AbstractSurroundWithTest {
        public void testAllFilesPresentInNot() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/not"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("booleanExpr.kt")
        public void testBooleanExpr() throws Exception {
            doTestWithNotSurrounder("idea/testData/codeInsight/surroundWith/not/booleanExpr.kt");
        }
        
        @TestMetadata("booleanExprAtCaret.kt")
        public void testBooleanExprAtCaret() throws Exception {
            doTestWithNotSurrounder("idea/testData/codeInsight/surroundWith/not/booleanExprAtCaret.kt");
        }
        
        @TestMetadata("expressionInIf.kt")
        public void testExpressionInIf() throws Exception {
            doTestWithNotSurrounder("idea/testData/codeInsight/surroundWith/not/expressionInIf.kt");
        }
        
        @TestMetadata("notExpression.kt")
        public void testNotExpression() throws Exception {
            doTestWithNotSurrounder("idea/testData/codeInsight/surroundWith/not/notExpression.kt");
        }
        
        @TestMetadata("severalExpr.kt")
        public void testSeveralExpr() throws Exception {
            doTestWithNotSurrounder("idea/testData/codeInsight/surroundWith/not/severalExpr.kt");
        }
        
        @TestMetadata("severalExprAtCaret.kt")
        public void testSeveralExprAtCaret() throws Exception {
            doTestWithNotSurrounder("idea/testData/codeInsight/surroundWith/not/severalExprAtCaret.kt");
        }
        
        @TestMetadata("variable.kt")
        public void testVariable() throws Exception {
            doTestWithNotSurrounder("idea/testData/codeInsight/surroundWith/not/variable.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/surroundWith/parentheses")
    @InnerTestClasses({Parentheses.NotApplicable.class})
    public static class Parentheses extends AbstractSurroundWithTest {
        public void testAllFilesPresentInParentheses() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/parentheses"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("expr.kt")
        public void testExpr() throws Exception {
            doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/expr.kt");
        }
        
        @TestMetadata("inIf.kt")
        public void testInIf() throws Exception {
            doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/inIf.kt");
        }
        
        @TestMetadata("partOfExpr.kt")
        public void testPartOfExpr() throws Exception {
            doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/partOfExpr.kt");
        }
        
        @TestMetadata("idea/testData/codeInsight/surroundWith/parentheses/notApplicable")
        public static class NotApplicable extends AbstractSurroundWithTest {
            public void testAllFilesPresentInNotApplicable() throws Exception {
                JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/parentheses/notApplicable"), Pattern.compile("^(.+)\\.kt$"), true);
            }
            
            @TestMetadata("if.kt")
            public void testIf() throws Exception {
                doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/notApplicable/if.kt");
            }
            
            @TestMetadata("import.kt")
            public void testImport() throws Exception {
                doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/notApplicable/import.kt");
            }
            
            @TestMetadata("importQualifiedFirst.kt")
            public void testImportQualifiedFirst() throws Exception {
                doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/notApplicable/importQualifiedFirst.kt");
            }
            
            @TestMetadata("importQualifiedSecond.kt")
            public void testImportQualifiedSecond() throws Exception {
                doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/notApplicable/importQualifiedSecond.kt");
            }
            
            @TestMetadata("packageName.kt")
            public void testPackageName() throws Exception {
                doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/notApplicable/packageName.kt");
            }
            
            @TestMetadata("parameterName.kt")
            public void testParameterName() throws Exception {
                doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/notApplicable/parameterName.kt");
            }
            
            @TestMetadata("parameterWithType.kt")
            public void testParameterWithType() throws Exception {
                doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/notApplicable/parameterWithType.kt");
            }
            
            @TestMetadata("qualifiedExpressionSecond.kt")
            public void testQualifiedExpressionSecond() throws Exception {
                doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/notApplicable/qualifiedExpressionSecond.kt");
            }
            
            @TestMetadata("qualifiedExpressionSecondWithBracket.kt")
            public void testQualifiedExpressionSecondWithBracket() throws Exception {
                doTestWithParenthesesSurrounder("idea/testData/codeInsight/surroundWith/parentheses/notApplicable/qualifiedExpressionSecondWithBracket.kt");
            }
            
        }
        
        public static Test innerSuite() {
            TestSuite suite = new TestSuite("Parentheses");
            suite.addTestSuite(Parentheses.class);
            suite.addTestSuite(NotApplicable.class);
            return suite;
        }
    }
    
    @TestMetadata("idea/testData/codeInsight/surroundWith/stringTemplate")
    public static class StringTemplate extends AbstractSurroundWithTest {
        public void testAllFilesPresentInStringTemplate() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/stringTemplate"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("multiExpression.kt")
        public void testMultiExpression() throws Exception {
            doTestWithStringTemplateSurrounder("idea/testData/codeInsight/surroundWith/stringTemplate/multiExpression.kt");
        }
        
        @TestMetadata("multiExpressionConstant.kt")
        public void testMultiExpressionConstant() throws Exception {
            doTestWithStringTemplateSurrounder("idea/testData/codeInsight/surroundWith/stringTemplate/multiExpressionConstant.kt");
        }
        
        @TestMetadata("singleConstant.kt")
        public void testSingleConstant() throws Exception {
            doTestWithStringTemplateSurrounder("idea/testData/codeInsight/surroundWith/stringTemplate/singleConstant.kt");
        }
        
        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            doTestWithStringTemplateSurrounder("idea/testData/codeInsight/surroundWith/stringTemplate/singleExpression.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/surroundWith/when")
    public static class When extends AbstractSurroundWithTest {
        public void testAllFilesPresentInWhen() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/when"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("enum.kt")
        public void testEnum() throws Exception {
            doTestWithWhenSurrounder("idea/testData/codeInsight/surroundWith/when/enum.kt");
        }
        
        @TestMetadata("multiExpression.kt")
        public void testMultiExpression() throws Exception {
            doTestWithWhenSurrounder("idea/testData/codeInsight/surroundWith/when/multiExpression.kt");
        }
        
        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            doTestWithWhenSurrounder("idea/testData/codeInsight/surroundWith/when/singleExpression.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/surroundWith/tryCatch")
    public static class TryCatch extends AbstractSurroundWithTest {
        public void testAllFilesPresentInTryCatch() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/tryCatch"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("moveDeclarationsOut.kt")
        public void testMoveDeclarationsOut() throws Exception {
            doTestWithTryCatchSurrounder("idea/testData/codeInsight/surroundWith/tryCatch/moveDeclarationsOut.kt");
        }
        
        @TestMetadata("multiExpression.kt")
        public void testMultiExpression() throws Exception {
            doTestWithTryCatchSurrounder("idea/testData/codeInsight/surroundWith/tryCatch/multiExpression.kt");
        }
        
        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            doTestWithTryCatchSurrounder("idea/testData/codeInsight/surroundWith/tryCatch/singleExpression.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/surroundWith/tryCatchFinally")
    public static class TryCatchFinally extends AbstractSurroundWithTest {
        public void testAllFilesPresentInTryCatchFinally() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/tryCatchFinally"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("multiExpression.kt")
        public void testMultiExpression() throws Exception {
            doTestWithTryCatchFinallySurrounder("idea/testData/codeInsight/surroundWith/tryCatchFinally/multiExpression.kt");
        }
        
        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            doTestWithTryCatchFinallySurrounder("idea/testData/codeInsight/surroundWith/tryCatchFinally/singleExpression.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/surroundWith/tryFinally")
    public static class TryFinally extends AbstractSurroundWithTest {
        public void testAllFilesPresentInTryFinally() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/tryFinally"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("multiExpression.kt")
        public void testMultiExpression() throws Exception {
            doTestWithTryFinallySurrounder("idea/testData/codeInsight/surroundWith/tryFinally/multiExpression.kt");
        }
        
        @TestMetadata("singleExpression.kt")
        public void testSingleExpression() throws Exception {
            doTestWithTryFinallySurrounder("idea/testData/codeInsight/surroundWith/tryFinally/singleExpression.kt");
        }
        
    }
    
    @TestMetadata("idea/testData/codeInsight/surroundWith/functionLiteral")
    public static class FunctionLiteral extends AbstractSurroundWithTest {
        public void testAllFilesPresentInFunctionLiteral() throws Exception {
            JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), "org.jetbrains.jet.generators.tests.TestsPackage", new File("idea/testData/codeInsight/surroundWith/functionLiteral"), Pattern.compile("^(.+)\\.kt$"), true);
        }
        
        @TestMetadata("moveDeclarationsOut.kt")
        public void testMoveDeclarationsOut() throws Exception {
            doTestWithFunctionLiteralSurrounder("idea/testData/codeInsight/surroundWith/functionLiteral/moveDeclarationsOut.kt");
        }
        
        @TestMetadata("multiStatement.kt")
        public void testMultiStatement() throws Exception {
            doTestWithFunctionLiteralSurrounder("idea/testData/codeInsight/surroundWith/functionLiteral/multiStatement.kt");
        }
        
        @TestMetadata("singleStatement.kt")
        public void testSingleStatement() throws Exception {
            doTestWithFunctionLiteralSurrounder("idea/testData/codeInsight/surroundWith/functionLiteral/singleStatement.kt");
        }
        
    }
    
    public static Test suite() {
        TestSuite suite = new TestSuite("SurroundWithTestGenerated");
        suite.addTest(If.innerSuite());
        suite.addTestSuite(IfElse.class);
        suite.addTestSuite(Not.class);
        suite.addTest(Parentheses.innerSuite());
        suite.addTestSuite(StringTemplate.class);
        suite.addTestSuite(When.class);
        suite.addTestSuite(TryCatch.class);
        suite.addTestSuite(TryCatchFinally.class);
        suite.addTestSuite(TryFinally.class);
        suite.addTestSuite(FunctionLiteral.class);
        return suite;
    }
}
