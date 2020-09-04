package br.com.digitalhouse.kotlino

fun main(){
    val brasileiro = Pessoa("Bruno", "ribeiro")
    println("O brasileiro é ${brasileiro.nome} e tem a idade: ${brasileiro.sobreNome}")

    brasileiro.nome = "Gilberto"
    println("O brasileiro é ${brasileiro.nome}")
    //---------------------------------------------------------------------------------


    val cachorro = Cachorro("Bidu", 6, "Golden")
    println("O nome do cachorro é ${cachorro.nome}")
    println("A raça do cachorro é ${cachorro.raca}")

}