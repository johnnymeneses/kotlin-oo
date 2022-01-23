package logica.logica

import java.io.PipedOutputStream

class Pedido(
    val id: Int,
    val desc: String,
    val qtde: Int
) {

    fun imprimir() {
        println("ID: $id")
        println("Descrição: $desc")
        println("Quantidade: $qtde")
    }
}

fun main(){


    val vendaUm = Pedido(1, "tesoura", 4)
    val vendaDois = Pedido(2, "Lapiseira", 1)
    val vendaTres = Pedido(3, "Canetas", 10)

    vendaUm.imprimir()
    vendaDois.imprimir()
    vendaTres.imprimir()
}