fun main() {

    tailrec fun display(nilai: Int) {
        println(nilai)
        if (nilai > 0) {
            display(nilai - 1)
        }
    }
    display(8) 
}