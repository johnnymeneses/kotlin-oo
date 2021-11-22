package logica.business

import logica.entity.ContactEntity
import logica.repository.ContactRepository
import java.lang.Exception

//Pacote Business lida com regra de negócio


class ContactBusiness {

    //Agenda Java Swing
    private fun validate(name: String, phone: String){
        if(name== "")  throw Exception("Nome é Obrigatório")
        if(phone=="")  throw Exception("Telefone é Obrigatório")
    }

    private fun validateDelete(name: String, phone: String){
        if(name== "" || phone=="")  throw Exception("É necessario selecionar um contato para remover")
    }

    fun getContactCountDescription(): String {
        val list = getList()

        if(list.isEmpty()){
            return "0 contatos"
        }else{
            return "${list.size} contatos"
        }


    }


    fun save(name: String, phone: String){
        validate(name,phone)

        val contact =  ContactEntity(name,phone)
        ContactRepository.save(contact)
    }

    fun delete(name: String, phone: String){
        validateDelete(name,phone)
        val contact =  ContactEntity(name,phone)
        ContactRepository.delete(contact)

    }

    fun getList(): List<ContactEntity> {
        return ContactRepository.getList()
    }

}