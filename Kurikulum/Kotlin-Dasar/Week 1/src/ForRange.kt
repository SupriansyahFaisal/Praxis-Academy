fun main() {
    val name = arrayOf("Faisal Supriansyah","Ryan Ardiansyah","Eko Dharmansyah")
    val ukuranArray = name.size - 1

    for (i in 0..ukuranArray) {
        println("Index = $i = ${name.get(i)}")

    }
}