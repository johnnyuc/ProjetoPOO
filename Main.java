import modulos.dados.Escritor;
import modulos.gui.*;
import modulos.dados.*;
import modulos.empresas.*;

import java.io.File;


public class Main {
    public static void main(String[] args) {
        // Inicialização do programa
        booting();
        // Inicialização da ‘interface’ gráfica
        run();
    }
    public static void booting() {
        File f = new File("starthrive.dat");
        if (f.exists()) {
            System.out.println("Bem-vindo ao StarThrive!");
            System.out.println("A iniciar a base de dados de objetos...");
            GerirEmpresas StarThrive = new GerirEmpresas(Leitor.carregaDadosDat());
            //StarThrive.imprimirEmpresas();
            StarThrive.maiorLucroAnual(0);
            StarThrive.maiorReceitaAnual(0);
            StarThrive.menorDespesaAnual(0);
            StarThrive.maiorCapacidadeClientes(0);
        }
        else {
            System.out.println("Bem-vindo ao StarThrive!");
            System.out.println("A criar a base de dados a partir do arquivo de texto...");
            GerirEmpresas StarThrive = new GerirEmpresas(Leitor.carregaDadosTxt());
            Escritor.guardaDadosDat(GerirEmpresas.empresas);
            StarThrive.imprimirEmpresas();
        }
    }

    public static void run() {
        Iniciar StarThrive = new Iniciar();
    }
}

