
fun main()
{
    println("Bem vindo ao Byte Bank ")
    println("")

    val funcJ = Funcionario("Johnny","123456",1000.0)
    println("Funcionario ${funcJ.bonificacao}")

    val funcG = Gerente("Gerente","655454",1000.0,4567)
    println("Gerente ${funcG.bonificacao}")

    val funcD = Diretor("Diretor","123456",1000.0,1234,500.0)
    println("Diretor ${funcD.bonificacao}")

    val funcA = Analista("Analista","65465465",1000.0)
    println("Analista ${funcA.bonificacao}")


    val calc = CalculadoraBonificacao()

    calc.registra(funcJ)
    calc.registra(funcG)
    calc.registra(funcD)
    calc.registra(funcA)

    println("Total de Bonificações ${calc.total}")

    //2800
//    println(funcD.autentica(funcD.senha))



}




