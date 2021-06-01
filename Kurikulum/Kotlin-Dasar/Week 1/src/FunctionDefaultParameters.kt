fun hello(firstname : String,lastname : String = ""){
    if (lastname == null ){
        println("Hello $firstname")
    }else {
        println("Hello $firstname $lastname")
    }
}
fun main() {
    hello("Faisal")
    hello("Faisal","Supriansyah")
}