package logica/*
Um motorista deseja colocar no seu tanque X reais de gasolina. Escreva um algoritmo para ler o preço do litro da gasolina e o valor do pagamento,
 e exibir quantos litros ele conseguiu colocar no tanque. 
*/

    fun ex07(preco: Double, valor: Double){
        var litros:Double = 0.0
        litros = valor / preco

        println("Com a gasolina custando R$$preco, você conseguira abastecer $litros litros com a quantia paga de R$ $valor")


    }
