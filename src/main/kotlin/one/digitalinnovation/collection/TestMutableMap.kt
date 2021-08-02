package one.digitalinnovation.collection

fun main() {
    val joao = Funcionario("João", 5000.0, tipoContratacao = "CLT")
    val fabio = Funcionario("Fabio", 1000.0, tipoContratacao = "PJ")
    val maria = Funcionario("Maria", 500.0, tipoContratacao = "CLT")
    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(fabio.nome, fabio)
    repositorio.create(maria.nome, maria)

    println(repositorio.findById(joao.nome))

    println("--------------------------------------------")
    repositorio.findAll().forEach { println(it)}

    println("--------------------------------------------")
    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it)}
}