package ui;

import javax.swing.*;
import java.awt.*;

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


    }
}
