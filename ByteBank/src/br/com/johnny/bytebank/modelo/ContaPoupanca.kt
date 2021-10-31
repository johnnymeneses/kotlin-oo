package modelos

import br.com.johnny.bytebank.exception.SaldoInsuficienteException
import br.com.johnny.bytebank.modelo.Cliente
import br.com.johnny.bytebank.modelo.Conta

class contaPoupanca: Conta {


    constructor(titular: Cliente, agencia: Int, numeroConta: Int,) : super (titular, agencia, numeroConta,)
 {
//     totalContasCriadas
 }



    //Implementação de Saque
    //Não permitir Saque acima do saldo
    //Não permitir Saque negativo
    override fun sacarRecurso(valor: Double) {

        //Não permitir saque com valor negativo
        if(valor<=0){
            println("Operacao com valor invalido cancelada")
            throw SaldoInsuficienteException()
        }

        if(saldo<valor){
            println("Saldo Insuficiente. Operação cancelada")
            throw SaldoInsuficienteException()
        }
            saldo-=valor



    }



    //Implementação de Depósito
    //Não permitir Deposito zerado ou negativo
    override fun depositaRecurso(valor: Double) {
       if(valor<=0)
       {
           println("Valor de Depósito Inválido. Operação Cancelada")
           return
       }
        else {
           this.saldo += valor
       }
    }


    //Implementação de Transferência
    //Não permitir Transferencia acima do saldo
    //Não permitir Transferencia negativo
    //Não permitir transferência pra própria conta (Mensagem de erro?)
    override fun transfereRecurso(valor: Double, contaDestino: Conta){
//        if(br.com.johnny.bytebank.modelo.Conta == contaDestino)
//        {
//            return
//        }

        if(saldo< valor)
        {
            throw SaldoInsuficienteException()
        }
            saldo-=valor
            contaDestino.depositaRecurso(valor)

    }

}




