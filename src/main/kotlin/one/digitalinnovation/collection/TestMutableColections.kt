package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 5000.0, tipoContratacao = "CLT")
    val fabio = Funcionario("Fabio", 1000.0, tipoContratacao = "PJ")
    val maria = Funcionario("Maria", 500.0, tipoContratacao = "CLT")

    val funcionarios = mutableListOf(joao, maria)

    funcionarios.forEach{println(it)}
    println("---------------------------list----------------------------------------")
    funcionarios.add(fabio)
    funcionarios.forEach{println(it)}

    println("-------------------------------------------------------------------")
    funcionarios.remove(fabio)
    funcionarios.forEach{println(it)}
    println("---------------------------set----------------------------------------")
    val funcionarioSet = mutableSetOf(joao)
}