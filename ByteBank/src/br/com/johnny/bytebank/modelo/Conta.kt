package br.com.johnny.bytebank.modelo

abstract class Conta (val titular: Cliente, val agencia: Int, val numeroConta: Int ) {

    var saldo: Double = 100.0
    protected set

//    var total : Int = 1
//    protected set


    abstract fun depositaRecurso(valor: Double)

    abstract fun sacarRecurso(valor: Double): Boolean

    abstract fun transfereRecurso(valor: Double, contaDestino: Conta)




}