
fun testeArray(){

    val idades = IntArray(5) // Array com tamanho definido
    idades[0] = 25
    idades[1] = 35
    idades[2] = 45
    idades[3] = 15
    idades[4] = 55

//Percorrendo o array
    var maiorIdade=0

    for(idade in idades)
    {
        if(idade > maiorIdade){
            maiorIdade = idade
        }

    }
    println("Array normal - Maior idade $maiorIdade")


    val idadesDinamico = intArrayOf(25,35,45,15,55,70,81)//Array com tamanhho dinâmico

    //Percorrendo o array
    var maiorIdadeD=0

    for(idade in idadesDinamico)
    {
        if(idade > maiorIdadeD){
            maiorIdadeD = idade
        }

    }

    println("Array Dinâmico - Maior idade $maiorIdadeD")


}
