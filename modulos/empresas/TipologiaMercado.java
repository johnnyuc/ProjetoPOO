package modulos.empresas;

public class TipologiaMercado extends CategoriaMercearia{
    // Tipo pode ser "mercado", "supermercado", "hipermercado" (usar min, super, hiper)
    String tipo;
    // Em metros quadrados (m^2)
    int areaCorredores;
    float faturacaoAnualM2;

    public TipologiaMercado(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza, String tipo, int areaCorredores, float faturacaoAnualM2) {
        super(nome, distrito, coordenadas, custoAnualLimpeza);
        this.tipo = tipo;
        this.areaCorredores = areaCorredores;
        this.faturacaoAnualM2 = faturacaoAnualM2;
    }

    @Override
    public int calcularDespesaAnual() {
        return 0;
    }

    @Override
    public int calcularReceitaAnual() {
        return 0;
    }
}
