
fun main()
{
    println("Bem vindo ao Byte Bank ")
    println("")

    val cp= contaPoupanca("Johnnyy", 1234,5678)
    val cc = contaCorrente("Eder", 5678, 1234)

    cp.depositaRecurso(50.0)
    cc.depositaRecurso(50.0)

    println("Saldo Conta Poupança ${cp.saldo}")
    println("Saldo Conta Corrente ${cc.saldo}")

    cp.sacarRecurso(10.0)
    cc.sacarRecurso(10.0)

    println("Novo Saldo Conta Poupança ${cp.saldo}")
    println("NOvo Saldo Conta Corrente ${cc.saldo}")

    cp.transfereRecurso(50.0,cc)

    println("Novo Saldo Conta Poupança ${cp.saldo}")
    println("NOvo Saldo Conta Corrente ${cc.saldo}")

    //2800
//    println(funcD.autentica(funcD.senha))



}





