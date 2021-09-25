import modelos.*

fun testaFuncionarios() {



//    Criar modelos.Analista
        val funcAnalista = Analista("modelos.Analista","12345",1000.0)
        //Bonificação esperada: Salario * 0.1

//    Criar modelos.Auxiliar
        val funcAuxiliar = Auxiliar("modelos.Auxiliar","45678",1000.0)
        //Bonificação Salario + 100

//    Criar modelos.Diretor
        val funcDiretor = Diretor("modelos.Diretor","34443",1000.0,1234,500.0)
        //Bonificação (Salario * 0.3) + PLR

//    Criar modelos.Gerente
        val funcGerente = Gerente("modelos.Gerente","55445",1000.0,5678)
        //Bonificacao (Salario * 0.1) + salario
//    Exibir Funcionarios criados

    println("modelos.Funcionario : ${funcAnalista.nome}, Salário:  ${funcAnalista.salario}")
    println("modelos.Funcionario : ${funcAuxiliar.nome}, Salário:  ${funcAuxiliar.salario}")
    println("modelos.Funcionario : ${funcDiretor.nome}, Salário:  ${funcDiretor.salario}")
    println("modelos.Funcionario : ${funcGerente.nome}, Salário:  ${funcGerente.salario}")


//    Calculo de Bonificação
        val bonifica = CalculadoraBonificacao()
        bonifica.registra(funcAnalista)
        bonifica.registra(funcAuxiliar)
        bonifica.registra(funcDiretor)
        bonifica.registra(funcGerente)
        println("")
        println("Total de Bonificações: ${bonifica.total}")

}