import br.com.johnny.bytebank.modelo.Conta
import br.com.johnny.bytebank.modelo.Endereco
import java.beans.Expression
import java.lang.ClassCastException
import java.lang.Integer.parseInt
import java.lang.NumberFormatException


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
    try{
    funcao2()
    }catch (e: ClassCastException){
        e.printStackTrace()
        println("Deu merda aqui")
    }

    println("fim da funcao1")

}
fun funcao2(){
    println("início da funcao2")
    for (i in 1..5){
        println(i)

//        val endereco = Any()
//        endereco as Endereco
    }




    println("fim da funcao2")


}





