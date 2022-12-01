package modulos.gui;

import javax.swing.*;
import java.awt.*;

public class Interface {

    public Interface () {
        JFrame framePrincipal = new JFrame("Bem-vindo ao StarThrive");
        JButton informacoesEmpresas= new JButton("Informacoes");

        JButton alterarDados= new JButton("Alterar Dados");

        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panelPrincipal.setLayout(new GridLayout(0,1));
        panelPrincipal.add(informacoesEmpresas);
        panelPrincipal.add(alterarDados);

        framePrincipal.add(panelPrincipal, BorderLayout.CENTER);
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setTitle("Ecrã Principal");
        framePrincipal.pack();
        framePrincipal.setVisible(true);


    }
}
