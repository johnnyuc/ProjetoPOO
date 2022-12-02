package modulos.gui;

import javax.swing.*;
import java.awt.*;

public class Janelas {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello!");

    public Janelas(JButton botao){
        frame.setTitle(botao.getText());

        label.setBounds(0,0,100,50);
        label.setFont(new Font(null,Font.PLAIN,25));

        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
