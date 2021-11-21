package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class contactForm extends JFrame {

    private JPanel rootPanel;
    private JLabel lblNome;
    private JTextField textName;
    private JLabel lblTelefone;
    private JTextField textTelefone;
    private JButton btnSalvar;
    private JButton btnCancelar;

    //Construtor
    public contactForm(){
        setContentPane(rootPanel);
        setSize(500,250);
        setVisible(true);


        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(dim.width/2 - getSize().width/2,dim.height/2 - getSize().height/2);

        //Fechando aplicação ao apertar o X
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        setListeners();


    }

    private void setListeners(){

        btnSalvar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainForm();
                dispose();
            }
        });


    }


}
