package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
       println("${elemento.name} = ${elemento.descricao}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} = ${pf.descricao}")

    // Utilizando o enum
    val pj = ClienteTipo.PF
    println("${pj.name} = ${pj.descricao}")

}