fun main() {
    fun SayHello(name: String = ""): String {
        return when (name) {
            ""  ->"Hello World"
            else -> "Hello $name"
        }
    }
    println(SayHello("Muhammad Faisal supriansyah"))
    println(SayHello())
}