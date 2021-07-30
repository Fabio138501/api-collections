package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 5000.0, tipoContratacao = "CLT")
    val fabio = Funcionario("Fabio", 1000.0, tipoContratacao = "PJ")
    val maria = Funcionario("Maria", 500.0, tipoContratacao = "CLT")
    val funcionarios = listOf(joao, fabio, maria)

    val funcionario1 = setOf(joao, fabio)
    val funcionario2 = setOf(maria)

    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach{(println(it))}
    println("------------------------------------------------------------------")

    val funcionario3 = setOf(joao, fabio, maria)
    val resultSubtract = funcionario3.subtract(funcionario2)
    resultSubtract.forEach{(println(it))}
    println("------------------------------------------------------------------")


    val resultIntersect = funcionario3.intersect(funcionario2)
    resultIntersect.forEach{(println(it))}
    println("------------------------------------------------------------------")

}