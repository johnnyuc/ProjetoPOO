import java.awt.*;
import javax.swing.*;

/**
 * Classe responsável pelo ecrã inicial (e principal) da aplicação
 * É o único ecrã que quando fechado, encerra a aplicação
 */
public class JanelaPrincipal extends JFrame {

    /**
     * Botão para aceder ao ecrã de operações
     */
    private final JButton botaoOperacoes = new JButton();

    /**
     * Botão para aceder ao ecrão de estatísticas
     */
    private final JButton botaoEstatisticas = new JButton();

    /**
     * Botão para sair da aplicação
     */
    private final JButton botaoSair = new JButton();

    /**
     * Label para o título da empresa
     */
    private final JLabel labelTitulo = new JLabel();

    /**
     * Label para o ícone da empresa
     */
    private final JLabel labelIcone = new JLabel();

    /**
     * Área reservada para o texto de introdução à aplicação
     */
    private final JTextArea areaTexto = new JTextArea();

    /**
     * Scroll da janela
     */
    private final JScrollPane elementoScroll = new JScrollPane();

    /**
     * Label de direitos da aplicação
     */
    private final JLabel labelDireitos = new JLabel();

    /**
     * Objeto proveniente do Netbeans que guarda todas as definições de layout da janela
     */
    private final GroupLayout layout = new GroupLayout(getContentPane());

    /**
     * Construtor que inicializa os componentes da janela
     * @param StarThrive lista de empresas a serem geridas
     */
    public JanelaPrincipal(GerirEmpresas StarThrive) {
        initComponents(StarThrive);
    }

    // Métodos

    /**
     * Método que inicializa os componentes da janela
     * @param StarThrive lista de empresas a serem geridas
     */
    private void initComponents(GerirEmpresas StarThrive) {
        setResizable(false);
        setTitle("Bem-vindo ao StarThrive Gestão!");
        setIconImage(new ImageIcon("starthrive.png").getImage());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        labelTitulo.setFont(new Font("Trebuchet MS", Font.BOLD, 36));
        labelTitulo.setText("StarThrive Gestão");
        labelIcone.setIcon(new ImageIcon("starthrive.png"));

        // Área de descrição do software e mensagem de boas-vindas
        areaTexto.setEnabled(false);
        areaTexto.setColumns(20);
        areaTexto.setRows(5);
        areaTexto.setText("\n\n  Bem-vindo ao software da StarThrive. \n\n  Aqui poderá entre outras coisas verificar as empresas que gere \n  bem como adicionar, remover ou editar parâmetros das suas \n  empresas. Além disso poderá verificar a performance delas, \n  através dos botões ao lado.");
        elementoScroll.setViewportView(areaTexto);

        // Botão da janela de operações
        botaoOperacoes.setText("Operações");
        botaoOperacoes.addActionListener(e -> new JanelaOperacoes(StarThrive).setVisible(true));

        // Botão para a janela com as métricas das empresas
        botaoEstatisticas.setText("Estatísticas");
        botaoEstatisticas.addActionListener(e -> new JanelaEstatisticas(StarThrive).setVisible(true));

        // Botão para encerrar o programa
        botaoSair.setText("Sair");
        botaoSair.addActionListener(e -> System.exit(0));

        labelDireitos.setText("Software desenvolvido por Johnny Fernandes e Saulo Piccirilo");

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

