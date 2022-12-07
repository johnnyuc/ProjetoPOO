import java.io.*;
import javax.swing.*;

/**
 * Classe utilizada para a inicialização do programa
 */
public class Main {

    /**
     * Inicialização da aplicação
     * @param args default java
     */
    public static void main(String[] args) {
        booting();
    }

    /**
     * Método utilizado para inicializar o programa
     * Booting puxa o carregamento dos dados e o display
     */
    public static void booting() {
        Leitor leitor = new Leitor();
        Escritor escritor = new Escritor();

        File f = new File("starthrive.dat");
        File dummy = new File("starthrive.txt");

        //Caso não exista um ficheiro .dat, procede-se à leitura do ficheiro .txt
        if (f.exists()) {
            System.out.println("Bem-vindo ao StarThrive!");
            System.out.println("A iniciar a base de dados de objetos...");
            GerirEmpresas StarThrive = new GerirEmpresas(leitor.carregaDadosDat());
            display(StarThrive);
        }
        else {
            if (dummy.exists()) {
                System.out.println("Bem-vindo ao StarThrive!");
                System.out.println("A criar a base de dados a partir do arquivo de texto...");
                GerirEmpresas StarThrive = new GerirEmpresas(leitor.carregaDadosTxt());
                escritor.guardaDadosDat(StarThrive.getEmpresas());
                display(StarThrive);
            } else {
                System.out.println("Nenhum dos arquivos de dados foi encontrado.");
                System.exit(-1);
            }
        }
    }

    /**
     * Método utilizado para inicializar a interface gráfica
     * Todas as janelas seguirão uma hereditariedade em relação à JanelaPrincipal
     * É detetada a existência do tema Nimbus. Se não existir será carregado com o default
     * @param StarThrive lista de empresas a serem geridas
     */
    public static void display(GerirEmpresas StarThrive) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        new JanelaPrincipal(StarThrive).setVisible(true);
    }
}

