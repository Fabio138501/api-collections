package one.digitalinnovation.collection

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )
    println("_________________________________")
    println(salarios.somatorio())

    println("_________________________________")
    println(salarios.media())
}