import modulos.dados.Escritor;
import modulos.gui.*;
import modulos.dados.*;
import modulos.empresas.*;

import java.io.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        booting();
    }


    // Inicialização do programa
    public static void booting() {
        File f = new File("starthrive.dat");
        if (f.exists()) {
            System.out.println("Bem-vindo ao StarThrive!");
            System.out.println("A iniciar a base de dados de objetos...");
            GerirEmpresas StarThrive = new GerirEmpresas(Leitor.carregaDadosDat());
            display(StarThrive);
        }
        else {
            System.out.println("Bem-vindo ao StarThrive!");
            System.out.println("A criar a base de dados a partir do arquivo de texto...");
            GerirEmpresas StarThrive = new GerirEmpresas(Leitor.carregaDadosTxt());
            Escritor.guardaDadosDat(GerirEmpresas.empresas);
            display(StarThrive);
        }
    }

    // Inicialização do ecrã
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

