package br.com.johnny.bytebank.modelo

class CalculadoraBonificacao {

    var total: Double = 0.0
        private set

    fun registra(funcionario: Funcionario)
    {
        println("Nome: ${funcionario.nome} Bonificação: ${funcionario.bonificacao}")
        this.total+= funcionario.bonificacao
    }



}