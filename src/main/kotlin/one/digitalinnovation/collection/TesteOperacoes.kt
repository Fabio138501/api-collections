package one.digitalinnovation.collection

fun main() {
    val salarios = doubleArrayOf(5000.0, 1000.0, 500.0)
    for (salario in salarios) {
        println(salario)
    }

    println("-----------------------------------------------")
    println("Maior salário é ${salarios.maxOrNull()} ")
    println("Menor salário é ${salarios.minOrNull()} ")
    println("Média salarial é ${salarios.average()} ")

    val salariomaior2500 = salarios.filter { it > 2500.0 }
    println("-----------------------------------------------")
    salariomaior2500.forEach{ println(it) }
    println("-----------------------------------------------")
    println(salarios.count{it in 500.0..4000.0})

    println("-----------------------------------------------")
    println(salarios.find{it == 500.0})

    println("-----------------------------------------------")
    println(salarios.any(){it == 5000.0})
}