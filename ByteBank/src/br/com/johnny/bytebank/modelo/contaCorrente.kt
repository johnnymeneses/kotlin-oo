package modelos

import br.com.johnny.bytebank.exception.SaldoInsuficienteException
import br.com.johnny.bytebank.exception.ValorInvalidoException
import br.com.johnny.bytebank.modelo.Cliente
import br.com.johnny.bytebank.modelo.Conta
import kotlin.reflect.jvm.internal.ReflectProperties

class contaCorrente(titular: Cliente, agencia: Int, numeroConta: Int) : Conta(titular, agencia, numeroConta)
{

//    Contador especifico de contas correntes
    companion object contaCC{
        var total = 0
            private set
    }

    init {
        total++
        println("Criando contas correntes")
    }

    //Implementação de Depósito
    //Não permitir Deposito zerado ou negativo
    override fun depositaRecurso(valor: Double) {
        if(valor<=0) {
            throw ValorInvalidoException()
        }
            this.saldo += valor

    }

    override fun sacarRecurso(valor: Double)  {

        //Não permitir saque com valor negativo
        if(valor<=0) {
            throw ValorInvalidoException()
        }

        val valorComTaxa  = valor+0.1


        //Não permitir Saque acima do saldo
        if(saldo<valorComTaxa)
        {
            throw  SaldoInsuficienteException()
        }

        saldo-=valorComTaxa



    }

    fun sacarRecursoSemTaxa(valor: Double){

        var mensagem: String=""

        //Não permitir saque com valor negativo
        if(valor<=0){
            throw  ValorInvalidoException(mensagem = "Valor $valor é invalido ")
        }

        if(saldo<valor){
            throw  SaldoInsuficienteException()
        }

        saldo-=valor

}


    //Implementação de Transferência
    //Não permitir Transferencia acima do saldo
    //Não permitir Transferencia negativo
    //Não permitir transferência pra própria conta (Mensagem de erro?)
    override fun transfereRecurso(valor: Double, contaDestino: Conta){


        //Não permitir saque com valor negativo
        if(valor<=0){
            throw  ValorInvalidoException()
        }

        if(saldo<valor){
            throw  SaldoInsuficienteException()
        }
        saldo-=valor
         contaDestino.depositaRecurso(valor)

    }

}