
fun main()
{
    val ex01 = Ex01()
    println("Area do Terreno 5 x 10: ${ex01.areaTerreno(10,5)}")
}





class Divisao{
    var num1: Int=0
        private set
    var num2: Int=0
        private set

    fun dividir (num1: Int, num2: Int) : Double
    {
        this.num1 = num1
        this.num2 = num2

        if(num2==0){
            return 0.0
        }else {

            var resultado = (num1 / num2).toDouble()
            return resultado
        }
    }

    //    val resultado = Divisao()
//    println("10 / 2 = ${resultado.dividir(10,2)}")

}

