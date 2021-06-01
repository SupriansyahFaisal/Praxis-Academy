fun double (a:Int): Int = a

fun hi(name: String) = println("Hi $name")
fun main() {
    var result = double(1)

    while (result <=30){
        hi("Muhammad Faisal Supriansyah Berumur $result")
        result++
    }
}