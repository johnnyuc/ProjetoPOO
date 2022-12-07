import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Classe utilizada para criar novas janelas e editar janelas preexistentes
 */
public class JanelaCriaEdita extends JFrame {

    /**
     * Janela principal de operações
     */
    private final JanelaOperacoes janelaMae;

    /**
     * Empresa a ser editada
     */
    private Empresa editar;

    /**
     * Botão para o utilizador escolher a opção desejada
     */
    private final JComboBox<String> botaoSelecionador = new JComboBox<>();

    /**
     * Área destinada a mostrar as informações
     */
    private final JLabel labelInfo = new JLabel();

    /**
     * Área destinada a exibit o nome da empresa
     */
    private final JLabel jLabel1 = new JLabel("Nome da empresa");

    /**
     * Secção de texto
     */
    private final JTextField jTextField1 = new JTextField();

    /**
     * Área destinada a exibir o distrito da empresa
     */
    private final JLabel jLabel2 = new JLabel("Distrito da empresa");

    /**
     * Secção de texto
     */
    private final JTextField jTextField2 = new JTextField();

    /**
     * Área destinada a exibir a latitude das coordenadas da empresa
     */
    private final JLabel jLabel3 = new JLabel("Latitude de localização");

    /**
     * Secção de texto
     */
    private final JTextField jTextField3 = new JTextField();

    /**
     * Área destinada a exibir a longitude das coordenadas da empresa
     */
    private final JLabel jLabel4 = new JLabel("Longitude de localização");

    /**
     * Secção de texto
     */
    private final JTextField jTextField4 = new JTextField();

    /**
     * Área destinada a exibir a um texto, imagem, ou ambos.
     */
    private final JLabel jLabel5 = new JLabel();

    /**
     * Secção de texto
     */
    private final JTextField jTextField5 = new JTextField();

    /**
     * Área destinada a exibir a um texto, imagem, ou ambos.
     */
    private final JLabel jLabel6 = new JLabel();

    /**
     * Secção de texto
     */
    private final JTextField jTextField6 = new JTextField();

    /**
     * Área destinada a exibir a um texto, imagem, ou ambos.
     */
    private final JLabel jLabel7 = new JLabel();

    /**
     * Secção de texto
     */
    private final JTextField jTextField7 = new JTextField();

    /**
     * Área destinada a exibir a um texto, imagem, ou ambos.
     */
    private final JLabel jLabel8 = new JLabel();

    /**
     * Secção de texto
     */
    private final JTextField jTextField8 = new JTextField();

    /**
     * Área destinada a exibir a um texto, imagem, ou ambos.
     */
    private final JLabel jLabel9 = new JLabel();

    /**
     * Secção de texto
     */
    private final JTextField jTextField9 = new JTextField();

    /**
     * Área destinada a exibir a um texto, imagem, ou ambos.
     */
    private final JLabel jLabel10 = new JLabel();

    /**
     * Secção de texto
     */
    private final JTextField jTextField10 = new JTextField();

    /**
     * Área destinada a exibir a um texto, imagem, ou ambos.
     */
    private final JLabel jLabel11 = new JLabel();

    /**
     * Secção de texto
     */
    private final JTextField jTextField11 = new JTextField();

    /**
     * Área destinada a exibir a um texto, imagem, ou ambos.
     */
    private final JLabel jLabel12 = new JLabel();

    /**
     * Secção de texto
     */
    private final JTextField jTextField12 = new JTextField();

    /**
     * Botão para guardar as informações alteradas
     */
    private final JButton botaoGuardar = new JButton();

    /**
     * Botão para fechar a janela
     */
    private final JButton botaoFechar = new JButton();

    /**
     * Objeto proveniente do Netbeans utilizado para guardar as informações referentes
     * ao layout da janela
     */
    private final GroupLayout layout = new GroupLayout(getContentPane());

