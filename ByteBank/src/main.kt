import br.com.johnny.bytebank.exception.SaldoInsuficienteException
import br.com.johnny.bytebank.modelo.Endereco


fun main() {
        println("Bem vindo ao ByteBank - Kotlin Edition. ")

//    testaFuncionarios()
//    testaAutenticacao()
//    testaContas()
//    testaEndereco()
//    testaCodigoNovo()
//    testaCriaContas()
//    testaTry()
//    testaAny()


        println("Inicio Funcao")
        for (i in 1..5) {
                println(i)
                if (i <= 3) {

                } else {
                        throw SaldoInsuficienteException()
                }

        }
        println("Terminou")
}
















