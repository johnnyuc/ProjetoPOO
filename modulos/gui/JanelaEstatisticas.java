package modulos.gui;

import modulos.empresas.GerirEmpresas;

import javax.swing.*;
import java.awt.event.*;

public class JanelaEstatisticas extends JFrame {

    private JPanel painelMae;
    private JScrollPane cafePanel;
    private JScrollPane pastelariaPanel;
    private JScrollPane fastfoodPanel;
    private JScrollPane localPanel;
    private JScrollPane frutariaPanel;
    private JScrollPane mercadoPanel;
    public JanelaEstatisticas(GerirEmpresas StarThrive) {
        initComponents(StarThrive);
    }

    private void initComponents(GerirEmpresas StarThrive) {

        painelMae = new JPanel();
        cafePanel = new JScrollPane();
        JTextArea cafeArea = new JTextArea();
        pastelariaPanel = new JScrollPane();
        JTextArea pastelariaArea = new JTextArea();
        fastfoodPanel = new JScrollPane();
        JTextArea fastfoodArea = new JTextArea();
        localPanel = new JScrollPane();
        JTextArea localArea = new JTextArea();
        frutariaPanel = new JScrollPane();
        JTextArea frutariaArea = new JTextArea();
        mercadoPanel = new JScrollPane();
        JTextArea mercadoArea = new JTextArea();
        JMenuBar jMenuBar1 = new JMenuBar();
        JMenu jMenu1 = new JMenu();
        JMenuItem cafe = new JMenuItem();
        JMenuItem pastelaria = new JMenuItem();
        JMenuItem fastfood = new JMenuItem();
        JMenuItem local = new JMenuItem();
        JMenuItem frutaria = new JMenuItem();
        JMenuItem mercado = new JMenuItem();

        setTitle("Secção de estatísticas");
        setIconImage(new ImageIcon("starthrive.png").getImage());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        painelMae.setLayout(new java.awt.CardLayout());

        cafeArea.setEnabled(false);
        cafeArea.setColumns(20);
        cafeArea.setRows(5);
        cafeArea.setText(StarThrive.maiorLucroAnual(0)+"\n"+StarThrive.menorDespesaAnual(0)+"\n"+StarThrive.maiorReceitaAnual(0)+"\n"+StarThrive.maiorCapacidadeClientes(0));
        cafePanel.setViewportView(cafeArea);
        painelMae.add(cafePanel, "card2");

        pastelariaArea.setEnabled(false);
        pastelariaArea.setColumns(20);
        pastelariaArea.setRows(5);
        pastelariaArea.setText(StarThrive.maiorLucroAnual(1)+"\n"+StarThrive.menorDespesaAnual(1)+"\n"+StarThrive.maiorReceitaAnual(1)+"\n"+StarThrive.maiorCapacidadeClientes(1));
        pastelariaPanel.setViewportView(pastelariaArea);
        painelMae.add(pastelariaPanel, "card3");

        fastfoodArea.setEnabled(false);
        fastfoodArea.setColumns(20);
        fastfoodArea.setRows(5);
        fastfoodArea.setText(StarThrive.maiorLucroAnual(2)+"\n"+StarThrive.menorDespesaAnual(2)+"\n"+StarThrive.maiorReceitaAnual(2)+"\n"+StarThrive.maiorCapacidadeClientes(2));
        fastfoodPanel.setViewportView(fastfoodArea);
        painelMae.add(fastfoodPanel, "card4");

        localArea.setEnabled(false);
        localArea.setColumns(20);
        localArea.setRows(5);
        localArea.setText(StarThrive.maiorLucroAnual(3)+"\n"+StarThrive.menorDespesaAnual(3)+"\n"+StarThrive.maiorReceitaAnual(3)+"\n"+StarThrive.maiorCapacidadeClientes(3));
        localPanel.setViewportView(localArea);
        painelMae.add(localPanel, "card5");

        frutariaArea.setEnabled(false);
        frutariaArea.setColumns(20);
        frutariaArea.setRows(5);
        frutariaArea.setText(StarThrive.maiorLucroAnual(4)+"\n"+StarThrive.menorDespesaAnual(4)+"\n"+StarThrive.maiorReceitaAnual(4)+"\n"+StarThrive.maiorCapacidadeClientes(4));
        frutariaPanel.setViewportView(frutariaArea);
        painelMae.add(frutariaPanel, "card6");

        mercadoArea.setEnabled(false);
        mercadoArea.setColumns(20);
        mercadoArea.setRows(5);
        mercadoArea.setText(StarThrive.maiorLucroAnual(5)+"\n"+StarThrive.menorDespesaAnual(5)+"\n"+StarThrive.maiorReceitaAnual(5)+"\n"+StarThrive.maiorCapacidadeClientes(5));
        mercadoPanel.setViewportView(mercadoArea);
        painelMae.add(mercadoPanel, "card7");

        jMenu1.setText("Estatísticas");

        cafe.setText("Café");
        cafe.addActionListener(this::cafeActionPerformed);
        jMenu1.add(cafe);

        pastelaria.setText("Pastelaria");
        pastelaria.addActionListener(this::pastelariaActionPerformed);
        jMenu1.add(pastelaria);

        fastfood.setText("Restaurante Fastfood");
        fastfood.addActionListener(this::fastfoodActionPerformed);
        jMenu1.add(fastfood);

        local.setText("Restaurante Local");
        local.addActionListener(this::localActionPerformed);
        jMenu1.add(local);

        frutaria.setText("Frutaria");
        frutaria.addActionListener(this::frutariaActionPerformed);
        jMenu1.add(frutaria);

        mercado.setText("Mercado");
        mercado.addActionListener(this::mercadoActionPerformed);
        jMenu1.add(mercado);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(painelMae, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(painelMae, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );

        pack();
    }

    private void cafeActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(cafePanel);
        painelMae.repaint();
        painelMae.revalidate();
    }


    private void pastelariaActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(pastelariaPanel);
        painelMae.repaint();
        painelMae.revalidate();
    }

    private void fastfoodActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(fastfoodPanel);
        painelMae.repaint();
        painelMae.revalidate();
    }

    private void localActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(localPanel);
        painelMae.repaint();
        painelMae.revalidate();
    }

    private void frutariaActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(frutariaPanel);
        painelMae.repaint();
        painelMae.revalidate();
    }

    private void mercadoActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(mercadoPanel);
        painelMae.repaint();
        painelMae.revalidate();
    }

}
