//Mamifero - Animal

abstract class Mamifero(var nome:String){ // Cla
    abstract fun falar()

    open fun dormir(){
        println("Zzz....")
    }
}

class Cachorro (nome:String) : Mamifero (nome){
    override fun falar() {
        println("au au")
    }


}

class Gato (nome:String): Mamifero (nome){
    override fun falar() {
        println("miau miau")
    }

    override fun dormir() {
        println("ZZZ.... miau miau")
    }
}



fun mainAbstrato(){

    val bolinha = Cachorro("Bolinha")
    println("Cachorro ${bolinha.nome}")
    Cachorro("Bolt").falar()
    bolinha.dormir()

    val bilbo = Gato("Bilbo")
    println("Gato ${bilbo.nome}")


    Gato("Consuelo").falar()
    bilbo.dormir()


}