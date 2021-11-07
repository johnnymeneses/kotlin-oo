fun main(){

    declaraVariavel()
    println(areaTerreno(5,6))

    val johnny: cl_gerente("johnny",)





}

fun declaraVariavel(){
//    Como declarar variável mutável
    var nome: String = "Johnny"
    var idade = 75
    var idade2: Double = 35.0

    nome = "Eder"
    println("$nome , $idade , $idade2")


//    Como declarar variável imutável
    val nome2: String = "Teixeira"
//    nome2 = "" val não pode ter valor atribuido
    println(nome2)
}

fun tabuada (num: Int){
    for(index in 1..10)
    {
        println("$index * $num = " + index * num)
    }
}
//tabuada(10)

//Função com retorno direto
fun areaTerreno(a: Int, b: Int): Int = a*b


//IF
fun parImpar(num: Int): String = if (num % 2 == 0) "$num é Par" else "$num é Impar"


//Println
fun println(){
    val paesTotal = 5 * 0.12
    val broasTotal = 5 * 1.5

//    println("Foram vendidos $paesVendidos pães e $broasVendidas broas, totalizando R$ $poupanca")
}

//Função com parametro
fun qtdeDias(dia: Int, mes: Int)
{
    var total = ((mes-1)*30)+dia

    println("Já se passaram $total dias")
}

//Funcao com When
fun novelos(blusa: Int){

    when {
        blusa <= 0 -> return
        blusa == 1 -> println("Para $blusa blusa, é preciso ${blusa*87} novelos")
        blusa > 1 -> println("Para $blusa blusas, é preciso ${blusa*87} novelos")
    }

}


/*
*


Fazer um resumo

Criando variaveis
Estruturas Condicionais
Estruturas de Repetição

Estrutura de Dados

Orientação à Objeto

Classes
Métodos
Encapsulamento
Modificadores de Acesso

Properties: Get e Set

Construtores

Construtor Personalizado

Herança
Sobrescrever comportamentos Herdados
Reutilizar membros da classe mae

Polimorfismo

Abstrações
referências abstratas
membros e classes abstratas

Interfaces
O que é
Como utilizar

Composição
diferenças e quando usar herança ou composição.

o que são e como utilizar object expressions e declarations;


Classe Any
Cast
Smart Cast

Equals
Hashcode
ToString


Execptions
Como fazer
Como lançar
Mensagens personalizadas

NullSafety

coleções
arrays
listas



* */