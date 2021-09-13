class SistemaInterno {

    fun validaEntrada(admin: FuncionarioAdmin, senha: Int){
        if(admin.autentica(senha)){
            println("Bem Vindo ao ByteBank")
        }else
        {
            println("Acesso Negado")
        }


    }

}