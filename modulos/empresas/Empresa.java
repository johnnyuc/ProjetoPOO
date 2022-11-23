package modulos.empresas;

public abstract class Empresa implements InterfaceEmpresa {
    String nome;
    String distrito;
    float[] coordenadas;

    public Empresa(String nome, String distrito, float[] coordenadas) {
        this.nome = nome;
        this.distrito = distrito;
        this.coordenadas = coordenadas;
    }
}
