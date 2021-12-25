package logica.poo/*
Crie uma classe chamada Invoice que possa ser utilizado por uma loja de suprimentos de informática para representar
uma fatura de um item vendido na loja.
Uma fatura deve incluir as seguintes informações como atributos:
• o número do item faturado,
• a descrição do item,
• a quantidade comprada do item e
• o preço unitário do item.

Sua classe deve ter um construtor que inicialize os quatro atributos.
Se a quantidade não for positiva, ela deve ser configurada como 0.
Se o preço por item não for positivo ele deve ser configurado como 0.0.
Forneça um método set e um método get para cada variável de instância.

Além disso, forneça um método chamado getInvoiceAmount que calcula o valor da fatura (isso é, multiplica a quantidade pelo preço por item)
e depois retorna o valor como um double. Escreva um aplicativo de teste que demonstra as capacidades da classe Invoice.
 */

class Invoice(val id: Int,val descricao: String,val qtde: Int, val valor: Double) {


    fun minhaFatura(){
        println("Item $id")
        println("Descrição $descricao")
        println("Quantidade $qtde")
        println("Valor: $valor")
    }
}

fun main()
{
    val compra1 = Invoice(1,"Teclado",1,25.5)
    compra1.minhaFatura()

}

