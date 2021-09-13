
fun main()
{

    val gerente = Gerente("Nome Gerente","123456",5000.0,1234)
    val diretor = Diretor("Nome Diretor","9879789",8000.0,1548,850.0)

    val acesso = SistemaInterno()

    acesso.validaEntrada(gerente,12234)
    acesso.validaEntrada(diretor,1548)







//    println("Bem vindo ao Byte Bank ")
//    println("")
//
//    val cp= contaPoupanca("Johnnyy", 1234,5678)
//    val cc = contaCorrente("Eder", 5678, 1234)
//
////    cp.depositaRecurso(50.0)
////    cc.depositaRecurso(50.0)
//
//    println("Saldo Conta Poupança ${cp.saldo}")
//    println("Saldo Conta Corrente ${cc.saldo}")
//
//
//    cp.sacarRecurso(10.0)
//    cc.sacarRecurso(10.0)
//
//    println("Novo Saldo Conta Poupança ${cp.saldo}")
//    println("NOvo Saldo Conta Corrente ${cc.saldo}")

//    cp.transfereRecurso(50.0,cc)
//
//    println("Novo Saldo Conta Poupança ${cp.saldo}")
//    println("NOvo Saldo Conta Corrente ${cc.saldo}")




}





