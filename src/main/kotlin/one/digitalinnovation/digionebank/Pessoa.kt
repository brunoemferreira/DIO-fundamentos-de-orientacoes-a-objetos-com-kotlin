package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Bruno"
    var cpf:String = "123.123.456-88"
}

fun main() {
    val bruno = Pessoa()

    println(bruno.nome)
    println(bruno.cpf)
}