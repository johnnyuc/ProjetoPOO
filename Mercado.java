/**
 * Classe que simboliza as empresas do tipo mercado
 */
public class Mercado extends Mercearia {

    /**
     * Tipo pode ser "mercado", "supermercado", "hipermercado" (usar min, super, hiper)
     */
    String tipoMercado;

    /**
     * A área em metros quadrados dos corredores (m^2)
     */
    int areaCorredores;

    /**
     * A faturação anual por metro quadrado
     */
    float faturacaoMediaAnualM2;

    /**
     * Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param custoAnualLimpeza O custo anual de limpeza da mercearia
     * @param tipoMercado A tipologia de mercado (pode ser mini, super, hiper)
     * @param areaCorredores A área em metros quadrados dos corredores
     * @param faturacaoMediaAnualM2 A faturação anual por metro quadrado
     */
    public Mercado(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza, String tipoMercado,
                   int areaCorredores, float faturacaoMediaAnualM2) {
        super(nome, distrito, coordenadas, custoAnualLimpeza);
        this.tipoMercado = tipoMercado;
        this.areaCorredores = areaCorredores;
        this.faturacaoMediaAnualM2 = faturacaoMediaAnualM2;
        this.setCategoriaEmpresa(5);
    }

    // Métodos

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    public float calcularReceitaAnual() {
        return areaCorredores* faturacaoMediaAnualM2;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    public float calcularDespesaAnual() {
        return getCustoAnualLimpeza();
    }

    // Getters and Setters e Overrides

    /**
     * Métodos de acesso externo à tipologia de mercado
     * @return O tipo de mercado
     */
    public String getTipoMercado() {
        return tipoMercado;
    }

    /**
     * Método para definir a tipologia de mercado
     * @param tipoMercado a tipologia do mercado
     */
    public void setTipoMercado(String tipoMercado) {
        this.tipoMercado = tipoMercado;
    }

    /**
     * Métodos de acesso externo à área em metros quadrados dos corredores
     * @return a área em metros quadrados dos corredores
     */
    public int getAreaCorredores() {
        return areaCorredores;
    }

    /**
     * Método para definir a área em metros quadrados dos corredores
     * @param areaCorredores a área em metros quadrados dos corredores
     */
    public void setAreaCorredores(int areaCorredores) {
        this.areaCorredores = areaCorredores;
    }

    /**
     * Métodos de acesso externo à faturação anual por metro quadrado
     * @return faturação anual por metro quadrado
     */
    public float getFaturacaoMediaAnualM2() {
        return faturacaoMediaAnualM2;
    }

    /**
     * Método para definir a faturação anual por metro quadrado
     * @param faturacaoMediaAnualM2 a faturação anual por metro quadrado
     */
    public void setFaturacaoMediaAnualM2(float faturacaoMediaAnualM2) {
        this.faturacaoMediaAnualM2 = faturacaoMediaAnualM2;
    }

    /**
     * Método para apresentar todos os atributos de um determinado objeto
     * @return Uma ‘string’ que contém todos os atributos de um determinado objeto
     */
    @Override
    public String toString(){
        String s=
                "Tipo                  :\t"+"Mercado"+
                "\nNome                :\t"+this.getNome()+
                "\nDistrito            :\t"+this.getDistrito()+
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
