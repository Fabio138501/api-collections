package one.digitalinnovation.collection

fun main() {
    val nomes = Array(3) {""}
    nomes[0] = "Maria"
    nomes[1] = "Pedro"
    nomes[2] = "Jose"

    for (nome in nomes){
        println(nome)
    }

    println("_____________________________________________________")
    nomes.sort()
    nomes.forEach { println(it)
    }
    println("_____________________________________________________")
    val nomes2 = arrayOf("Maria", "Andre", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it)}


}
