import br.com.johnny.bytebank.exception.SaldoInsuficienteException
import br.com.johnny.bytebank.modelo.Cliente
import br.com.johnny.bytebank.modelo.Endereco
import modelos.contaCorrente


fun main() {
        println("Bem vindo ao ByteBank - Kotlin Edition. ")

//    testaFuncionarios()
//    testaAutenticacao()
//        testaContas()
//    testaEndereco()
//    testaCodigoNovo()
//    testaCriaContas()
//    testaTry()
//    testaAny()
//    testaException()
        testaContaExcpetion()
}

fun testaContaExcpetion() {

//Cria Conta 1
        val john = Cliente ("johnn","1234578",12345)
        val cc = contaCorrente(john,1234,4444)

//Cria Conta 2
        val maria = Cliente ("Maria","1234578",12345)
        val cc2 = contaCorrente(maria,1234,4444)

//Imprime Saldo
        println("Saldo atual ${john.nome} R$ ${cc.saldo}")


//        Deposito Conta 1
        //Valida Valor inválido
        //cc.depositaRecurso(-500.0)

        //Valida Saldo Insuficiente
        //Valida Valor OK


        println("Novo Saldo ${john.nome} R$ ${cc.saldo}")

//        Deposito Conta 2
//
//        Saque Conta 1
//        Saque Conta 2

//        Transferencia entre conta 1 e 2

}





