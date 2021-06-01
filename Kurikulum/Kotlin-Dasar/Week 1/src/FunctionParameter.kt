fun sayHello(firstname: String, lastname: String?){
    if (lastname == null) {
        println("Hello $firstname")
    }else {
        println("Hello $firstname $lastname")
    }

}
fun main() {
    sayHello("Faisal","Supriansyah")
    sayHello("Faisal",null)
    sayHello("Faisal","supriansyah")
}