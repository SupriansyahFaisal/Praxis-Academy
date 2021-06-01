fun hasilakhir (name : String, vararg hasil:Int): Int{
    var total = 0
    for (hasil in hasil){
        total += hasil
    }
    total /= hasil.size
    println("Hasil Akhir = $name $total")
    return total;
}

fun akhir (name : String, vararg hasil:Int): Int{
    var total = 0
    for (hasil in hasil){
        total += hasil
    }
    return total
}
fun main() {
    println(hasilakhir("Muhammad Faisal Supriansyah", 20))
    val result = akhir("faisal",10)
    println(result)

}