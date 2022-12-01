package modulos.data;

import modulos.empresas.*;

import java.io.*;
import java.util.*;

public class Reader {

    /*
     * Base de dados dummy para testes
     * O ficheiro tem nome hardcoded constante no enunciado do projeto
     */
    public static String baseDadosTxt = "starthrive.txt";

    /*
     * Base de dados de (objetos) empresas
     * Esta base de dados é única e é hardcoded (por isso estática)
     */
    public static String baseDados = "starthrive.dat";

    // Function to load data from file text using FileReader
    public static ArrayList<Empresa> carregaDadosTxt() {

        ArrayList<Empresa> empresas = new ArrayList<>();
        File f = new File(baseDadosTxt);
        String linha;

        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            // Leitura das linhas do ficheiro para criar os objetos com base nos dados do dummy file
            while ((linha = br.readLine()) != null) {
                try {
                    // Primeiro é preciso verificar a length para só depois verificar o charAt, senão origina Exception
                    if (linha.length() > 0 && (linha.charAt(0) != '/')) {
                        // Como é dividido por ";" poderia ser também usado o formato csv
                        // Snippet from: https://stackoverflow.com/questions/41953388/java-split-and-trim-in-one-shot
                        // Os dados são automáticamente separados por ";" e depois removidos os espaços em branco nas extremidades
                        String[] data = linha.split("\\s*;\\s*");

                        switch (data[0]) {
                            case "Café" ->
                                    empresas.add(new Cafe(data[1], data[2], new float[]{Float.parseFloat(data[3]), Float.parseFloat(data[4])}, Integer.parseInt(data[5]), Float.parseFloat(data[6]), Float.parseFloat(data[7]), Float.parseFloat(data[8]), Float.parseFloat(data[9])));
                            case "Pastelaria" ->
                                    empresas.add(new Pastelaria(data[1], data[2], new float[]{Float.parseFloat(data[3]), Float.parseFloat(data[4])}, Integer.parseInt(data[5]), Float.parseFloat(data[6]), Float.parseFloat(data[7]), Float.parseFloat(data[8]), Float.parseFloat(data[9])));
                            case "Fastfood" ->
                                    empresas.add(new Fastfood(data[1], data[2], new float[]{Float.parseFloat(data[3]), Float.parseFloat(data[4])}, Integer.parseInt(data[5]), Float.parseFloat(data[6]), Float.parseFloat(data[7]), Integer.parseInt(data[8]), Integer.parseInt(data[9]), Float.parseFloat(data[10]), Float.parseFloat(data[11]), Float.parseFloat(data[12])));
                            case "Local" ->
                                    empresas.add(new Local(data[1], data[2], new float[]{Float.parseFloat(data[3]), Float.parseFloat(data[4])}, Integer.parseInt(data[5]), Float.parseFloat(data[6]), Float.parseFloat(data[7]), Integer.parseInt(data[8]), Integer.parseInt(data[9]), Integer.parseInt(data[10]), Float.parseFloat(data[11]), Float.parseFloat(data[12])));
                            case "Frutaria" ->
                                    empresas.add(new Frutaria(data[1], data[2], new float[]{Float.parseFloat(data[3]), Float.parseFloat(data[4])}, Float.parseFloat(data[5]), Integer.parseInt(data[6]), Float.parseFloat(data[7])));
                            case "Mercado" ->
                                    empresas.add(new Mercado(data[1], data[2], new float[]{Float.parseFloat(data[3]), Float.parseFloat(data[4])}, Float.parseFloat(data[5]), data[6], Integer.parseInt(data[7]), Float.parseFloat(data[8])));
                            case null, default ->
                                    System.out.println("Tipo de empresa não reconhecido. " + Arrays.toString(data));
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Skiping data: Erro na conversão de dados numéricos. [" + linha + "]");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Skiping data: Leitura de dados insuficiente. [" + linha + "]");
                }
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("O ficheiro de dados \"" + baseDadosTxt + "\" não foi encontrado.");
        } catch (IOException e) {
            System.out.println("Erro inesperado na leitura do ficheiro de dados \"" + baseDadosTxt + "\".");
            System.out.println(e.getMessage());
        }

        return empresas;
    }

    public static ArrayList<Empresa> carregaDadosDat() {
        ArrayList<Empresa> empresas = new ArrayList<>();
        File f = new File(baseDados);

        try {
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Leitura das linhas do ficheiro para carregar os objetos com base nos dados da base de dados (.dat)
            while (fis.available() > 0) {
                empresas.add((Empresa) ois.readObject());
            }

            fis.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("O ficheiro de dados \"" + baseDados + "\" não foi encontrado.");
        } catch (IOException e) {
            System.out.println("Erro na leitura da base de dados.");
        } catch (ClassNotFoundException e) {
            System.out.println("Erro na leitura de classes.");
        }

        return empresas;
    }
}
