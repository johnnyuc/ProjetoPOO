package modulos.gui;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JanelaCriaEdita extends JFrame {


    JComboBox<String> jComboBox1 = new JComboBox<>();
    JLabel jLabel13 = new JLabel();
    JLabel jLabel1 = new JLabel("Nome da empresa");
    JTextField jTextField1 = new JTextField("jTextField1");
    JLabel jLabel2 = new JLabel("Distrito da empresa");
    JTextField jTextField2 = new JTextField("jTextField2");
    JLabel jLabel3 = new JLabel("Latitude de localização");
    JTextField jTextField3 = new JTextField("jTextField3");
    JLabel jLabel4 = new JLabel("Longitude de localização");
    JTextField jTextField4 = new JTextField("jTextField4");
    JLabel jLabel5 = new JLabel();
    JTextField jTextField5 = new JTextField("jTextField5");
    JLabel jLabel6 = new JLabel();
    JTextField jTextField6 = new JTextField("jTextField6");
    JLabel jLabel7 = new JLabel();
    JTextField jTextField7 = new JTextField("jTextField7");
    JLabel jLabel8 = new JLabel();
    JTextField jTextField8 = new JTextField("jTextField8");
    JLabel jLabel9 = new JLabel();
    JTextField jTextField9 = new JTextField("jTextField9");
    JLabel jLabel10 = new JLabel();
    JTextField jTextField10 = new JTextField("jTextField10");
    JLabel jLabel11 = new JLabel();
    JTextField jTextField11 = new JTextField("jTextField11");
    JLabel jLabel12 = new JLabel();
    JTextField jTextField12 = new JTextField("jTextField12");
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();

    public JanelaCriaEdita(ActionEvent e) {
        if (e.getActionCommand().equals("Criar empresa")) {
            initComponentsCriar();
        } else if (e.getActionCommand().equals("Editar empresa")) {
            System.out.println("Editar empresa");
            //initComponentsEditar();
        }
        setResizable(false);
        setIconImage(new ImageIcon("starthrive.png").getImage());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void initComponentsCriar() {

        setTitle("Adicionar empresa");

        jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] { "Café", "Pastelaria", "Restaurante Fastfood", "Restaurante Local", "Frutaria", "Mercado" }));
        jLabel13.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        jLabel13.setText("Adicionar empresa");


        // Defaults
        jLabel5.setText("Nº Empregados");
        jTextField5.setVisible(true);
        jLabel6.setText("Salário Médio Anual");
        jTextField6.setVisible(true);
        jLabel7.setText("Média de clientes por dia");
        jTextField7.setVisible(true);
        jLabel8.setText("Média de cafés por dia");
        jLabel8.setVisible(true);
        jTextField8.setVisible(true);
        jLabel9.setText("Fat. Média Anual por café");
        jLabel9.setVisible(true);
        jTextField9.setVisible(true);
        jTextField10.setVisible(false);
        jLabel10.setVisible(false);
        jTextField11.setVisible(false);
        jLabel11.setVisible(false);
        jTextField12.setVisible(false);
        jLabel12.setVisible(false);

        // On change
        jComboBox1.addActionListener(e -> {
            if (jComboBox1.getSelectedItem().equals("Café")) {
                jLabel5.setText("Nº Empregados");
                jTextField5.setVisible(true);
                jLabel6.setText("Salário Médio Anual");
                jTextField6.setVisible(true);
                jLabel7.setText("Média de clientes por dia");
                jTextField7.setVisible(true);
                jLabel8.setText("Média de cafés por dia");
                jLabel8.setVisible(true);
                jTextField8.setVisible(true);
                jLabel9.setText("Fat. Média Anual por café");
                jLabel9.setVisible(true);
                jTextField9.setVisible(true);
                jTextField10.setVisible(false);
                jLabel10.setVisible(false);
                jTextField11.setVisible(false);
                jLabel11.setVisible(false);
                jTextField12.setVisible(false);
                jLabel12.setVisible(false);

            } else if (jComboBox1.getSelectedItem().equals("Pastelaria")) {
                jLabel5.setText("Nº Empregados");
                jTextField5.setVisible(true);
                jLabel6.setText("Salário Médio Anual");
                jTextField6.setVisible(true);
                jLabel7.setText("Média de clientes por dia");
                jTextField7.setVisible(true);
                jLabel8.setText("Média de bolos por dia");
                jLabel8.setVisible(true);
                jTextField8.setVisible(true);
                jLabel9.setText("Fat. Média Anual por bolo");
                jLabel9.setVisible(true);
                jTextField9.setVisible(true);
                jLabel10.setVisible(false);
                jTextField10.setVisible(false);
                jLabel11.setVisible(false);
                jTextField11.setVisible(false);
                jLabel12.setVisible(false);
                jTextField12.setVisible(false);

            } else if (jComboBox1.getSelectedItem().equals("Restaurante Fastfood")) {
                jLabel5.setText("Nº Empregados");
                jTextField5.setVisible(true);
                jLabel6.setText("Salário Médio Anual");
                jTextField6.setVisible(true);
                jLabel7.setText("Média de clientes/dia");
                jTextField7.setVisible(true);
                jLabel8.setText("Dias de funcionamento/ano");
                jLabel8.setVisible(true);
                jTextField8.setVisible(true);
                jLabel9.setText("Nº mesas interiores");
                jLabel9.setVisible(true);
                jTextField9.setVisible(true);
                jLabel10.setText("Fat. média por mesa/dia");
                jLabel10.setVisible(true);
                jTextField10.setVisible(true);
                jLabel11.setText("Média de clientes Drive-Thru/dia");
                jLabel11.setVisible(true);
                jTextField11.setVisible(true);
                jLabel12.setText("Fat. média por cliente Drive-Thru");
                jLabel12.setVisible(true);
                jTextField12.setVisible(true);

            } else if (jComboBox1.getSelectedItem().equals("Restaurante Local")) {
                jLabel5.setText("Nº Empregados");
                jTextField5.setVisible(true);
                jLabel6.setText("Salário Médio Anual");
                jTextField6.setVisible(true);
                jLabel7.setText("Média de clientes/dia");
                jTextField7.setVisible(true);
                jLabel8.setText("Dias de funcionamento/ano");
                jLabel8.setVisible(true);
                jTextField8.setVisible(true);
                jLabel9.setText("Nº mesas interiores");
                jLabel9.setVisible(true);
                jTextField9.setVisible(true);
                jLabel10.setText("Nº mesas exteriores");
                jLabel10.setVisible(true);
                jTextField10.setVisible(true);
                jLabel11.setText("Custo por licença de mesa ext.");
                jLabel11.setVisible(true);
                jTextField11.setVisible(true);
                jLabel12.setText("Fat. média por mesa/dia");
                jLabel12.setVisible(true);
                jTextField12.setVisible(true);

            } else if (jComboBox1.getSelectedItem().equals("Frutaria")) {
                jLabel5.setText("Custo anual de limpeza");
                jTextField5.setVisible(true);
                jLabel6.setText("Nº de produtos para venda");
                jTextField6.setVisible(true);
                jLabel7.setText("Fat. média anual por produto");
                jTextField7.setVisible(true);
                jTextField8.setVisible(false);
                jLabel8.setVisible(false);
                jTextField9.setVisible(false);
                jLabel9.setVisible(false);
                jTextField10.setVisible(false);
                jLabel10.setVisible(false);
                jTextField11.setVisible(false);
                jLabel11.setVisible(false);
                jTextField12.setVisible(false);
                jLabel12.setVisible(false);

            } else if (jComboBox1.getSelectedItem().equals("Mercado")) {
                jLabel5.setText("Custo anual de limpeza");
                jTextField5.setVisible(true);
                jLabel6.setText("Tipo de mercado");
                jTextField6.setVisible(true);
                jLabel7.setText("Área dos corredores (m2)");
                jTextField7.setVisible(true);
                jLabel7.setText("Fat. média anual por m2");
                jTextField8.setVisible(true);
                jTextField8.setVisible(false);
                jLabel8.setVisible(false);
                jTextField9.setVisible(false);
                jLabel9.setVisible(false);
                jTextField10.setVisible(false);
                jLabel10.setVisible(false);
                jTextField11.setVisible(false);
                jLabel11.setVisible(false);
                jTextField12.setVisible(false);
                jLabel12.setVisible(false);
            }
        });

        jButton1.setText("Guardar");
        jButton2.setText("Fechar");

        // Gerado pelo NetBeans
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel13))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel2))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField3, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 450, Short.MAX_VALUE)
                                                .addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jButton1)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton2)
                                                .addGap(40, 40, 40))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField7, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField8, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField9, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField10, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel12))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton1)
                                        .addComponent(jButton2))
                                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }
}
