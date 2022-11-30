//import modulos.gui.*;
import modulos.data.*;
import modulos.empresas.*;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empresa> empresas = new ArrayList<>();
        GerirEmpresas StarThrive = new GerirEmpresas(empresas);

        Cafe cafe1 = new Cafe("Café do João", "Lisboa", new float[]{38.7222524f, -9.1393366f}, 2, 1000, 100, 100, 1);

        Cafe cafe2 = new Cafe("Café do João", "Lisboa", new float[]{38.7222524f, -9.1393366f}, 2, 1000, 100, 100, 1);
        cafe2.setNome("Café do José");
        cafe2.setDistrito("Porto");
        cafe2.setCoordenadas(new float[]{41.14961f, -8.61099f});
        cafe2.setEmpregadosMesa(3);
        cafe2.setSalarioMedioAnual(1200);
        cafe2.setClientesMedioDiario(120);
        cafe2.setCafesMedioDiario(120);
        cafe2.setFaturacaoMediaAnualCafe(1.2f);

        //System.out.println(cafe1);
        //System.out.println(cafe2);

        Pastelaria pastelaria1 = new Pastelaria("Pastelaria do João", "Lisboa", new float[]{38.7222524f, -9.1393366f}, 2, 1000, 100, 100, 1);

        Pastelaria pastelaria2 = new Pastelaria("Pastelaria do João", "Lisboa", new float[]{38.7222524f, -9.1393366f}, 2, 1000, 100, 100, 1);
        pastelaria2.setNome("Pastelaria do José");
        pastelaria2.setDistrito("Porto");
        pastelaria2.setCoordenadas(new float[]{41.14961f, -8.61099f});
        pastelaria2.setEmpregadosMesa(3);
        pastelaria2.setSalarioMedioAnual(1200);
        pastelaria2.setClientesMedioDiario(120);
        pastelaria2.setBolosMedioDiario(120);
        pastelaria2.setFaturacaoMediaAnualBolo(1.2f);

        //System.out.println(pastelaria1);
        //System.out.println(pastelaria2);

        System.out.println("PIP");
        StarThrive.adicionarEmpresa(cafe1);
        StarThrive.adicionarEmpresa(cafe2);
        StarThrive.adicionarEmpresa(pastelaria1);
        StarThrive.adicionarEmpresa(pastelaria2);
        StarThrive.imprimirEmpresas();
        System.out.println("POP");


        readFromFile("PLAINDATA.txt");
        writeToFile("PLAINDATA.txt", "Hello World!");
    }
}
