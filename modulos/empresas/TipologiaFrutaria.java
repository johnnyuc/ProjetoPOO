package modulos.empresas;

public class TipologiaFrutaria extends CategoriaMercearia {
    int numeroProdutos;
    float faturacaoAnualProduto;

    public TipologiaFrutaria(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza, int numeroProdutos, float faturacaoAnualProduto) {
        super(nome, distrito, coordenadas, custoAnualLimpeza);
        this.numeroProdutos = numeroProdutos;
        this.faturacaoAnualProduto = faturacaoAnualProduto;
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
