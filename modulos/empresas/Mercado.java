package modulos.empresas;

public class Mercado extends Mercearia {
    // Tipo pode ser "mercado", "supermercado", "hipermercado" (usar min, super, hiper)
    String tipo;
    // Em metros quadrados (m^2)
    int areaCorredores;
    float faturacaoAnualM2;

    public Mercado(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza, String tipo, int areaCorredores, float faturacaoAnualM2) {
        super(nome, distrito, coordenadas, custoAnualLimpeza);
        this.tipo = tipo;
        this.areaCorredores = areaCorredores;
        this.faturacaoAnualM2 = faturacaoAnualM2;
    }

    @Override
    public float calcularDespesaAnual() {
        return 0;
    }

    @Override
    public float calcularReceitaAnual() {
        return 0;
    }
}
