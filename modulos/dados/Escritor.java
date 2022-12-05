package modulos.dados;
import modulos.empresas.*;

import java.io.*;
import java.util.*;

/**
 * Classe responsável por guardar num ficheiro.dat as empresas e as alterações feitas
 */
public class Escritor {

    /**
     * Base de dados de (objetos) empresas
     * Esta base de dados é única e é hardcoded (por isso estática)
     */
    private static final String baseDados = "starthrive.dat";

    /**
     * Construtor da classe
     */
    public Escritor(){}

    /**
     * Método responsável por guardar os dados num ficheiro .dat
     * @param empresas Lista com todas empresas a serem geridas
     */


    public static void guardaDadosDat(ArrayList<Empresa> empresas) {
        File f = new File(baseDados);

        try {
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Leitura das linhas do ficheiro para carregar os objetos com base nos dados da base de dados (.dat)
            for (Empresa empresa : empresas) {
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
