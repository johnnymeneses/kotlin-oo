open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double) {

//    open val bonificacao: Double
//        get() {
//            return salario * 0.1
//        }

    open val bonificacao: Double get() =  salario * 0.1



    fun autentica(senha: Int): Boolean{
        val senhaCorreta=1234

        return senha == senhaCorreta

    }

}

