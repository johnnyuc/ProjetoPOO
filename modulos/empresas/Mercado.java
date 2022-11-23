package modulos.empresas;

public class Mercado extends Mercearia {
    /**
     * Tipo pode ser "mercado", "supermercado", "hipermercado" (usar min, super, hiper)
     */
    String tipo;
    /**
     * A área em metros quadrados dos corredores (m^2)
     */
    int areaCorredores;
    /**
     * A faturação anual por metro quadrado
     */
    float faturacaoAnualM2;

    /**
     * Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param custoAnualLimpeza O custo anual de limpeza da mercearia
     * @param tipo A tipologia de mercado (pode ser mini, super, hiper)
     * @param areaCorredores A área em metros quadrados dos corredores
     * @param faturacaoAnualM2 A faturação anual por metro quadrado
     */
    public Mercado(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza, String tipo,
                   int areaCorredores, float faturacaoAnualM2) {
        super(nome, distrito, coordenadas, custoAnualLimpeza);
        this.tipo = tipo;
        this.areaCorredores = areaCorredores;
        this.faturacaoAnualM2 = faturacaoAnualM2;
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
        return areaCorredores*faturacaoAnualM2;
    }
}
