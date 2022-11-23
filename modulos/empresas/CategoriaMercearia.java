package modulos.empresas;

public abstract class CategoriaMercearia extends Empresa {
    float custoAnualLimpeza;

    public CategoriaMercearia(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza) {
        super(nome, distrito, coordenadas);
        this.custoAnualLimpeza = custoAnualLimpeza;
    }
}
