package br.com.johnny.bytebank.modelo

//Inicializando as variaveis para deixar elas como nao obrigatorias
//É válido ressaltar que para ser um parâmetro opcional, não é necessário o uso do var.
class Endereco (
    var logradouro: String ="",
    val numero: Int= 0,
    var bairro: String ="",
    var cidade: String ="",
    var estado: String ="",
    var cep: String="",
    var complemento: String="" )  {

}
