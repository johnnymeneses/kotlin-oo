package logica.poo/*
 A fim de representar empregados em uma firma, crie uma classe chamada Empregado
  que inclui as três informações a seguir como atributos:
   um primeiro nome
   um sobrenome
   um salário mensal.

   Se o salário mensal não for positivo, configure-o como 0.0.
   Escreva um aplicativo de teste que demonstra as capacidades da classe.
   Crie duas instâncias da classe e exiba o salário anual de cada instância.
   Então dê a cada empregado um aumento de 10% e exiba novamente o salário anual de cada empregado
 */

class Empregado(
    val nome: String,
    val sobrenome: String,
    val salario: Double
){
  fun aumentaSalario() {
      println("Novo salario do $nome é ${(salario* 0.1)+salario}  ")
  }
}

fun main()
{
    val mario = Empregado("Mario","Bros", 1000.0)
    mario.aumentaSalario()

}