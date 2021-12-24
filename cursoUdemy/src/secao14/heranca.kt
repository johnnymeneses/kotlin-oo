//Computador pode ser uma especialização de máquina
//um carro pode ser uma maquina
//um trator pode ser uma maquina

//depois de definitir os atributos, adicionar :
//quando vc herda uma classe, vc herda o que a classe pai espera
//a classe pai, para ser herdada precisa da palavra reservada OPEN.


open class Maaquina(val marca: String) {
   open fun minhaMarca() {                          //Para sobrescrever uma função (override) esta precisa estar aberta (fun)
        println("minha marca é $marca")
    }
}

class Computador(marca: String, val nucleos: Int) : Maaquina(marca) {

    fun ligar() {}

    fun processar() {}

    //Override
    override fun minhaMarca() {
       println("Estou reescrevendo minha marca")
//        super.minhaMarca() //Estou me referenciando a classe pai. Minha Marca da classe Herdada
    }

}

fun heranca() {

    val dell = Computador("Dell", 15)

    with(dell) {
        ligar()
        println("liguei")
        processar()

        println("processei...")
        minhaMarca()
    }
}
