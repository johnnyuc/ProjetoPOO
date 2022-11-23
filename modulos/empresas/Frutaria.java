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
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param custoAnualLimpeza O custo anual de limpeza da mercearia
     * @param numeroProdutos O número de produtos para venda na frutaria
     * @param faturacaoAnualProduto O valor médio de faturação anual por produto
     */
    public Frutaria(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza, int numeroProdutos, float faturacaoAnualProduto) {
        super(nome, distrito, coordenadas, custoAnualLimpeza);
        this.numeroProdutos = numeroProdutos;
        this.faturacaoAnualProduto = faturacaoAnualProduto;
    }

    /*
     * Métodos de acesso externo ao número de produtos para venda na frutaria
     */
    public int getNumeroProdutos() {
        return numeroProdutos;
    }

    /*
     * Método para definir o número de produtos para venda na frutaria
     */
    public void setNumeroProdutos(int numeroProdutos) {
        this.numeroProdutos = numeroProdutos;
    }

    /*
     * Métodos de acesso externo ao valor médio de faturação anual por produto
     */
    public float getFaturacaoAnualProduto() {
        return faturacaoAnualProduto;
    }

    /*
     * Método para definir o valor médio de faturação anual por produto
     */
    public void setFaturacaoAnualProduto(float faturacaoAnualProduto) {
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
