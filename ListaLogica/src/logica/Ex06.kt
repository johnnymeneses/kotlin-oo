package logica/*
Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida ela possui.
Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935 DIAS 
*/

class Ex06{

        fun idadeDias(nome: String, idade: Int)
        {
                println("$nome, você já viveu "+ idade* 365 + " dias")
        }
}