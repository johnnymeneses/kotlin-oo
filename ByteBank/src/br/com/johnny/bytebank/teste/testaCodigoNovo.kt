import br.com.johnny.bytebank.modelo.Cliente
import br.com.johnny.bytebank.modelo.Diretor
import br.com.johnny.bytebank.modelo.Gerente
import br.com.johnny.bytebank.modelo.SistemaInterno

fun testaCodigoNovo() {

    println("Função para testar código")

//    Object Expressions
//    Objeto anônimo, sem classe.
//    Quando vc quer  ter a estrutura de um objeto,  mas não quer criar uma classe

    println("Object Expression")
    val john = object {
        val nome: String = "Johnny"
        val idade: Int = 37
        val senha: Int = 1000

        //Essa função está dentro do Objeto... pesquisar sobre Funcções dentro de Objects

        fun autentica(senha: Int) {
            if (this.senha == senha) {
                println("OK")
            }
        }


    }

    john.autentica(1000)


    println("Object Declaration")




}

