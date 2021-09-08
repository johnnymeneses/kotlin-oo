class contaCorrente(val titular: String, val cpf: Int, val agencia: Int, val numeroConta: Int ) {

    var saldo: Double = 100.0
    private set

    fun testaComportamentoConta() {
        val clJ = contaCorrente("Johnny", 123456, 321, 555)
        val clM = contaCorrente("Maria", 65878, 321, 579)
    }


    fun depositaRecurso(valor: Double){
        this.saldo+=valor
    }

    fun sacarRecurso(valor: Double): Boolean{
        if(valor>saldo) {
            return false
        }else {
            this.saldo -= valor
            return true
        }
    }

    fun transfereRecurso(valor: Double, contaDestino: contaCorrente) {
        if(sacarRecurso(valor))
        {
            contaDestino.depositaRecurso(valor)
        }else
        {
            return
        }


    }



}