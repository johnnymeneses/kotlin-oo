
fun range() {
    println("Range")

    val serie : IntRange = 1.rangeTo(10)

    for (s in serie){
        print("$s ")
    }

    //range de números pares
    println("Numeros Pares")
    val numerosPares = 0..50 step 2
    for (par in numerosPares)
    {
        print(" $par : ")
    }
    println("")

    val numerosPares2 = 0.until(50) step 2
    for (par in numerosPares2)
    {
        print(" $par : ")
    }

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