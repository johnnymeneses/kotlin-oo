package secao14

// Uma interface define um contrato, quem herda deve assinar

interface Maquina{
    fun ligar()
}

class Computador: Maquina{
    override fun ligar() {
        TODO("Not yet implemented")
    }

}


fun mainInterface(){
    println("Interfaces")

}