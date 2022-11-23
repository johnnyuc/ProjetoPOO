package modulos.empresas;

public abstract class Mercearia extends Empresa {
    float custoAnualLimpeza;

    public Mercearia(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza) {
        super(nome, distrito, coordenadas);
        this.custoAnualLimpeza = custoAnualLimpeza;
    }
}
