fun main() {
    var firstname : String = "Muhammad Faisal "
    var lastname : String = "Supriansyah"
    var fullname : String = "$firstname$lastname"

    var address : String = """
        >Kepulauan Riau,Tanjung Pinang,
        >Jalan,Pantai impian,Gang.udang,No.56
        """.trimMargin(">")

    println(firstname+lastname)
    println(address)
    var temp : String = "$fullname \nPanjang = ${fullname.length}"
    print(temp)

}