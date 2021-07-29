package one.digitalinnovation.collection

fun main() {
    val salarios = DoubleArray ( 3)
    salarios[0] = 1000.0
    salarios[1] = 2000.0
    salarios[2] = 4000.0
    salarios.forEach { println(it) }
   // salarios.forEachIndexed {index:Int, salarios ->
     //   salarios[index]= salarios * 1.1
    }
//println(salarios)
