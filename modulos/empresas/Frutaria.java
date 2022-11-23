package modulos.empresas;

public class Frutaria extends Mercearia {
    int numeroProdutos;
    float faturacaoAnualProduto;

    public Frutaria(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza, int numeroProdutos, float faturacaoAnualProduto) {
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
