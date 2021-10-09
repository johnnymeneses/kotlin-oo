import br.com.johnny.bytebank.modelo.Conta
import br.com.johnny.bytebank.modelo.Endereco


fun main()
{
//    println("Bem vindo ao BytBank - Kotlin Edition. ")


//    testaFuncionarios()
//    testaAutenticacao()
//    testaContas()
//    testaEndereco()
//    testaCodigoNovo()
//    testaCriaContas()

    mainTeste()


}

fun mainTeste(){
    println("início da main")
    funcao1()
    println("fim da main")
}


fun funcao1(){
    println("início da funcao1")
    funcao2()
    println("fim da funcao1")

}
fun funcao2(){
    println("início da funcao2")
    for (i in 1..5){
        println(i)

        val endereco = Any()
        endereco as Endereco
    }

    println("fim da funcao2")

}





