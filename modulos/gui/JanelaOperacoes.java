package modulos.gui;

import modulos.dados.*;
import modulos.empresas.*;

import javax.swing.*;
import javax.swing.table.*;

public class JanelaOperacoes extends JFrame {

    private final JanelaOperacoes selfInstance;
    JScrollPane jScrollPane2 = new JScrollPane();
    JTable tabela = new JTable();
    JButton botaoCriar = new JButton();
    JButton botaoRemover = new JButton();
    JButton botaoEditar = new JButton();
    JButton botaoPesquisar = new JButton();
    JButton botaoFechar = new JButton();
    GroupLayout layout = new GroupLayout(getContentPane());

    public JanelaOperacoes() {
        initComponentsOperacoes();

        setResizable(false);
        setIconImage(new ImageIcon("starthrive.png").getImage());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        selfInstance = this;
    }

    private void initComponentsOperacoes() {

        setTitle("Secção de Operações");
        atualizarLista();
        tabela.setAutoCreateRowSorter(true);
        jScrollPane2.setViewportView(tabela);

        // Botão de adicionar empresa
        botaoCriar.setText("Criar empresa");
        botaoCriar.addActionListener(e-> new JanelaCriaEdita(selfInstance).setVisible(true));

        // Botão de remover empresa
        botaoRemover.setText("Remover empresa");
        botaoRemover.addActionListener(e->{
            int[] linha = tabela.getSelectedRows();
            if (linha.length > 0) {
                int option = JOptionPane.showConfirmDialog(null,
                        "Tem a certeza que pretende remover o(s) elemento(s) selecionado(s)?", "Remover", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    // Tem que ser no sentido inverso porque quando se apagam múltiplas linhas
                    // a tabela vai mudando de tamanho e as linhas seguintes vão mudando de posição
                    // Também tem em consideração a posição original da linha através do converRowIndexToModel
                    for (int i = linha.length-1; i >= 0; i--) {
                        // Remove a empresa com base no seu nome — relembrando que não há duas empresas com o mesmo nome
                        GerirEmpresas.apagarEmpresa(tabela.getValueAt(linha[i], 0).toString());
                    }
                    atualizarLista();
                }
                Escritor.guardaDadosDat(GerirEmpresas.empresas);
            } else {
                JOptionPane.showMessageDialog(null, "Selecione pelo menos uma linha para remover.");
            }
        });

        // Botão de editar empresa
        botaoEditar.setText("Editar empresa");
        botaoEditar.addActionListener(e-> {
            int[] linha = tabela.getSelectedRows();
            if (linha.length == 1) {
                new JanelaCriaEdita(selfInstance, tabela.getValueAt(linha[0],0).toString()).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Selecione apenas uma linha para editar.");
            }
        });

        // Botão de pesquisar empresa
        botaoPesquisar.setText("Pesquisar empresa");
        botaoPesquisar.addActionListener(e->{
            String[] opcoes = {"Pesquisar","Lucro", "Todos"};
            switch (JOptionPane.showOptionDialog(null, "Indique qual o tipo de pesquisa que pretende", "Pesquisar", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, null)) {
                case 0:
                    String valor = JOptionPane.showInputDialog("Indique o parâmetro de pesquisa");
                    if (valor != null) {
                        sorter(tabela, valor.toLowerCase());
                    }
                    break;
                case 1:
                    sorter(tabela, "Sim");
                    break;
                case 2:
                default:
                    sorter(tabela, "");
                    break;
            }
        });

        // Botão de fechar janela
        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(e-> dispose());

       gereLayout(layout);
    }

    private void gereLayout(GroupLayout layout) {
        // Gerado pelo NetBeans
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 1080, GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(20, 20, 20)
                                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(botaoRemover, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(botaoCriar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(botaoEditar, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                                        .addComponent(botaoPesquisar, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                                .addComponent(botaoFechar, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                                                .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(botaoCriar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(botaoRemover, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(botaoEditar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(botaoPesquisar, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(botaoFechar, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pack();
    }

    private static Object[][] arrayDadosEmpresas() {
        Object[][] dados = new Object[GerirEmpresas.empresas.size()][6];
        String[] tipos= {"Café","Pastelaria","Restaurante Fastfood","Restaurante Local","Frutaria"
                ,"Mercado"};
        for (int i = 0; i < GerirEmpresas.empresas.size(); i++) {
            dados[i][0] = GerirEmpresas.empresas.get(i).getNome();
            dados[i][1] = tipos[GerirEmpresas.empresas.get(i).getTipo()];
            dados[i][2] = GerirEmpresas.empresas.get(i).getDistrito();
            dados[i][3] = String.format("%.2f €",GerirEmpresas.empresas.get(i).calcularReceitaAnual());
            dados[i][4] = String.format("%.2f €",GerirEmpresas.empresas.get(i).calcularDespesaAnual());
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

    private void sorter (JTable table, String string) {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(table.getModel());
        // Para corrigir o case sensitiveness do sorter
        //Snippet from: https://stackoverflow.com/questions/20325722/how-can-i-perform-a-case-insensitive-filter-on-a-jtable
        sorter.setRowFilter(RowFilter.regexFilter("(?i)" + string));
        table.setRowSorter(sorter);
    }

    protected void atualizarLista() {
        this.tabela.setModel(new DefaultTableModel(arrayDadosEmpresas(), new String [] {
                "Nome", "Tipo de empresa", "Distrito", "Receita Anual", "Despesa Anual", "Lucro"
        }) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
    }

}
