data class A(val x: Int) {
  fun toString(): String = "!"
}

fun box(): String {
  return if (A(0).toString() == "!") "OK" else "fail"
}