abstract class Conta (val titular: String,val agencia: Int, val numeroConta: Int ) {

    var saldo: Double = 100.0
    protected set


//    abstract fun depositaRecurso(valor: Double)
//    fun depositaRecurso(valor: Double){
//        this.saldo+=valor
//    }

    abstract fun sacarRecurso(valor: Double)
//    if(valor>saldo) {
//        return false
//    }else {
//        this.saldo -= valor
//        return true

//    abstract fun transfereRecurso(valor: Double, contaDestino: Conta)
//    fun transfereRecurso(valor: Double, contaDestino: Conta) {
//        if(sacarRecurso(valor))
//        {
//            contaDestino.depositaRecurso(valor)
//        }else
//        {
//            return
//        }
//
//
//    }



}