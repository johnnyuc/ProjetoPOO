package modulos.empresas;

public abstract class Empresa{
    /** O nome da empresa*/
    String nome;
    /** O distrito da empresa*/
    String distrito;
    /** As coordendas da empresa*/
    float[] coordenadas;

    /**
     * Construtor da classe, recebe os dados para a inicialização
     * dos atributos
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     */
    public Empresa(String nome, String distrito, float[] coordenadas) {
        this.nome = nome;
        this.distrito = distrito;
        this.coordenadas = coordenadas;
    }

    /** Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    abstract float calcularDespesaAnual();

    /** Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    abstract float calcularReceitaAnual();
}
