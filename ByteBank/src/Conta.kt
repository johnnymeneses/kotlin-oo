abstract class Conta (val titular: String,val agencia: Int, val numeroConta: Int ) {

    var saldo: Double = 100.0
    protected set

    var total : Int = 1
    protected set

    var totalContasCriadas: Int = 0
        protected set


//    abstract fun totalContasCriadas(): Int

    abstract fun depositaRecurso(valor: Double)

    abstract fun sacarRecurso(valor: Double): Boolean

    abstract fun transfereRecurso(valor: Double, contaDestino: Conta)




}