    /**
     * Construtor responsável por inicializar a janela de criar
     * @param janelaMae a janela de operações
     * @param StarThrive lista de empresas a serem geridas
     */
    public JanelaCriaEdita(GerirEmpresas StarThrive, JanelaOperacoes janelaMae) {
        initComponentsCriar(StarThrive);
        this.janelaMae = janelaMae;
        setResizable(false);
        setIconImage(new ImageIcon("starthrive.png").getImage());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * Construtor responsável por inicializar a janela de editar empresas
     * @param janelaMae a janela de operações
     * @param nome nome da empresa a ser editada
     * @param StarThrive lista de empresas a serem geridas
     */
    public JanelaCriaEdita(GerirEmpresas StarThrive, JanelaOperacoes janelaMae, String nome) {
        initComponentsEditar(StarThrive, nome);
        this.janelaMae = janelaMae;
        setResizable(false);
        setIconImage(new ImageIcon("starthrive.png").getImage());
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }

    // Métodos

    /**
     * Método responsável por inicializar os componentes(botões, secções de texto, etc.) para se criar uma empresa
     */
    private void initComponentsCriar(GerirEmpresas StarThrive) {

        setTitle("Adicionar empresa");

        botaoSelecionador.setModel(new DefaultComboBoxModel<>(new String[] { "Café", "Pastelaria", "Restaurante Fastfood", "Restaurante Local", "Frutaria", "Mercado" }));
        labelInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        labelInfo.setText("Adicionar empresa");

        // On change
        botaoSelecionador.addActionListener(this::botaoSelecionadorActionPerformed);
        // Defaults
        botaoSelecionador.setSelectedIndex(0);

        // Botão para criar empresa nova
        botaoGuardar.setText("Guardar");
        botaoGuardar.addActionListener(new BotaoGuardarActionListener(StarThrive));

        // Botão para fechar a janela
        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(e -> dispose());

        gereLayout(layout);
    }

    /**
     * Método utilizada para inicializar os componentes para editar uma empresa
     * @param nome Nome da empresa
     */
    private void initComponentsEditar(GerirEmpresas StarThrive, String nome) {

        setTitle("Editar empresa");

        botaoSelecionador.setModel(new DefaultComboBoxModel<>(new String[] { "Café", "Pastelaria", "Restaurante Fastfood", "Restaurante Local", "Frutaria", "Mercado" }));
        labelInfo.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        labelInfo.setText("Editar empresa");
        botaoSelecionador.setSelectedIndex(0);

        // On change
        botaoSelecionador.addActionListener(this::botaoSelecionadorActionPerformed);

        // Defaults e carregamento de dados
        editar = StarThrive.pesquisarEmpresa(nome);
        switch (Objects.requireNonNull(editar).getCategoriaEmpresa()) {
            case 0:
                botaoSelecionador.setSelectedIndex(0);
                Cafe cafe = (Cafe) editar;
                jTextField1.setText(cafe.getNome());
                jTextField2.setText(cafe.getDistrito());
                jTextField3.setText(String.valueOf(cafe.getCoordenadas()[0]));
                jTextField4.setText(String.valueOf(cafe.getCoordenadas()[1]));
                jTextField5.setText(String.valueOf(cafe.getEmpregadosMesa()));
                jTextField6.setText(String.valueOf(cafe.getSalarioMedioAnual()));
                jTextField7.setText(String.valueOf(cafe.getClientesMedioDiario()));
                jTextField8.setText(String.valueOf(cafe.getCafesMedioDiario()));
                jTextField9.setText(String.valueOf(cafe.getFaturacaoMediaAnualCafe()));
                break;
            case 1:
                botaoSelecionador.setSelectedIndex(1);
                Pastelaria pastelaria = (Pastelaria) editar;
                jTextField1.setText(pastelaria.getNome());
                jTextField2.setText(pastelaria.getDistrito());
                jTextField3.setText(String.valueOf(pastelaria.getCoordenadas()[0]));
                jTextField4.setText(String.valueOf(pastelaria.getCoordenadas()[1]));
                jTextField5.setText(String.valueOf(pastelaria.getEmpregadosMesa()));
                jTextField6.setText(String.valueOf(pastelaria.getSalarioMedioAnual()));
                jTextField7.setText(String.valueOf(pastelaria.getClientesMedioDiario()));
                jTextField8.setText(String.valueOf(pastelaria.getBolosMedioDiario()));
                jTextField9.setText(String.valueOf(pastelaria.getFaturacaoMediaAnualBolo()));
                break;
            case 2:
                botaoSelecionador.setSelectedIndex(2);
                Fastfood fastfood = (Fastfood) editar;
                jTextField1.setText(fastfood.getNome());
                jTextField2.setText(fastfood.getDistrito());
                jTextField3.setText(String.valueOf(fastfood.getCoordenadas()[0]));
                jTextField4.setText(String.valueOf(fastfood.getCoordenadas()[1]));
                jTextField5.setText(String.valueOf(fastfood.getEmpregadosMesa()));
                jTextField6.setText(String.valueOf(fastfood.getSalarioMedioAnual()));
                jTextField7.setText(String.valueOf(fastfood.getClientesMedioDiario()));
                jTextField8.setText(String.valueOf(fastfood.getDiasFuncionamento()));
                jTextField9.setText(String.valueOf(fastfood.getMesasInterior()));
                jTextField10.setText(String.valueOf(fastfood.getFaturacaoMediaMesaDiario()));
                jTextField11.setText(String.valueOf(fastfood.getClientesMedioDrive()));
                jTextField12.setText(String.valueOf(fastfood.getFaturacaoMediaClienteDrive()));
                break;
            case 3:
                botaoSelecionador.setSelectedIndex(3);
                Local local = (Local) editar;
                jTextField1.setText(local.getNome());
                jTextField2.setText(local.getDistrito());
                jTextField3.setText(String.valueOf(local.getCoordenadas()[0]));
                jTextField4.setText(String.valueOf(local.getCoordenadas()[1]));
                jTextField5.setText(String.valueOf(local.getEmpregadosMesa()));
                jTextField6.setText(String.valueOf(local.getSalarioMedioAnual()));
                jTextField7.setText(String.valueOf(local.getClientesMedioDiario()));
                jTextField8.setText(String.valueOf(local.getDiasFuncionamento()));
                jTextField9.setText(String.valueOf(local.getMesasInterior()));
                jTextField10.setText(String.valueOf(local.getMesasEsplanada()));
                jTextField11.setText(String.valueOf(local.getCustoLicencaMesaEsplanada()));
                jTextField12.setText(String.valueOf(local.getFaturacaoMediaMesaDiario()));
                break;
            case 4:
                botaoSelecionador.setSelectedIndex(4);
                Frutaria frutaria = (Frutaria) editar;
                jTextField1.setText(frutaria.getNome());
                jTextField2.setText(frutaria.getDistrito());
                jTextField3.setText(String.valueOf(frutaria.getCoordenadas()[0]));
                jTextField4.setText(String.valueOf(frutaria.getCoordenadas()[1]));
                jTextField5.setText(String.valueOf(frutaria.getCustoAnualLimpeza()));
                jTextField6.setText(String.valueOf(frutaria.getNumeroProdutos()));
                jTextField7.setText(String.valueOf(frutaria.getFaturacaoMediaAnualProduto()));
                break;
            case 5:
                botaoSelecionador.setSelectedIndex(5);
                Mercado mercado = (Mercado) editar;
                jTextField1.setText(mercado.getNome());
                jTextField2.setText(mercado.getDistrito());
                jTextField3.setText(String.valueOf(mercado.getCoordenadas()[0]));
                jTextField4.setText(String.valueOf(mercado.getCoordenadas()[1]));
                jTextField5.setText(String.valueOf(mercado.getCustoAnualLimpeza()));
                jTextField6.setText(String.valueOf(mercado.getTipoMercado()));
                jTextField7.setText(String.valueOf(mercado.getAreaCorredores()));
                jTextField8.setText(String.valueOf(mercado.getFaturacaoMediaAnualM2()));
                break;
        }

        // Botão para guardar as alterações feitas à empresa
        botaoSelecionador.setEnabled(false);
        botaoGuardar.setText("Alterar");
        botaoGuardar.addActionListener(new BotaoAlterarActionListener(StarThrive));

        // Botão para fechar a janela
        botaoFechar.setText("Fechar");
        botaoFechar.addActionListener(e -> dispose());

        gereLayout(layout);
    }

    /**
     * Função proveniente do Netbeans que constrói o layout da janela
     * @param layout Objeto do Netbeans que contém as informações referentes ao layout
     */
    private void gereLayout(GroupLayout layout) {
        // Gerado pelo NetBeans
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(botaoSelecionador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(labelInfo))
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
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextField11, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(botaoGuardar)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(botaoFechar)
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
                                        .addComponent(botaoSelecionador, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(labelInfo))
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
                                        .addComponent(botaoGuardar)
                                        .addComponent(botaoFechar))
                                .addContainerGap(120, Short.MAX_VALUE))
        );
        pack();
    }

    /**
     * Método utilizado para alterar os parâmetros de entrada consoante cada categoria de empresa
     * Edita o parâmetro da ComboBox para disparar um ActionEvent que altera todos os campos e labels da janela
     * @param e evento que indica que a ação foi solicitada pelo utilizador
     */
    private void botaoSelecionadorActionPerformed(ActionEvent e) {
        setMinimumSize(new Dimension(520, 300));
        switch (Objects.requireNonNull(botaoSelecionador.getSelectedItem()).toString()) {
            case "Café":
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
                break;
            case "Pastelaria":
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
                break;
            case "Restaurante Fastfood":
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
                break;
            case "Restaurante Local":
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
                break;
            case "Frutaria":
                jLabel5.setText("Custo anual de limpeza");
                jTextField5.setVisible(true);
                jLabel6.setText("Nº de produtos para venda");
                jTextField6.setVisible(true);
                jLabel7.setText("Fat. média anual por produto");
                jTextField7.setVisible(true);
                jLabel8.setVisible(false);
                jTextField8.setVisible(false);
                jLabel9.setVisible(false);
                jTextField9.setVisible(false);
                jLabel10.setVisible(false);
                jTextField10.setVisible(false);
                jLabel11.setVisible(false);
                jTextField11.setVisible(false);
                jLabel12.setVisible(false);
                jTextField12.setVisible(false);
                break;
            case "Mercado":
                jLabel5.setText("Custo anual de limpeza");
                jTextField5.setVisible(true);
                jLabel6.setText("Tipo de mercado");
                jTextField6.setVisible(true);
                jLabel7.setText("Área dos corredores (m2)");
                jTextField7.setVisible(true);
                jLabel8.setText("Fat. média anual por m2");
                jTextField8.setVisible(true);
                jLabel9.setVisible(false);
                jTextField9.setVisible(false);
                jLabel10.setVisible(false);
                jTextField10.setVisible(false);
                jLabel11.setVisible(false);
                jTextField11.setVisible(false);
                jLabel12.setVisible(false);
                jTextField12.setVisible(false);
        }
        // Limpar os campos de texto quando é feita uma mudança na ComboBox
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
    }

    /**
     * Classe responsável pelo botão de guardar, para criar uma nova empresa na GUI
     */
    private class BotaoGuardarActionListener implements ActionListener {

        /**
         * Lista de empresas
         */
        private final GerirEmpresas thisStarThrive;

        /**
         * Objeto responsável por guardar as informações num arquivo .dat
         */
        private final Escritor escritor = new Escritor();

        /**
         * Construtor da classe, responsável por inicializar os atributos
         */
        public BotaoGuardarActionListener(GerirEmpresas StarThrive) {
            thisStarThrive = StarThrive;
        }

        /**
         * Método utilizado para criar uma empresa quando o utilizador premir o botão
         * @param e evento que indica que a ação foi solicitada pelo utilizador
         */
        @Override
        public void actionPerformed (ActionEvent e) {
            try {
                switch (Objects.requireNonNull(botaoSelecionador.getSelectedItem()).toString()) {
                    case "Café":
                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("") || jTextField9.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                if (thisStarThrive.empresaUnica(jTextField1.getText())) {
                                    thisStarThrive.getEmpresas().add(new Cafe(jTextField1.getText(), jTextField2.getText(), new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())}, Integer.parseInt(jTextField5.getText()), Float.parseFloat(jTextField6.getText()), Float.parseFloat(jTextField7.getText()), Float.parseFloat(jTextField8.getText()), Float.parseFloat(jTextField9.getText())));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }

                        break;
                    case "Pastelaria":

                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("") || jTextField9.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                if (thisStarThrive.empresaUnica(jTextField1.getText())) {
                                    thisStarThrive.getEmpresas().add(new Pastelaria(jTextField1.getText(), jTextField2.getText(), new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())}, Integer.parseInt(jTextField5.getText()), Float.parseFloat(jTextField6.getText()), Float.parseFloat(jTextField7.getText()), Float.parseFloat(jTextField8.getText()), Float.parseFloat(jTextField9.getText())));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }

                        break;
                    case "Restaurante Fastfood":
                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("") || jTextField9.getText().equals("") || jTextField10.getText().equals("") || jTextField11.getText().equals("") || jTextField12.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                if (thisStarThrive.empresaUnica(jTextField1.getText())) {
                                    thisStarThrive.getEmpresas().add(new Fastfood(jTextField1.getText(), jTextField2.getText(), new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())}, Integer.parseInt(jTextField5.getText()), Float.parseFloat(jTextField6.getText()), Float.parseFloat(jTextField7.getText()), Integer.parseInt(jTextField8.getText()), Integer.parseInt(jTextField9.getText()), Float.parseFloat(jTextField10.getText()), Float.parseFloat(jTextField11.getText()), Float.parseFloat(jTextField12.getText())));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }

                        break;
                    case "Restaurante Local":

                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("") || jTextField9.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                if (thisStarThrive.empresaUnica(jTextField1.getText())) {
                                    thisStarThrive.getEmpresas().add(new Local(jTextField1.getText(), jTextField2.getText(), new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())}, Integer.parseInt(jTextField5.getText()), Float.parseFloat(jTextField6.getText()), Float.parseFloat(jTextField7.getText()), Integer.parseInt(jTextField8.getText()), Integer.parseInt(jTextField9.getText()), Integer.parseInt(jTextField10.getText()), Float.parseFloat(jTextField11.getText()), Float.parseFloat(jTextField12.getText())));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }

                        break;
                    case "Frutaria":

                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                if (thisStarThrive.empresaUnica(jTextField1.getText())) {
                                    thisStarThrive.getEmpresas().add(new Frutaria(jTextField1.getText(), jTextField2.getText(), new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())}, Float.parseFloat(jTextField5.getText()), Integer.parseInt(jTextField6.getText()), Float.parseFloat(jTextField7.getText())));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }

                        break;
                    case "Mercado":
                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                if (thisStarThrive.empresaUnica(jTextField1.getText())) {
                                    thisStarThrive.getEmpresas().add(new Mercado(jTextField1.getText(), jTextField2.getText(), new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())}, Float.parseFloat(jTextField5.getText()), jTextField6.getText(), Integer.parseInt(jTextField7.getText()), Float.parseFloat(jTextField8.getText())));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }

                    default:
                        break;
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Preencha os campos corretamente");
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro. Registo não processado");
            }
            escritor.guardaDadosDat(thisStarThrive.getEmpresas());
        }
    }

    /**
     * Classe responsável pelo botão para alterar as informações de uma empresa
     */
    private class BotaoAlterarActionListener implements ActionListener {

        /**
         * Lista de empresas
         */
        private final GerirEmpresas thisStarThrive;

        /**
         * Objeto responsável por guardar as informações num ficheiro .dat
         */
        Escritor escritor = new Escritor();

        /**
         *Construtor da classe responsável por inicializar os atributos
         */
        public BotaoAlterarActionListener(GerirEmpresas StarThrive) {
            thisStarThrive = StarThrive;
        }

        /**
         * Método utilizado para modificar uma empresa quando o utilizador premir o botão
         * @param e evento que indica que a ação foi solicitada pelo utilizador
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                switch (Objects.requireNonNull(botaoSelecionador.getSelectedItem()).toString()) {
                    case "Café":
                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("") || jTextField9.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                Cafe cafe = (Cafe) editar;
                                if (cafe.getNome().equals(jTextField1.getText()) || thisStarThrive.empresaUnica(jTextField1.getText())) {
                                    cafe.setNome(jTextField1.getText());
                                    cafe.setDistrito(jTextField2.getText());
                                    cafe.setCoordenadas(new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())});
                                    cafe.setEmpregadosMesa(Integer.parseInt(jTextField5.getText()));
                                    cafe.setSalarioMedioAnual(Float.parseFloat(jTextField6.getText()));
                                    cafe.setClientesMedioDiario(Float.parseFloat(jTextField7.getText()));
                                    cafe.setCafesMedioDiario(Float.parseFloat(jTextField8.getText()));
                                    cafe.setFaturacaoMediaAnualCafe(Float.parseFloat(jTextField9.getText()));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }
                        break;
                    case "Pastelaria":
                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("") || jTextField9.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                Pastelaria pastelaria = (Pastelaria) editar;
                                if (pastelaria.getNome().equals(jTextField1.getText()) || thisStarThrive.empresaUnica(jTextField1.getText())) {

                                    pastelaria.setNome(jTextField1.getText());
                                    pastelaria.setDistrito(jTextField2.getText());
                                    pastelaria.setCoordenadas(new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())});
                                    pastelaria.setEmpregadosMesa(Integer.parseInt(jTextField5.getText()));
                                    pastelaria.setSalarioMedioAnual(Float.parseFloat(jTextField6.getText()));
                                    pastelaria.setClientesMedioDiario(Float.parseFloat(jTextField7.getText()));
                                    pastelaria.setBolosMedioDiario(Float.parseFloat(jTextField8.getText()));
                                    pastelaria.setFaturacaoMediaAnualBolo(Float.parseFloat(jTextField9.getText()));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }
                        break;
                    case "Restaurante Fastfood":
                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("") || jTextField9.getText().equals("") || jTextField10.getText().equals("") || jTextField11.getText().equals("") || jTextField12.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                Fastfood fastfood = (Fastfood) editar;
                                if (fastfood.getNome().equals(jTextField1.getText()) || thisStarThrive.empresaUnica(jTextField1.getText())) {
                                    fastfood.setNome(jTextField1.getText());
                                    fastfood.setDistrito(jTextField2.getText());
                                    fastfood.setCoordenadas(new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())});
                                    fastfood.setEmpregadosMesa(Integer.parseInt(jTextField5.getText()));
                                    fastfood.setSalarioMedioAnual(Float.parseFloat(jTextField6.getText()));
                                    fastfood.setClientesMedioDiario(Float.parseFloat(jTextField7.getText()));
                                    fastfood.setDiasFuncionamento(Integer.parseInt(jTextField8.getText()));
                                    fastfood.setMesasInterior(Integer.parseInt(jTextField9.getText()));
                                    fastfood.setFaturacaoMediaMesaDiario(Float.parseFloat(jTextField10.getText()));
                                    fastfood.setClientesMedioDrive(Float.parseFloat(jTextField11.getText()));
                                    fastfood.setFaturacaoMediaClienteDrive(Float.parseFloat(jTextField12.getText()));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }
                        break;
                    case "Restaurante Local":
                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("") || jTextField9.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                Local local = (Local) editar;
                                if (local.getNome().equals(jTextField1.getText()) || thisStarThrive.empresaUnica(jTextField1.getText())) {
                                    local.setNome(jTextField1.getText());
                                    local.setDistrito(jTextField2.getText());
                                    local.setCoordenadas(new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())});
                                    local.setEmpregadosMesa(Integer.parseInt(jTextField5.getText()));
                                    local.setSalarioMedioAnual(Float.parseFloat(jTextField6.getText()));
                                    local.setClientesMedioDiario(Float.parseFloat(jTextField7.getText()));
                                    local.setDiasFuncionamento(Integer.parseInt(jTextField8.getText()));
                                    local.setMesasInterior(Integer.parseInt(jTextField9.getText()));
                                    local.setMesasEsplanada(Integer.parseInt(jTextField10.getText()));
                                    local.setCustoLicencaMesaEsplanada(Float.parseFloat(jTextField11.getText()));
                                    local.setFaturacaoMediaMesaDiario(Float.parseFloat(jTextField12.getText()));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }
                        break;
                    case "Frutaria":
                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                Frutaria frutaria = (Frutaria) editar;
                                if (frutaria.getNome().equals(jTextField1.getText()) || thisStarThrive.empresaUnica(jTextField1.getText())) {
                                    frutaria.setNome(jTextField1.getText());
                                    frutaria.setDistrito(jTextField2.getText());
                                    frutaria.setCoordenadas(new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())});
                                    frutaria.setCustoAnualLimpeza(Float.parseFloat(jTextField5.getText()));
                                    frutaria.setNumeroProdutos(Integer.parseInt(jTextField6.getText()));
                                    frutaria.setFaturacaoMediaAnualProduto(Float.parseFloat(jTextField7.getText()));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }
                        break;
                    case "Mercado":
                            if (jTextField1.getText().equals("") || jTextField2.getText().equals("") || jTextField3.getText().equals("") || jTextField4.getText().equals("") || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("")) {
                                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                                botaoSelecionador.setSelectedIndex(0);
                            } else {
                                Mercado mercado = (Mercado) editar;
                                if (mercado.getNome().equals(jTextField1.getText()) || thisStarThrive.empresaUnica(jTextField1.getText())) {
                                    mercado.setNome(jTextField1.getText());
                                    mercado.setDistrito(jTextField2.getText());
                                    mercado.setCoordenadas(new float[]{Float.parseFloat(jTextField3.getText()), Float.parseFloat(jTextField4.getText())});
                                    mercado.setCustoAnualLimpeza(Float.parseFloat(jTextField5.getText()));
                                    mercado.setTipoMercado(jTextField6.getText());
                                    mercado.setAreaCorredores(Integer.parseInt(jTextField7.getText()));
                                    mercado.setFaturacaoMediaAnualM2(Float.parseFloat(jTextField8.getText()));
                                    JOptionPane.showMessageDialog(null, "Guardado com sucesso");
                                    janelaMae.atualizarLista(thisStarThrive);
                                    dispose();
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Já existe uma empresa com esse nome");
                                }
                            }
                    default:
                        break;
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showMessageDialog(null, "Preencha os campos corretamente");
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, "Erro. Registo não processado");
            }
            escritor.guardaDadosDat(thisStarThrive.getEmpresas());
        }
    }
}
