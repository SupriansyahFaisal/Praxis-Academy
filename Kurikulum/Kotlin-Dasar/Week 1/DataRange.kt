fun main() {
    //val range = 0..1000
    val range = 100 downTo 0 step 2
    println(range)
    println(range.count())
    println(range.contains(50))
    println(range.last)
    println(range.first)
    println(range.step)

    //count() = Mendapatkan total di range
    //contains(value) = mengecek apakah terdapat value tersebut
    //first = mendapatkan nilai awal
    //last = mendapatkan nilai akhir
    //step = mendapatkan nilai kenaikannya

}