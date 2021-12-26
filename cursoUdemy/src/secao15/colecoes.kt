package secao15



fun main(args: Array<String>){

//     List - array, Set, HashMap

        val l1 = listOf("Madrid","São Paulo", "Berlim") //listOf é imutável - adiciona list repetidos
        val l2 = mutableListOf("Madrid","São Paulo", "Berlim") //mutableListOf é mutável
        val a1 = arrayListOf("Madrid","São Paulo", "Berlim")
        val s1 = setOf("Madrid","São Paulo", "Berlim","Berlim") //Set pra ListOF - O Set nao adiciona list repetidos

        println(l2.size)
        l2.add("Santos")
        println(l2.size)

//        println(s1.size)




}