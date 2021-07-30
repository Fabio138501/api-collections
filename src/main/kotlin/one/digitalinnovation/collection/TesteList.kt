package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 5000.0, tipoContratacao = "CLT")
    val fabio = Funcionario("Fabio", 1000.0, tipoContratacao = "PJ")
    val maria = Funcionario("Maria", 500.0, tipoContratacao = "CLT")
    val funcionarios = listOf(joao, fabio, maria )

    funcionarios.forEach { println(it) }
    println("____________________________________________")

    println(funcionarios.find { it.nome == "Maria" })

    println("____________________________________________")

    funcionarios
    .groupBy { it.tipoContratacao }
    .forEach { println(it) }
}

data class Funcionario (
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
)




