fun main() {
    val finalexam = "a"

    when (finalexam){
        "a" -> {println("Perfect")}
        "b" -> {println("Great")}
        "c" -> {println("cool")}
        "d" -> {println("bad")}
        else -> {
            println("salah kelas kamu")
        }
    }

    when (finalexam){
        "a","b","c" -> {
            println("Anda lulus")
        } else -> {
            println("Anda tidak Lulus")
        }
    }

    val passvalue = arrayOf("a","b","c")
        when (finalexam){
            in passvalue -> println("Anda lulus")
            !in passvalue -> println("Anda Tidak lulus")
        }
}