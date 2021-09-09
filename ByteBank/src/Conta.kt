open class Conta (val titular: String,val agencia: Int, val numeroConta: Int ) {

    var saldo: Double = 100.0
    private set

    fun testaComportamentoConta() {
        val clJ = Conta("Johnny", 123456, 321 )
        val clM = Conta("Maria", 65878, 321)
    }


    fun depositaRecurso(valor: Double){
        this.saldo+=valor
    }

    open fun sacarRecurso(valor: Double): Boolean{
        if(valor>saldo) {
            return false
        }else {
            this.saldo -= valor
            return true
        }
    }

    fun transfereRecurso(valor: Double, contaDestino: Conta) {
        if(sacarRecurso(valor))
        {
            contaDestino.depositaRecurso(valor)
        }else
        {
            return
        }


    }



}