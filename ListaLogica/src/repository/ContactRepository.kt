package logica.repository

import logica.entity.ContactEntity

class ContactRepository {


     companion object {
        private val contactList = mutableListOf<ContactEntity>()


        fun save(contact: ContactEntity){
            contactList.add(contact)
        }

        fun delete(contact: ContactEntity){
                //localizar
                //deletar
        }

//         retornar lista de contatos
         fun getList(): List<ContactEntity> {
             return contactList
         }


    }


}