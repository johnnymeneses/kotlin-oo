import java.math.BigDecimal

fun SalarioBigDecimal() {

    println("Salario Big Decimal")

    //To.do funcionŕio deve ter um auvmento de 10%. Se o aumento for menor que R$500,00.. cravar o valor em R$ 500,00

//    Array com tipo genérico. Para fazer Array do tipo BigDecima, precisa usar essa estratégia

    val salarios = Array<BigDecimal> (5) { BigDecimal.ONE } //Constante para inializar o Array em Zero

    salarios[0] = "1500.55".toBigDecimal() //Usar string para evitar arredondamento. Depois converter pra BigDecimal
    salarios[1] = "2500.25".toBigDecimal()

    println(salarios.contentToString())



}