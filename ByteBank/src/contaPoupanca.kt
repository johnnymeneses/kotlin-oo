class contaPoupanca: Conta {


    constructor(titular: String,agencia: Int,numeroConta: Int,) : super (titular, agencia, numeroConta,)
 {
//     totalContasCriadas
 }



    //Implementação de Saque
    //Não permitir Saque acima do saldo
    //Não permitir Saque negativo
    override fun sacarRecurso(valor: Double) : Boolean {

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




