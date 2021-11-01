package br.com.johnny.bytebank.teste

import br.com.johnny.bytebank.exception.SaldoInsuficienteException
import br.com.johnny.bytebank.exception.ValorInvalidoException
import br.com.johnny.bytebank.modelo.Cliente
import modelos.contaCorrente

fun testaContaExcpetionCC() {

//Cria Conta 1
        val john = Cliente("johnn", "1234578", 12345)
        val cc = contaCorrente(john, 1234, 4444)

//Cria Conta 2
        val maria = Cliente("Maria", "1234578", 12345)
        val cc2 = contaCorrente(maria, 1234, 4444)

//Imprime Saldo
//        println("Saldo atual ${john.nome} R$ ${cc.saldo}")
//        println("Saldo atual ${maria.nome} R$ ${cc2.saldo}")


//       Deposito Conta
/*        try {
            cc.depositaRecurso(-500.0) //Valor Inválido
              cc.depositaRecurso(500.0)
            println("Novo Saldo ${john.nome} R$ ${cc.saldo}")
        }catch(e: ValorInvalidoException)
        {
            println("Valor inválido")
            e.printStackTrace()
        }
*/

//        Saque Conta 1
/*
        try{

            cc.sacarRecurso(-100.0)//Saque Valor Inválido
            cc.sacarRecursoSemTaxa(-100.0)//Saque Valor Inválido
            cc.sacarRecurso(25000.0) //Saque Valor Insuficiente
             cc.sacarRecursoSemTaxa(25000.0) //Saque Valor Insuficiente
            cc.sacarRecurso(50.0) //Saque OK
            cc.sacarRecursoSemTaxa(50.0) //Saque OK
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
*/


//        Transferencia entre conta 1 e 2
        try {
                cc.transfereRecurso(-50.0, cc2) //Transferencia Invalida
                cc.transfereRecurso(5000.0, cc2) //Tranferencia Insuficiente
                cc.transfereRecurso(50.0, cc2)//Transferencia OK

                println()
                println("Novo Saldo ${john.nome} R$ ${cc.saldo}")
                println("Novo Saldo ${maria.nome} R$ ${cc2.saldo}")
        } catch (e: ValorInvalidoException) {
                println("Caiu na Expection de Valor inválido")
                e.printStackTrace()

        } catch (e: SaldoInsuficienteException) {
                println("Caiu na Expection de Saldo Insuficiente")
                e.printStackTrace()
        }


}

fun testaContaExcpetionCP() {

//Cria Conta 1
        val john = Cliente("johnn", "1234578", 12345)
        val cp = contaCorrente(john, 1234, 4444)

//Cria Conta 2
        val maria = Cliente("Maria", "1234578", 12345)
        val cp1 = contaCorrente(maria, 1234, 4444)

//Imprime Saldo
        println("Saldo atual ${john.nome} R$ ${cp.saldo}")
//        println("Saldo atual ${maria.nome} R$ ${cp1.saldo}")


//       Deposito Conta
        try {
                cp.depositaRecurso(-500.0) //Valor Inválido
                cp.depositaRecurso(500.0)
                println("Novo Saldo ${john.nome} R$ ${cp.saldo}")
        } catch (e: ValorInvalidoException) {
                println("Valor inválido")
                e.printStackTrace()
        }


//        Saque Conta 1
        try {

                cp.sacarRecurso(-100.0)//Saque Valor Inválido
                cp.sacarRecursoSemTaxa(-100.0)//Saque Valor Inválido
                cp.sacarRecurso(25000.0) //Saque Valor Insuficiente
                cp.sacarRecursoSemTaxa(25000.0) //Saque Valor Insuficiente
                cp.sacarRecurso(50.0) //Saque OK
                cp.sacarRecursoSemTaxa(50.0) //Saque OK
                println("Novo Saldo ${john.nome} R$ ${cp.saldo}")
        } catch (e: ValorInvalidoException) {
                println("Caiu na Expection de Valor inválido")
                e.printStackTrace()
        } catch (e: SaldoInsuficienteException) {
                println("Caiu na Expection de Saldo Insuficiente")
                e.printStackTrace()
        }


//        Transferencia entre conta 1 e 2

        try {
                cp.transfereRecurso(-50.0, cp1) //Transferencia Invalida
                cp.transfereRecurso(5000.0, cp1) //Tranferencia Insuficiente
                cp.transfereRecurso(50.0, cp1)//Transferencia OK

                println()
                println("Novo Saldo ${john.nome} R$ ${cp.saldo}")
                println("Novo Saldo ${maria.nome} R$ ${cp1.saldo}")
        } catch (e: ValorInvalidoException) {
                println("Caiu na Expection de Valor inválido")
                e.printStackTrace()

        } catch (e: SaldoInsuficienteException) {
                println("Caiu na Expection de Saldo Insuficiente")
                e.printStackTrace()
        }


}