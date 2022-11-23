package modulos.empresas;

import java.util.ArrayList;

public class GerirEmpresas {
    ArrayList <Empresa> empresas;

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public GerirEmpresas(ArrayList <Empresa> empresas){this.empresas=empresas;}
}
