// IGNORE_BACKEND: JS_IR
// EXPECTED_REACHABLE_NODES: 1109
package foo

fun box(): String {
    val a = 23.(fun Int.(a: Int): Int = a * a + this)(3)
    if (a != 32) return "a != 32, a = $a";

    return "OK";
}
