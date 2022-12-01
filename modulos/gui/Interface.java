package modulos.gui;

import javax.swing.*;

public class Interface {

    public Interface () {
        JFrame framePrincipal = new JFrame("Bem-vindo ao StarThrive");
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(800, 600);
        framePrincipal.setVisible(true);

        JPanel panelPrincipal = new JPanel();
        framePrincipal.add(panelPrincipal);

    }
}
