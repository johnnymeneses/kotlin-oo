package teste//class oldCode
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
//        val cp= modelos.contaPoupanca("Johnnyy", 1234,5678)
////        val cc = modelos.contaCorrente("Eder", 5678, 1234)
//
////    cp.depositaRecurso(50.0)
////    cc.depositaRecurso(50.0)
//
////        println("Saldo modelos.Conta Poupança ${cp.saldo}")
////        println("Saldo modelos.Conta Corrente ${cc.saldo}")
////
////
////        cp.sacarRecurso(10.0)
////        cc.sacarRecurso(10.0)
////
////        println("Novo Saldo modelos.Conta Poupança ${cp.saldo}")
////        println("NOvo Saldo modelos.Conta Corrente ${cc.saldo}")
////
//////        cp.transfereRecurso(50.0,cc)
////
////        println("Novo Saldo modelos.Conta Poupança ${cp.saldo}")
////        println("NOvo Saldo modelos.Conta Corrente ${cc.saldo}")
//
//    }
//
//
//    fun testaFuncionario()
//    {
////        val funcJ = modelos.Funcionario("Johnny","123456",1000.0)
////        println("modelos.Funcionario ${funcJ.bonificacao}")
//
//        val funcG = modelos.Gerente("modelos.Gerente","655454",1000.0,4567)
//        println("modelos.Gerente ${funcG.bonificacao}")
//
//        val funcD = modelos.Diretor("modelos.Diretor","123456",1000.0,1234,500.0)
//        println("modelos.Diretor ${funcD.bonificacao}")
//
//        val funcA = modelos.Analista("modelos.Analista","65465465",1000.0)
//        println("modelos.Analista ${funcA.bonificacao}")
//
//        val funcAx = modelos.Auxiliar("modelos.Auxiliar","65465465",1000.0)
//        println("modelos.Auxiliar ${funcA.bonificacao}")
//
//
//
//        val calc = modelos.CalculadoraBonificacao()
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
//        val gerente = modelos.Gerente("Nome modelos.Gerente","123456",5000.0,1234)
//        val diretor = modelos.Diretor("Nome modelos.Diretor","9879789",8000.0,1548,850.0)
//
//        val acesso = modelos.SistemaInterno()
//
//        acesso.validaEntrada(gerente,12234)
//        acesso.validaEntrada(diretor,1548)
//
//    }
//
//
//    fun testaContaDiferente()
//    {
////        val cp= modelos.contaPoupanca("Johnnyy", 1234,5678)
////        val cc = modelos.contaCorrente("Eder", 5678, 1234)
////
//////        cp.depositaRecurso(50.0)
//////        cc.depositaRecurso(50.0)
////
////        println("Saldo modelos.Conta Poupança ${cp.saldo}")
////        println("Saldo modelos.Conta Corrente ${cc.saldo}")
////
////
////        cp.sacarRecurso(10.0)
////        cc.sacarRecurso(10.0)
////
////        println("Novo Saldo modelos.Conta Poupança ${cp.saldo}")
////        println("NOvo Saldo modelos.Conta Corrente ${cc.saldo}")
////
////        cp.transfereRecurso(50.0,cc)
////
////        println("Novo Saldo modelos.Conta Poupança ${cp.saldo}")
////        println("NOvo Saldo modelos.Conta Corrente ${cc.saldo}")
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
//        val contaJ =  modelos.Conta(titular = "Johnny", numero=12345) //exemplo com labels
//        val contaM = modelos.Conta("Maria",65487)
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
//    class modelos.Conta (val titular: String, val numero: Int) {
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
//        fun transfereConta(valor: Double, contaDestino: modelos.Conta) {
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