//Classe
//Metodo
//Comportamento
//Atributos  (var nome: String, var anoNascimento: Int)



class Pessoa1

class Pessoa2 (var nome: String, val anoNascimento: Int)

class Pessoa3 (var nome: String, val anoNascimento: Int){

    fun saudacao(){
        println("Olá meu nome é $nome!")
    }
}



fun classes(){

    println("Classes")

    //Inicializando a classe 3
    val pessoa = Pessoa3("Johnny",1984)

    println(pessoa.nome)
    println(pessoa.anoNascimento)
    pessoa.saudacao()   


}