// "Suppress 'UNNECESSARY_NOT_NULL_ASSERTION' for statement " "true"

fun foo() {
    [suppress("UNNECESSARY_NOT_NULL_ASSERTION")]
    [ann] ""<caret>!!
}

annotation class ann