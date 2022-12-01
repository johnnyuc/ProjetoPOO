package modulos.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Iniciar {

    JFrame framePrincipal = new JFrame("Bem-vindo à StarThrive");
    JPanel painelPrincipal = new JPanel();
    JButton botaoOperacoes = new JButton("Operações");
    JButton botaoEstatisticas = new JButton("Estatísticas");

    public Iniciar() {
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(800, 600);
        framePrincipal.setVisible(true);

        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        painelPrincipal.setLayout(new GridLayout());
        painelPrincipal.add(botaoOperacoes);
        painelPrincipal.add(botaoEstatisticas);
        botaoOperacoes.addActionListener(new Clicks());
        botaoEstatisticas.addActionListener(new Clicks());

        framePrincipal.add(painelPrincipal);
    }

    public class Clicks implements ActionListener {
         @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botaoOperacoes) {
                new Janelas(botaoOperacoes);
            }
            else if (e.getSource() == botaoEstatisticas) {
                new Janelas(botaoEstatisticas);
            }
        }
    }
}
