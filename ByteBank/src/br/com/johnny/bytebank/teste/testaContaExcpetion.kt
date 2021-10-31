package br.com.johnny.bytebank.teste

import br.com.johnny.bytebank.exception.SaldoInsuficienteException
import br.com.johnny.bytebank.exception.ValorInvalidoException
import br.com.johnny.bytebank.modelo.Cliente
import modelos.contaCorrente

fun testaContaExcpetion() {

//Cria Conta 1
        val john = Cliente ("johnn","1234578",12345)
        val cc = contaCorrente(john,1234,4444)

//Cria Conta 2
        val maria = Cliente ("Maria","1234578",12345)
        val cc2 = contaCorrente(maria,1234,4444)

//Imprime Saldo
        println("Saldo atual ${john.nome} R$ ${cc.saldo}")
//        println("Saldo atual ${maria.nome} R$ ${cc2.saldo}")


//       Deposito Conta
//        try {
////            cc.depositaRecurso(-500.0) //Valor Inválido
//              cc.depositaRecurso(500.0)
//            println("Novo Saldo ${john.nome} R$ ${cc.saldo}")
//        }catch(e: ValorInvalidoException)
//        {
//            println("Valor inválido")
//            e.printStackTrace()
//        }

//        Saque Conta 1
        try{
//            cc.sacarRecurso(-100.0)//Saque Valor Inválido
            cc.sacarRecursoSemTaxa(-100.0)//Saque Valor Inválido
//            cc.sacarRecurso(25000.0) //Saque Valor Insuficiente
//            cc.sacarRecursoSemTaxa(25000.0) //Saque Valor Insuficiente
//            cc.sacarRecurso(50.0) //Saque OK
//            cc.sacarRecursoSemTaxa(50.0) //Saque OK
            println("Novo Saldo ${john.nome} R$ ${cc.saldo}")
        }catch(e: ValorInvalidoException)
        {
            println("Caiu na Expection de Valor inválido")
            e.printStackTrace()
        }catch(e: SaldoInsuficienteException)
        {
            println("Caiu na Expection de Saldo Insuficiente")
            e.printStackTrace()
        }




//        cc.sacarRecurso(25000.0)
//        cc.sacarRecursoSemTaxa(25000.0)
//        Saque OK

//        cc.sacarRecursoSemTaxa(50.0)


//        Transferencia entre conta 1 e 2

//        Transferencia Invalida
//        cc.transfereRecurso(-50.0,cc2)
//        Tranferencia Insuficiente
//        cc.transfereRecurso(5000.0,cc2)
//        Transferencia OK
//        cc.transfereRecurso(50.0,cc2)

//        println()
//        println("Novo Saldo ${john.nome} R$ ${cc.saldo}")
//        println("Novo Saldo ${maria.nome} R$ ${cc2.saldo}")

}
