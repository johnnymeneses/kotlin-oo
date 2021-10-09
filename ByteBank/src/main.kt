import br.com.johnny.bytebank.modelo.Conta
import br.com.johnny.bytebank.modelo.Endereco
import java.beans.Expression
import java.lang.ClassCastException
import java.lang.Double.parseDouble
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

    val entrada: String ="3"


//    try{
//        val valor: Double = entrada.toDouble()
//        println("Valor recebido $valor")
//    }catch (e: NumberFormatException){
//        println("Problem na conversão")
//        e.printStackTrace()
//    }

//    val a: Int? = try { parseInt("d")} catch (e: NumberFormatException) {null}

    val valorRecebido: Double? = try{
        entrada.toDouble()
    }catch (e: NumberFormatException){
        println("deu ruim")
        e.printStackTrace()
        null
    }

//    if as expression
    val valorComTaxa: Double? = if(valorRecebido != null){
        valorRecebido+0.1}
    else{
        null
        }


    if(valorComTaxa != null)
    {
        println("valor recebido: $valorRecebido")
    }else {
        println("valor invalido $valorRecebido")
    }







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





