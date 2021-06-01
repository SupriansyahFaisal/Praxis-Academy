fun sum (a:Int,b: Int):Int {
    val total = a + b
    return total
}

fun perkalian(a:Int,b:Int,c: Int):Int {
    val total1 = a*b+c
    return total1
}

fun main() {
    val result = sum( 200,200)
    println(result)
    println(perkalian(19,29,29))
}