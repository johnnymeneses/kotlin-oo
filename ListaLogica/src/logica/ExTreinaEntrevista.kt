package logica.logica

//Orientação a objeto
//Criar um Funcionario > Gerente Herdando de Funcionario > Gerente Abstraindo de Fucnionario > Analista> Calcula Bonificação

abstract class Funcionario(val nome: String, var salario: Double) {

    open fun salarioBonus(nome: Funcionario) {
        salario += 200
    }
}


class Gerente(nome: String, salario: Double) : Funcionario(nome, salario) {

    override fun salarioBonus(nome: Funcionario) {
        salario+=800
    }
}

class Analista(var nomeA: String, var salarioA: Double) : Funcionario(nomeA, salarioA) {

}


fun main() {

    val johnny = Analista("Johnny", 500.0)
    val eder = Gerente("Eder",800.0)

    println(johnny.salario)
    johnny.salarioBonus(johnny)
    println(johnny.salario)

    println(eder.salario)
    eder.salarioBonus(eder)
    println(eder.salario)


}


fun basicoUm() {

    val nome = "Johnny"
    val idade = "15"
    val anoNascimento: Int = idade.toInt()
    var mudaValor = 4

    mudaValor = 10

    while (mudaValor > 1) {
        println(mudaValor)
        mudaValor--
    }
    println("Variavel comum: $nome")
    println("Cast de String pra Int: $idade ${anoNascimento + 10}")
    println(mudaValor)

    if (mudaValor <= 18) {
        println("menorIdade")
    } else {
        println("Maior de idade")
    }

}

private fun tabuada(num: Int) {

    for (i in 1..10) {
        println(i * num)
    }


}