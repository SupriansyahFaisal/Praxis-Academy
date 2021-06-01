fun String.hello(): String = "hello $this"
fun String.printhello():Unit= println("hello $this")


fun main() {
    val name: String = "Muhammad Faisal Supriansyah"
    println(name.hello())
    name.hello()
    "Muhammad Faisal supriansyah".printhello()
}