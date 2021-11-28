package secao10

fun parametros() {

    endereco("Nome Rua","São Paulo","SP","01014000","145")

}


//Em alguns casos, as funções podem receber muitos paaremtros. Como lidar com o caso de ser necessário manter
//todos os parametros , mas nao ter todos disponíveis na chamada: receber um valor Default

fun endereco(rua: String="", cidade: String, estado: String, cep: String, numero: String=""){
    println("Rua $rua")
    println("Cidade: $cidade, $estado, - $cep")

}
