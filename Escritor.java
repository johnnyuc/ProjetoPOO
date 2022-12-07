import java.io.*;
import java.util.*;

/**
 * Classe responsável por guardar num ficheiro.dat as empresas e as alterações feitas
 */
public class Escritor {

    /**
     * Construtor da classe
     */
    public Escritor(){}

    /**
     * Método responsável por guardar os dados num ficheiro .dat
     * @param empresas Lista com todas empresas a serem geridas
     */


    public void guardaDadosDat(ArrayList<Empresa> empresas) {

        String baseDados = "starthrive.dat";
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
