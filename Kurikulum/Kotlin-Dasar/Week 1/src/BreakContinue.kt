fun main() {
    var i = 0
    while (true){
        println("$i")
        i++
        if(i > 10){
            break
        }
    }
    for (i in 1..100){
        if (i % 2 != 1){
            continue
        }
        println("$i")
    }
}