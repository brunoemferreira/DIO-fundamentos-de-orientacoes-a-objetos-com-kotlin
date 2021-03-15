package one.digitalinnovation.digionebank

class Pessoa {
    var nome:String = "Bruno"
    var cpf:String = "123.123.456-88"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"

}

fun main() {
    val bruno = Pessoa()

    println(bruno.pessoaInfo())

}