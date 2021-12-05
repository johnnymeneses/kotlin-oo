//Classe enum permitem listar possibilidades possíveis; possibilidades de valores

enum class Prioridade1{
    BAIXA, MEDIA, ALTA
}

enum class Prioridade2 (val id: Int){
    BAIXA(1), MEDIA(5), ALTA(10)
}

//override
//enum class Prioridade2(val id: Int){





fun enum(){

    println(Prioridade1.BAIXA)
    println(Prioridade2.BAIXA.id)

}