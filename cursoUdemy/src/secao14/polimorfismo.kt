package secao14

//Polimorfismo: algo que assume varias formas

interface Func {
    fun calculaBonus()
}

class Gerente: Func {
    override fun calculaBonus() {
        println("Bonous de 400")
    }

}

class Tecnico: Func{
    override fun calculaBonus() {
        println("Bonous de 200")
    }
}

class Analista: Func{
    override fun calculaBonus() {
        println("Bonous de 60")
    }
}



fun polimorfismo () {

    val g: Func = Gerente()
    val t: Func = Tecnico()
    val a: Func = Analista()

//    g.calculaBonus()
//    t.calculaBonus()
//    a.calculaBonus()

    calculaBonus(g)
    calculaBonus(t)
    calculaBonus(a)

}

fun calculaBonus(func: Func){
    func.calculaBonus()

}