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
                if (i <= 5) {
                        println("Terminou")
                } else {
                        throw SaldoInsuficienteException()
                }
                //val endereco = Any()

        }
}
//Toda Exception deriva da classe Throwable
class SaldoInsuficienteException: Throwable ()
{}














