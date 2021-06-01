fun main() {
    fun FactorialLoop (nilai: Int):Int {
        var result = 1
        for (i in nilai downTo 1 ){
            result *= i
        }
        return result
    }

    fun FactorialRecursive(nilai : Int): Int {
        return when (nilai){
            1 -> 1
            else -> nilai * FactorialRecursive(nilai - 1 )
        }
    }

    println(FactorialLoop(8))
    println(FactorialRecursive(8))
}