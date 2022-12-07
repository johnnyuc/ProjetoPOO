/**
 * Classe que simboliza as empresas do tipo Mercearia
 */
public abstract class Mercearia extends Empresa {

    /**
     * O custo anual de limpeza da mercearia (seja ela frutaria ou mercado)
     */
    private float custoAnualLimpeza;


    /**
     *  Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param custoAnualLimpeza O custo anual de limpeza da mercearia
     */
    public Mercearia(String nome, String distrito, float[] coordenadas, float custoAnualLimpeza) {
        super(nome, distrito, coordenadas);
        this.custoAnualLimpeza = custoAnualLimpeza;
    }

    // Getters and Setters e Overrides
    /**
     * Métodos de acesso externo ao custo anual de limpeza da mercearia
     * @return o custo anual de limpeza da mercearia
     */
    public float getCustoAnualLimpeza() {
        return custoAnualLimpeza;
    }

    /**
     * Método para definir o custo anual de limpeza da mercearia
     * @param custoAnualLimpeza o custo anual de limpeza da mercearia
     */
    public void setCustoAnualLimpeza(float custoAnualLimpeza) {
        this.custoAnualLimpeza = custoAnualLimpeza;
    }
}
