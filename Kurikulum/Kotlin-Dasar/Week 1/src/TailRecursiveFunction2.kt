fun main() {
    tailrec fun FactorialTail(nilai: Int, total : Int = 1):Int {
        return when (nilai){
            1 -> total
            else -> FactorialTail(nilai -1, total * nilai )
        }
    }
    println(FactorialTail(10,20))
}