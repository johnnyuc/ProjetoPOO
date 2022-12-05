package modulo.gui;

import modulo.empresas.GerirEmpresas;

import javax.swing.*;
import java.awt.event.*;

/**
 * Classe responsável pelo ecrã das estastícas
 */
public class JanelaEstatisticas extends JFrame {
    /**
     * Container (janela/recipiente) principal.
     */
    private JPanel painelMae;
    /**
     * Container (janela/recipiente) para os cafés.
     */
    private JScrollPane cafePanel;
    /**
     * Container (janela/recipiente) para as pastelarias.
     */
    private JScrollPane pastelariaPanel;
    /**
     * Container (janela/recipiente) para os restaurantes fast-food.
     */
    private JScrollPane fastfoodPanel;
    /**
     * Container (janela/recipiente) para os restaurantes locais.
     */
    private JScrollPane localPanel;
    /**
     * Container (janela/recipiente) para as frutarias.
     */
    private JScrollPane frutariaPanel;
    /**
     * Container (janela/recipiente) para os mercados.
     */
    private JScrollPane mercadoPanel;

    /**
     * Construtor utilizado para inicializar os componentes
     * @param StarThrive lista de empresas que se pretende exibir as informações
     */
    public JanelaEstatisticas(GerirEmpresas StarThrive) {
        initComponents(StarThrive);
    }

    /**
     * Método efetivamente responsável por inicializar os componentes
     * @param StarThrive lista de empresas que se pretende exibir as informações
     */
    private void initComponents(GerirEmpresas StarThrive) {
        this.setResizable(false);
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
        setIconImage(new ImageIcon("modulo/starthrive.png").getImage());
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
        gereLayout(layout);
    }
    /**
     * Função proveniente do Netbeans que constrói o layout da janela
     * @param layout Objeto do Netbeans que contém as informações referentes ao layout
     */
    private void gereLayout(GroupLayout layout){
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

    /**
     * Método para atualizar o ecrã e exibir as informações referente aos cafés
     * @param e evento que indica que a ação foi solicitada pelo utiliar
     */
    private void cafeActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(cafePanel);
        painelMae.repaint();
        painelMae.revalidate();
    }

    /**
     * Método para atualizar o ecrã e exibir as informações referente às pastelarias
     * @param e evento que indica que a ação foi solicitada pelo utiliar
     */
    private void pastelariaActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(pastelariaPanel);
        painelMae.repaint();
        painelMae.revalidate();
    }
    /**
     * Método para atualizar o ecrã e exibir as informações referente aos restaurantes fast-food
     * @param e evento que indica que a ação foi solicitada pelo utiliar
     */

    private void fastfoodActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(fastfoodPanel);
        painelMae.repaint();
        painelMae.revalidate();
    }
    /**
     * Método para atualizar o ecrã e exibir as informações referente aos restaurantes locais
     * @param e evento que indica que a ação foi solicitada pelo utiliar
     */

    private void localActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(localPanel);
        painelMae.repaint();
        painelMae.revalidate();
    }
    /**
     * Método para atualizar o ecrã e exibir as informações referente às frutarias
     * @param e evento que indica que a ação foi solicitada pelo utiliar
     */
    private void frutariaActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(frutariaPanel);
        painelMae.repaint();
        painelMae.revalidate();
    }
    /**
     * Método para atualizar o ecrã e exibir as informações referente aos mercados
     * @param e evento que indica que a ação foi solicitada pelo utilizador
     */

    private void mercadoActionPerformed(ActionEvent e) {
        painelMae.removeAll();
        painelMae.add(mercadoPanel);
        painelMae.repaint();
        painelMae.revalidate();
    }

}
