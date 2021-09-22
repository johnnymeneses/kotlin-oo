/*
Escrever uma mídia que recebendo um número e retorna quais são os divisores desse número.
Em uma segunda versão, avisar se a soma dos divisores e a mesma do número informado.  Ex 28
Terceira versão: dado um range, exibir quais números tem a soma de seus divisores exatamente igual a mumero informado
* */

class Ex51{

    fun restoDivisao(number: Int){
        var soma: Int = 0

        for(index in 1..number)
        {
            if(number % index  == 0) {
                println(index)
                soma+=index
            }

        }
        println("Soma dos divisores de $number : " + (soma - number))



//        fun parImpar(num: Int): String = if (num % 2 == 0) "$num é Par" else "$num é Impar"

    }


}