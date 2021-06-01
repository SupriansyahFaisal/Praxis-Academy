fun Hello(){
    println("Hello World")
}
fun Dua(nilai1: Int):Int{
    var hasil= 1
    for (i in nilai1 downTo 1){
        hasil *= i
    }
    return hasil
}
fun Satu(){

}
fun main() {
    Hello()
   println(Dua(8))
}