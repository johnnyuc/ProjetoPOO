package modulos.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Iniciar {

    JFrame framePrincipal = new JFrame("Bem-vindo à StarThrive");
    JPanel painelPrincipal = new JPanel();
    JLabel tituloLabel = new JLabel("StarThrive, Lda.");
    JTextArea descricaoTextArea = new JTextArea("StarThrive é uma empresa de desenvolvimento de software, com sede em Lisboa, Portugal. Foi fundada em 2019 por um grupo de estudantes do Instituto Superior Técnico, com o objetivo de desenvolver software de gestão empresarial.");
    JButton botaoOperacoes = new JButton("Operações");
    JButton botaoEstatisticas = new JButton("Estatísticas");

    public Iniciar() {
        framePrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        framePrincipal.setSize(600, 500);
        framePrincipal.setResizable(false);

        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        painelPrincipal.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        tituloLabel.setFont(new Font("Serif", Font.BOLD, 36));
        painelPrincipal.add(tituloLabel, Redimensionar(c, 1, 1, 0,0));
        painelPrincipal.add(descricaoTextArea, Redimensionar(c, 1, 1, 200,500));
        painelPrincipal.add(botaoOperacoes, Redimensionar(c, 5,5, 1, 1));
        painelPrincipal.add(botaoEstatisticas, Redimensionar(c, 6, 8, 6, 6));

        botaoOperacoes.addActionListener(new Clicks());
        botaoEstatisticas.addActionListener(new Clicks());

        framePrincipal.add(painelPrincipal);
        framePrincipal.setVisible(true);
    }


    // Documentação da Oracle usada para a criação deste método:
    // https://docs.oracle.com/javase/tutorial/uiswing/layout/gridbag.html
    private GridBagConstraints Redimensionar (GridBagConstraints c, int x, int y, int wx, int wy) {
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = wx;
        c.weighty = wy;
        c.gridx = x;
        c.gridy = y;
        return c;
    }

    private class Clicks implements ActionListener {
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
