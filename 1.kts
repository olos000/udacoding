main hitung(){
    val angka = tampilkan(80.0, 90.0)
    println(angka)


    fun tampilkan(hasil1: double, hasil2: double): String = """
    Nilai 1: $hasil1
    Nilai 2: $hasil2
    
""".trimIndent()
}