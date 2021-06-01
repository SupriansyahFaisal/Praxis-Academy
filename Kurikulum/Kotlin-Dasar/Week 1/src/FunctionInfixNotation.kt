infix fun String.to(type:String):String{
    if (type =="UP"){
        return this.toUpperCase()
    } else{
        return this.toLowerCase()
    }
}

fun main() {
    val result = "Muhammad Faisal supriansyah".to("UP")
    println(result)
    val result1 = "Muhammad Faisal supriansyah".to("dd")
    println(result1)
}