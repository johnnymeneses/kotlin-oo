
fun range() {
    println("Range")
    Ex3()

}
fun Ex1(){

//Impressão de range
    val serie : IntRange = 1.rangeTo(10)

    for (s in serie){
        print("$s ")
    }
}

fun Ex2(){
    //range de números pares
    println("Numeros Pares")
    val numerosPares = 0..50 step 2
    for (par in numerosPares)
    {
        print(" $par : ")
    }
}
fun Ex3() {
//    range dos numeros pares, exceto o ultimo


    val numerosPares2 = 0.until(50) step 2
    for (par in numerosPares2) {
        print(" $par : ")
    }
}



fun Ex4(){}
fun Ex5(){}
fun Ex6(){





    //Numeros pares reverso
    println("")
    val numerosParesReverso = 50 downTo 0 step 2
    numerosParesReverso.forEach {print(" $it :")}

    println("")
    println("")


    //Encontrando valores dentro de um range
    val intervalo = 100.0..500.0
    val salario= 12250.0

    if(salario in intervalo)
    {
        println("Salario encontrado")
    }else {
        println("Salario não encontrado")
    }

    println("")
    println("")
    val alfabeto = 'a'..'z' //Letras minusculas
//val letra = 'k'
    val letra = 'K'
    if(letra in alfabeto){
        println("Letra encontrada")
    }else{
        println("Letra não encontrada")
    }

}









