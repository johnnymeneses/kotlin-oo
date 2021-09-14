class contaPoupanca(titular: String,
                    agencia: Int,
                    numeroConta: Int) : Conta (titular, agencia, numeroConta)
{


    //Implementação de Saque
    //Não permitir Saque acima do saldo
    //Não permitir Saque negativo
    override fun sacarRecurso(valor: Double) : Boolean {

        if(valor<=0){
        println("Operacao com valor invalido cancelada")
        return false
        }


        if(saldo>valor){
            saldo-=valor
            return true
        } else
        {
            println("Saldo Insuficiente. Operação cancelada")
            return false
        }

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
//        if(Conta == contaDestino)
//        {
//            return
//        }


        if(sacarRecurso(valor))
        {
            contaDestino.depositaRecurso(valor)
        }else
        {
            return
        }
    }

}




