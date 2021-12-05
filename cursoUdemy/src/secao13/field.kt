class Maquina(var marca: String) {

    var nucleos: Int

        //forçando o get e set
        get() {
            return nucleos
        }
        set(value) {
            this.nucleos = value
        }


}


fun field(){
    var m = Maquina("XPTO")
    println(m.nucleos)

}
