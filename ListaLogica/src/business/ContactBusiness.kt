package logica.business

import java.lang.Exception

//Pacote Business lida com regra de negócio


class ContactBusiness {

//Agenda Java Swing
fun validate(name: String, phone: String){
    if(name== "")  throw Exception("Nome é Obrigatório")
    if(phone=="")  throw Exception("Telefone é Obrigatório")
}

fun validateDelete(name: String, phone: String){
    if(name== "" || phone=="")  throw Exception("É necessario selecionar um contato para remover")
}

fun save(name: String, phone: String){
    validate(name,phone)
}

fun delete(name: String, phone: String){
    validateDelete(name,phone)
}

}