abstract class FuncionarioAdmin(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: Int) {

//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }

    abstract val bonificacao: Double

    //Implementar função em classe abstrata?
    fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }



}

