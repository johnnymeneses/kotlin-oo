package ui;

import logica.business.ContactBusiness;
import logica.entity.ContactEntity;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class MainForm extends JFrame{
    private JPanel rootPanel;
    private JButton buttonNewContact;
    private JButton btnRemove;
    private JTable tableContacts;


    private ContactBusiness mContactBusiness;



    //Construtor
    public MainForm(){
        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - getSize().width/2,dim.height/2 - getSize().height/2);

        //Fechando aplicação ao apertar o X
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        mContactBusiness = new ContactBusiness();//variavel mContactBusiness não é mais nula.

        //        Ações
        setListeners();

//        Listar contatos ao abrir
        loadContacts();
    }


    private void loadContacts()    {
        List<ContactEntity> contactiList = mContactBusiness.getList();

    }

    private void setListeners(){
        buttonNewContact.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new contactForm();
                dispose();
            }
        });

        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}
