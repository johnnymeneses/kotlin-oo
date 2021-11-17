package logica
// Divisão de dois números

    fun divisao(num1: Int, num2: Int): Double{

        if(num2==0){
            return 0.0
        }else {
            var resultado = (num1 / num2).toDouble()
            return resultado
        }
    }
