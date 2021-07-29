package one.digitalinnovation.collection

fun main() {
    val João = funcionario("João", 5000.0)
    val Fabio = funcionario("Fabio", 1000.0)
    val Maria = funcionario("Maria", 500.0)
    val funcionarios = listOf(João, Fabio, Maria )

    funcionarios.forEach { println(it) }
    println("____________________________________________")

    println(funcionarios.find { it.nome == "Maria" })

    println("____________________________________________")

    funcionarios
    .sortedBy { it.salario }
    .forEach { println(it) }

}

data class funcionario (
    val nome: String,
    val salario: Double
)




