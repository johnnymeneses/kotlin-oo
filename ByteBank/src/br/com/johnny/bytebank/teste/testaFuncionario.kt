import br.com.johnny.bytebank.modelo.*

fun testaFuncionarios() {



//    Criar br.com.johnny.bytebank.modelo.Analista
        val funcAnalista = Analista("br.com.johnny.bytebank.modelo.Analista","12345",1000.0)
        //Bonificação esperada: Salario * 0.1

//    Criar br.com.johnny.bytebank.modelo.Auxiliar
        val funcAuxiliar = Auxiliar("br.com.johnny.bytebank.modelo.Auxiliar","45678",1000.0)
        //Bonificação Salario + 100

//    Criar br.com.johnny.bytebank.modelo.Diretor
        val funcDiretor = Diretor("br.com.johnny.bytebank.modelo.Diretor","34443",1000.0,1234,500.0)
        //Bonificação (Salario * 0.3) + PLR

//    Criar br.com.johnny.bytebank.modelo.Gerente
        val funcGerente = Gerente("br.com.johnny.bytebank.modelo.Gerente","55445",1000.0,5678)
        //Bonificacao (Salario * 0.1) + salario
//    Exibir Funcionarios criados

    println("br.com.johnny.bytebank.modelo.Funcionario : ${funcAnalista.nome}, Salário:  ${funcAnalista.salario}")
    println("br.com.johnny.bytebank.modelo.Funcionario : ${funcAuxiliar.nome}, Salário:  ${funcAuxiliar.salario}")
    println("br.com.johnny.bytebank.modelo.Funcionario : ${funcDiretor.nome}, Salário:  ${funcDiretor.salario}")
    println("br.com.johnny.bytebank.modelo.Funcionario : ${funcGerente.nome}, Salário:  ${funcGerente.salario}")


//    Calculo de Bonificação
        val bonifica = CalculadoraBonificacao()
        bonifica.registra(funcAnalista)
        bonifica.registra(funcAuxiliar)
        bonifica.registra(funcDiretor)
        bonifica.registra(funcGerente)
        println("")
        println("Total de Bonificações: ${bonifica.total}")

}