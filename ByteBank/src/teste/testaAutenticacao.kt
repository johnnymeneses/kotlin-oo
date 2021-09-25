import modelos.Cliente
import modelos.Diretor
import modelos.Gerente
import modelos.SistemaInterno

fun testaAutenticacao() {

    val funcDiretor = Diretor("modelos.Diretor", "34443", 1000.0, 1234, 500.0)

    val funcGerente = Gerente("modelos.Gerente", "55445", 1000.0, 5678)

    val cliente = Cliente("modelos.Cliente","23443",556655)

    val acesso = SistemaInterno()

    print("Acesso modelos.Diretor: ")
    acesso.validaEntrada(funcDiretor, 1234)
    println("")

    print("Acesso modelos.Gerente: ")
    acesso.validaEntrada(funcGerente,5678)
    println("")

    print("Acesso modelos.Cliente: ")
    acesso.validaEntrada(cliente,556655)
    println("")




}


