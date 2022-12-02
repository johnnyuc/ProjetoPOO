package modulos.gui;

import modulos.empresas.GerirEmpresas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.table.DefaultTableModel;

public class Janelas extends JFrame {

    public Janelas(ActionEvent e) {
        if (e.getActionCommand().equals("Operações")) {
            initComponentsOperacoes();
        } else if (e.getActionCommand().equals("Estatísticas")) {
            System.out.println("Estatísticas");
            //initComponentsEstatisticas();
        }
    }

    private void initComponentsOperacoes() {

        JScrollPane jScrollPane2 = new JScrollPane();
        JTable jTable1 = new JTable();
        JButton jButton1 = new JButton();
        JButton jButton2 = new JButton();
        JButton jButton3 = new JButton();
        JButton jButton4 = new JButton();
        JButton jButton5 = new JButton();

        setResizable(false);
        setTitle("Secção de Operações");
        setIconImage(new ImageIcon("starthrive.png").getImage());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new DefaultTableModel(
                arrayDadosEmpresas(),
                new String [] {
                        "Nome", "Tipo de empresa", "Distrito", "Receita Anual", "Despesa Anual", "Lucro"
                }) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton1.setText("Criar empresa");
        jButton1.addActionListener(e->{
            int[] rows = jTable1.getSelectedRows();
            System.out.println(Arrays.toString(rows));

        });

        jButton2.setText("Remover empresa");
        jButton2.addActionListener(e->{
            int[] linha = jTable1.getSelectedRows();
            for (int j : linha) {
                GerirEmpresas.apagarEmpresa(jTable1.getModel().getValueAt(j, 0).toString());
            }
        });

        jButton3.setText("Editar empresa");
        jButton3.addActionListener(e->{

        });

        jButton4.setText("Pesquisar empresa");
        jButton4.addActionListener(e->{

        });

        jButton5.setText("Fechar");
        jButton5.addActionListener(e-> dispose());

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 1080, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jButton2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                                        .addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }
    private Object[][] arrayDadosEmpresas() {
        Object[][] dados = new Object[GerirEmpresas.empresas.size()][6];
        String[] tipos= {"Café","Pastelaria","Restaurante Local","Restaurante Fast-Food","Frutaria"
                ,"Mercado"};
        for (int i = 0; i < GerirEmpresas.empresas.size(); i++) {
            dados[i][0] = GerirEmpresas.empresas.get(i).getNome();
            dados[i][1] = tipos[GerirEmpresas.empresas.get(i).getTipo()];
            dados[i][2] = GerirEmpresas.empresas.get(i).getDistrito();
            dados[i][3] = String.format("%.2f",GerirEmpresas.empresas.get(i).calcularReceitaAnual());
            dados[i][4] = String.format("%.2f",GerirEmpresas.empresas.get(i).calcularDespesaAnual());
            float lucro= GerirEmpresas.empresas.get(i).calcularLucro();
            if(lucro>0){
                dados[i][5]="Sim";
            }
            else{
                dados[i][5]="Não";
            }
        }
        return dados;
    }
}
