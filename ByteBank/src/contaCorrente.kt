import java.util.*

class contaCorrente(titular: String, agencia: Int, numeroConta: Int) : Conta (titular, agencia, numeroConta)
{

    //Implementação de Depósito
    //Não permitir Deposito zerado ou negativo
    override fun depositaRecurso(valor: Double) {
        if(valor<=0){
            println("Valor de Depósito Inválido. Operação Cancelada")
            return
        } else {
            this.saldo += valor
        }
    }

    override fun sacarRecurso(valor: Double) : Boolean {

        //Não permitir saque com valor negativo
        if(valor<=0){
            println("Operacao com valor invalido cancelada")
            return false
        }

        val valorComTaxa  = valor+0.1

        //Não permitir Saque acima do saldo
        if(saldo<valorComTaxa)
        {
            println("Saldo Insuficiente. Operação cancelada")
            return false
        }else {
            saldo-=valorComTaxa
            return true
        }


    }

    fun sacarRecursoSemTaxa(valor: Double) : Boolean {

        //Não permitir saque com valor negativo
        if(valor<=0){
            println("Operacao com valor invalido cancelada")
            return false
        }

        if(saldo<valor){
            println("Saldo Insuficiente. Operação cancelada")
            return false
        }else{
            saldo-=valor
            return true
        }


    }





    //Implementação de Transferência
    //Não permitir Transferencia acima do saldo
    //Não permitir Transferencia negativo
    //Não permitir transferência pra própria conta (Mensagem de erro?)
    override fun transfereRecurso(valor: Double, contaDestino: Conta){


        if(sacarRecursoSemTaxa(valor))
        {
            contaDestino.depositaRecurso(valor)
        }else
        {
            return
        }
    }

}