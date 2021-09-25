package modelos

class Cliente (
    val nome:String,
    val cpf: String,
    val senha: Int
        ) : IAutenticavel {

    override fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}