
fun main()
{
    val resultado = Divisao()
    println("10 / 2 = ${resultado.dividir(10,2)}")
}


class Empresa (
    val nome: String,
    val cnpj: String,
    val endereco: String,
    val faturamento: Double)
{
    fun imprimir(){
        println("Nome: $nome")
        println("CNPJ: $cnpj")
        println("Endereço: $endereco")
        println("Faturamento: $faturamento")
    }

    //    val banco = Empresa("Banco XYZ","1234534","Endereco da Empresa",5000.0)
//    val otica = Empresa("Otica","6565656","Rua da Empresa",4500.0)
//
//    banco.imprimir()
//    otica.imprimir()

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


}

