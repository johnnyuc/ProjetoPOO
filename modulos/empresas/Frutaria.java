package modulos.empresas;

public class Frutaria extends Mercearia {
    /**
     * O número de produtos para venda na frutaria
     */
    int numeroProdutos;
    /**
     * O valor médio de faturação anual por produto
     */
    float faturacaoAnualProduto;

    /**
     *  Construtor da classe, recebe os dados para a inicialização
     * @param nome
     * @param distrito
     * @param coordenadas
     * @param custoAnualLimpeza
     * @param numeroProdutos
     * @param faturacaoAnualProduto
     */
    public Frutaria(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza, int numeroProdutos, float faturacaoAnualProduto) {
        super(nome, distrito, coordenadas, custoAnualLimpeza);
        this.numeroProdutos = numeroProdutos;
        this.faturacaoAnualProduto = faturacaoAnualProduto;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    @Override
    public float calcularDespesaAnual() {
        return custoAnualLimpeza;
    }

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    @Override
    public float calcularReceitaAnual() {
        return numeroProdutos*faturacaoAnualProduto;
    }
}
