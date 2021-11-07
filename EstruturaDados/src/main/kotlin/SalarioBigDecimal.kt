import java.math.BigDecimal
import java.math.RoundingMode

fun SalarioBigDecimal() {

    println("Salario Big Decimal")



    //To.do funcionŕio deve ter um auvmento de 10%. Se o aumento for menor que R$500,00.. cravar o valor em R$ 500,00
    val salarioEmpresa = bigDecimalArrayOf("3000.0","4000.0","5000.0","6000.0","7000.0")

    //Aumento de 10%
    //Aumento de R$ 500,003
    //Somente dois valores depois da virgula e arrendondar pra cima

    val aumento = "1.1".toBigDecimal() //Aumento de 10%
    val salarioAumento: Array<BigDecimal> = salarioEmpresa
//        .map {salarioEmpresa -> (salarioEmpresa * aumento).setScale(2,RoundingMode.UP)} Opção para tudo
        .map { salarioEmpresa ->
            if(salarioEmpresa<"5000.0".toBigDecimal())
            {
                salarioEmpresa+"500.0".toBigDecimal()
            }else{
                (salarioEmpresa * aumento).setScale(2,RoundingMode.UP)
            }
        }
        .toTypedArray()



    println(salarioEmpresa.contentToString())
    println(salarioAumento.contentToString())


}



//Criando o Array de Forma Dinâmica
//vararg: parãmetro variável (tipo especial do kotlin que vc consegue passar arumentos variaveis)
fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal>{
    return Array<BigDecimal>(valores.size) {i ->
        valores[i].toBigDecimal() //Pegando cada valor desse elemnto, acessando pelo indice i e convertendo pra BigDecimal
    }

}

fun exemploEstatico (){
    //    Array com tipo genérico. Para fazer Array do tipo BigDecima, precisa usar essa estratégia

    val salarios = Array<BigDecimal> (5) { BigDecimal.ONE } //Constante para inializar o Array em Zero

    salarios[0] = "1500.55".toBigDecimal() //Usar string para evitar arredondamento. Depois converter pra BigDecimal
    salarios[1] = "2500.25".toBigDecimal()
    //É preciso converter cada item para o BigDecimal.

    println(salarios.contentToString())

}

fun exemploDinamico(){

    //Usando a função que converte pra BigDecimal de forma dinâmica
    val salariosDinamico = bigDecimalArrayOf("3500.0","2500.0","8500.0","500.0")
    println(salariosDinamico.contentToString())

}