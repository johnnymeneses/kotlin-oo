package secao13

//        Data class
//        Uso: Representa uma classe que transita dados
//        Ganho: agregar dados



class Quadrado(val area: Float)
data class Triangulo(val area: Float)

//data class param(var b:Boolean, var s:String, var i: Int )



fun dataClass(){

    val q1 = Quadrado(10f)
    val q2 = Quadrado(10f)

    val t1 = Triangulo(10f)
    val t2= Triangulo(10f)

    println(q1)
    println(t1)

    
}

