
fun testaAutenticacao() {

    val funcDiretor = Diretor("Diretor", "34443", 1000.0, 1234, 500.0)

    val funcGerente = Gerente("Gerente", "55445", 1000.0, 5678)

    val cliente = Cliente("Cliente","23443",556655)

    val acesso = SistemaInterno()

    print("Acesso Diretor: ")
    acesso.validaEntrada(funcDiretor, 1234)
    println("")

    print("Acesso Gerente: ")
    acesso.validaEntrada(funcGerente,5678)
    println("")

    print("Acesso Cliente: ")
    acesso.validaEntrada(cliente,556655)
    println("")




}


