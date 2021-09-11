
fun main()
{
//    val banco = Empresa("Banco XYZ","1234534","Endereco da Empresa",5000.0)
//    val otica = Empresa("Otica","6565656","Rua da Empresa",4500.0)
//
//    banco.imprimir()
//    otica.imprimir()

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
}





