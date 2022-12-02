package modulos.gui;

import java.awt.*;

public class test extends javax.swing.JFrame {
    public test() {
        initComponents();
    }

    private void initComponents() {

        System.out.println("A iniciar a interface gráfica...");
        javax.swing.JLabel starTitle = new javax.swing.JLabel();
        javax.swing.JButton botaoOperacoes = new javax.swing.JButton();
        javax.swing.JButton botaoEstatisticas = new javax.swing.JButton();
        javax.swing.JScrollPane descricaoScroll = new javax.swing.JScrollPane();
        javax.swing.JTextArea campoDescricao = new javax.swing.JTextArea();
        javax.swing.JLabel gap = new javax.swing.JLabel();
        javax.swing.JLabel starIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        starTitle.setFont(new java.awt.Font("Tempus Sans ITC", Font.BOLD, 36)); // NOI18N
        starTitle.setText("StarThrive, Lda.");

        botaoOperacoes.setText("Operações");
        botaoOperacoes.setMaximumSize(new java.awt.Dimension(90, 30));
        botaoOperacoes.setMinimumSize(new java.awt.Dimension(90, 30));
        botaoOperacoes.addActionListener(this::jButton1ActionPerformed);

        botaoEstatisticas.setText("Estatísticas");
        botaoEstatisticas.addActionListener(this::jButton2ActionPerformed);

        campoDescricao.setColumns(20);
        campoDescricao.setRows(5);
        campoDescricao.setText("\nBem-vindo ao software da StarThrive. \n\nAqui poderá entre outras coisas verificar as empresas\nque gere bem como adicionar, remover ou editar \nparâmetros das suas empresas. Além disso poderá\nverificar a performance delas, através dos botões abaixo.");
        campoDescricao.setEnabled(false);
        descricaoScroll.setViewportView(campoDescricao);

        starIcon.setIcon(new javax.swing.ImageIcon("starthrive.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(gap)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(starTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(starIcon))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(botaoOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(botaoEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(descricaoScroll))
                                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(gap)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(starIcon)
                                        .addComponent(starTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(descricaoScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(botaoOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(botaoEstatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(48, Short.MAX_VALUE))
        );
        pack();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent e) {
        // TODO add your handling code here:
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent e) {
        // TODO add your handling code here:
    }
}
