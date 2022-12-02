import modulos.gui.*;
import modulos.dados.*;
import modulos.empresas.*;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        // Inicialização do programa
        booting();
    }
    public static void booting() {
        File f = new File("starthrive.dat");
        if (f.exists()) {
            System.out.println("Bem-vindo ao StarThrive!");
            System.out.println("A iniciar a base de dados de objetos...");
            //GerirEmpresas StarThrive = new GerirEmpresas(Leitor.carregaDadosDat());
            new GerirEmpresas(Leitor.carregaDadosDat());
            //StarThrive.imprimirEmpresas();
        }
        else {
            System.out.println("Bem-vindo ao StarThrive!");
            System.out.println("A criar a base de dados a partir do arquivo de texto...");
            //GerirEmpresas StarThrive = new GerirEmpresas(Leitor.carregaDadosTxt());
            new GerirEmpresas(Leitor.carregaDadosTxt());
            Escritor.guardaDadosDat(GerirEmpresas.empresas);
            //StarThrive.imprimirEmpresas();
        }

        // Work in progress
        new Iniciar();
        new test().setVisible(true);
    }
}

