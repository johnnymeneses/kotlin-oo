package logica
//Impar ou Par ?


fun main() = println(ex03(5))


fun ex03(num: Int): String = if (num % 2 == 0) "$num é Par" else "$num é Impar"
