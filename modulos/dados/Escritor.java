package modulos.dados;

import modulos.empresas.Empresa;

import java.io.*;
import java.util.ArrayList;

public class Escritor {

    /*
     * Base de dados de (objetos) empresas
     * Esta base de dados é única e é hardcoded (por isso estática)
     */
    public static String baseDados = "starthrive.dat";

    public static void guardaDadosDat(ArrayList<Empresa> empresas) {
        File f = new File(baseDados);

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Leitura das linhas do ficheiro para carregar os objetos com base nos dados da base de dados (.dat)
            for (Empresa empresa : empresas) {
                System.out.println("A guardar empresa: " + empresa.getNome());
                oos.writeObject(empresa);
            }

            fos.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("O ficheiro de dados \"" + baseDados + "\" não foi criado.");
        } catch (IOException e) {
            System.out.println("Erro na escrita da base de dados.");
        }
    }
}
