package modulos.gui;

import java.awt.*;
import javax.swing.*;

public class Iniciar extends JFrame {

    public Iniciar() {
        initComponents();
    }
    private void initComponents() {

        JButton botaoOperacoes = new JButton();
        JButton botaoEstatisticas = new JButton();
        JButton botaoSair = new JButton();
        JLabel labelTitulo = new JLabel();
        JLabel labelIcone = new JLabel();
        JTextArea areaTexto = new JTextArea();
        JScrollPane elementoScroll = new JScrollPane();
        JLabel labelDireitos = new JLabel();

        setResizable(false);
        setTitle("Bem-vindo ao StarThrive Gestão!");
        setIconImage(new ImageIcon("starthrive.png").getImage());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
        labelTitulo.setText("StarThrive Gestão");
        labelIcone.setIcon(new ImageIcon("starthrive.png"));

        areaTexto.setEnabled(false);
        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        areaTexto.setText("\n\n  Bem-vindo ao software da StarThrive. \n\n  Aqui poderá entre outras coisas verificar as empresas que gere \n  bem como adicionar, remover ou editar parâmetros das suas \n  empresas. Além disso poderá verificar a performance delas, \n  através dos botões ao lado.");
        elementoScroll.setViewportView(areaTexto);

        botaoOperacoes.setText("Operações");
        botaoOperacoes.addActionListener(e -> new Janelas(e).setVisible(true));

        botaoEstatisticas.setText("Estatísticas");
        botaoEstatisticas.addActionListener(e -> new Janelas(e).setVisible(true));

        botaoSair.setText("Sair");
        botaoSair.addActionListener(e -> System.exit(0));

        labelDireitos.setText("Software desenvolvido por Johnny Fernandes e Saulo Piccirilo");

        // Gerado pelo NetBeans
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(labelTitulo)
                                .addGap(20, 20, 20)
                                .addComponent(labelIcone)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(labelDireitos, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                                        .addComponent(elementoScroll))
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(botaoOperacoes, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(botaoEstatisticas, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botaoSair, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)))
                                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(labelTitulo)
                                        .addComponent(labelIcone))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(elementoScroll, GroupLayout.PREFERRED_SIZE, 160, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(botaoOperacoes, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botaoEstatisticas, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botaoSair)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(labelDireitos)
                                .addGap(30, 30, 30))
        );
        pack();
    }
}
