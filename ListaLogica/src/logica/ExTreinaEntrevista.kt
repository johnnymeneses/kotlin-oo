package logica.logica

//Orientação a objeto
//Criar um Funcionario > Gerente Herdando de Funcionario > Gerente Abstraindo de Fucnionario > Analista> Calcula Bonificação

class Funcionario(val nome:String, val salario: Double){

}




fun main() {

    val johnny = Funcionario("Johnny",500.0)

    println("Nome ${johnny.nome}, Salario ${johnny.salario}")


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