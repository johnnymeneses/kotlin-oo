
fun testaAutenticacao() {

    val acesso = SistemaInterno()

    val funcDiretor = Diretor("Diretor", "34443", 1000.0, 1234, 500.0)

    val funcGerente = Gerente("Gerente", "55445", 1000.0, 5678)

    print("Acesso Diretor: ")

    acesso.validaEntrada(funcDiretor, 3)
    println("")
    print("Acesso Gerente: ")
    acesso.validaEntrada(funcGerente,53678)

}


