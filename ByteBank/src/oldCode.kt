//class oldCode
//{
//    fun main()
//    {
//        byteBank()
//
//
//
//
//    }
//
//
//    fun testaContas() {
//
//        println("Bem vindo ao Byte Bank ")
//        println("")
//
//        val cp= contaPoupanca("Johnnyy", 1234,5678)
////        val cc = contaCorrente("Eder", 5678, 1234)
//
////    cp.depositaRecurso(50.0)
////    cc.depositaRecurso(50.0)
//
////        println("Saldo Conta Poupança ${cp.saldo}")
////        println("Saldo Conta Corrente ${cc.saldo}")
////
////
////        cp.sacarRecurso(10.0)
////        cc.sacarRecurso(10.0)
////
////        println("Novo Saldo Conta Poupança ${cp.saldo}")
////        println("NOvo Saldo Conta Corrente ${cc.saldo}")
////
//////        cp.transfereRecurso(50.0,cc)
////
////        println("Novo Saldo Conta Poupança ${cp.saldo}")
////        println("NOvo Saldo Conta Corrente ${cc.saldo}")
//
//    }
//
//
//    fun testaFuncionario()
//    {
////        val funcJ = Funcionario("Johnny","123456",1000.0)
////        println("Funcionario ${funcJ.bonificacao}")
//
//        val funcG = Gerente("Gerente","655454",1000.0,4567)
//        println("Gerente ${funcG.bonificacao}")
//
//        val funcD = Diretor("Diretor","123456",1000.0,1234,500.0)
//        println("Diretor ${funcD.bonificacao}")
//
//        val funcA = Analista("Analista","65465465",1000.0)
//        println("Analista ${funcA.bonificacao}")
//
//        val funcAx = Auxiliar("Auxiliar","65465465",1000.0)
//        println("Auxiliar ${funcA.bonificacao}")
//
//
//
//        val calc = CalculadoraBonificacao()
//
////        calc.registra(funcG)
////        calc.registra(funcD)
//        calc.registra(funcA)
//        calc.registra(funcAx)
//
//        println("Total de Bonificações ${calc.total}")
//
//    }
//
//
//    fun testaAutenticacao(){
//
//        val gerente = Gerente("Nome Gerente","123456",5000.0,1234)
//        val diretor = Diretor("Nome Diretor","9879789",8000.0,1548,850.0)
//
//        val acesso = SistemaInterno()
//
//        acesso.validaEntrada(gerente,12234)
//        acesso.validaEntrada(diretor,1548)
//
//    }
//
//
//    fun testaContaDiferente()
//    {
////        val cp= contaPoupanca("Johnnyy", 1234,5678)
////        val cc = contaCorrente("Eder", 5678, 1234)
////
//////        cp.depositaRecurso(50.0)
//////        cc.depositaRecurso(50.0)
////
////        println("Saldo Conta Poupança ${cp.saldo}")
////        println("Saldo Conta Corrente ${cc.saldo}")
////
////
////        cp.sacarRecurso(10.0)
////        cc.sacarRecurso(10.0)
////
////        println("Novo Saldo Conta Poupança ${cp.saldo}")
////        println("NOvo Saldo Conta Corrente ${cc.saldo}")
////
////        cp.transfereRecurso(50.0,cc)
////
////        println("Novo Saldo Conta Poupança ${cp.saldo}")
////        println("NOvo Saldo Conta Corrente ${cc.saldo}")
//    }
//
//    //Exibir se um numero é par ou impar
//    fun imparPar (a: Int): String
//    {
//        return if(a % 2 ==0) "Par" else "Impar"
//    }
////println(imparPar(21))
//
//
//
//
//    fun byteBank(){
//        println("Bem vindo ao BytBank - Kotlin Edition. ")
//        println("")
//
//        val contaJ =  Conta(titular = "Johnny", numero=12345) //exemplo com labels
//        val contaM = Conta("Maria",65487)
//
//        contaJ.depositaConta(100.0)
//
//
//
//
//        contaM.depositaConta(200.0)
//
//
//
//
//        println("Saldo atual ${contaM.titular}: ${contaJ.saldo}")
//        println("Saldo atual ${contaJ.titular}:  ${contaM.saldo}")
//
//        contaJ.transfereConta(23.0,contaM)
//
//        println("Novo saldo ${contaM.titular}: ${contaJ.saldo}")
//        println("Novo saldo ${contaJ.titular}:  ${contaM.saldo}")
//
//
////    contaJ.saldo = 100.0
//
////
//
////
////    println("Novo Saldo ${contaJ.saldo}")
////
////    contaJ.sacaConta(500.0)
////
////    println("Novo Saldo ${contaJ.saldo}")
//    }
//
//
//
//
//
//
//    class Conta (val titular: String, val numero: Int) {
//
//        var saldo = 0.0
//            private set
//
//
//
//
//
//        fun depositaConta(valor: Double) {
//
//            this.saldo += valor
//        }
//
//        fun sacaConta(valor: Double){
//
//            if(valor > saldo){
//                println("Saldo $saldo. Saque de $valor. Saldo Insuficiente para esta operação")
//                return
//            }else {
//                this.saldo-=valor
//            }
//        }
//
//        fun transfereConta(valor: Double, contaDestino: Conta) {
//
//            if(valor > saldo){
//                println("Saldo $saldo. Transferencia de $valor. Saldo Insuficiente para esta operação")
//                return
//
//            }else {
//                this.saldo-=valor
//                contaDestino.depositaConta(valor)
//                println("Transferencia de $valor realizada com sucesso. Novo saldo $saldo")
//            }
//
//        }
//
//
//
//    }
//
//
//
//
//
//
//}