///Inicializacao taria

class Pessoa{

    //Property must be initialized or be abstract (sem o lateinit)
    lateinit var nome: String

    fun geradorDeNome(){
        nome = "eoeoekoke"
    }

}

fun iniciaTardia() {

    val p = Pessoa()
    p.geradorDeNome()
}