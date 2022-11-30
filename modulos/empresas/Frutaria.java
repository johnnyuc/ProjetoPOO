package modulos.empresas;

public class Frutaria extends Mercearia {
    /**
     * O número de produtos para venda na frutaria
     */
    int numeroProdutos;
    /**
     * O valor médio de faturação anual por produto
     */
    float faturacaoMediaAnualProduto;

    /**
     *  Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param custoAnualLimpeza O custo anual de limpeza da mercearia
     * @param numeroProdutos O número de produtos para venda na frutaria
     * @param faturacaoMediaAnualProduto O valor médio de faturação anual por produto
     */
    public Frutaria(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza, int numeroProdutos, float faturacaoMediaAnualProduto) {
        super(nome, distrito, coordenadas, custoAnualLimpeza);
        this.numeroProdutos = numeroProdutos;
        this.faturacaoMediaAnualProduto = faturacaoMediaAnualProduto;
    }

    /**
     * Métodos de acesso externo ao número de produtos para venda na frutaria
     */
    public int getNumeroProdutos() {
        return numeroProdutos;
    }

    /**
     * Método para definir o número de produtos para venda na frutaria
     */
    public void setNumeroProdutos(int numeroProdutos) {
        this.numeroProdutos = numeroProdutos;
    }

    /**
     * Métodos de acesso externo ao valor médio de faturação anual por produto
     */
    public float getFaturacaoMediaAnualProduto() {
        return faturacaoMediaAnualProduto;
    }

    /**
     * Método para definir o valor médio de faturação anual por produto
     */
    public void setFaturacaoMediaAnualProduto(float faturacaoMediaAnualProduto) {
        this.faturacaoMediaAnualProduto = faturacaoMediaAnualProduto;
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
        return numeroProdutos* faturacaoMediaAnualProduto;
    }
    public float calcularLucro(){return calcularReceitaAnual()-calcularDespesaAnual();}
    @Override
    public String toString(){
        String s= "Empresa"+
                "\nNome                :\t"+this.nome+
                "\nTipo                :\t"+"Frutaria"+
                "\nDistrito            :\t"+this.distrito+
                "\nDespesa Anual       :\t"+calcularDespesaAnual()+
                "\nReceita Anual       :\t"+calcularReceitaAnual()+
                "\nLucro               :\t";
        float lucro= this.calcularLucro();
        if (lucro>0){
            s+="Sim";
        }
        else{
            s+="Não";
        }
        return s;
    }
}
