package modulos.empresas;

public abstract class Empresa implements java.io.Serializable {

    /**
     * O nome da empresa
     * */
    String nome;
    /**
     * O distrito da empresa
     * */
    String distrito;
    /**
     * As coordendas da empresa (latitude e longitude)
     * */
    float[] coordenadas;


    /**
     * Construtor da classe, recebe os dados para a inicialização dos atributos
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa (latitude e longitude)
     */
    public Empresa(String nome, String distrito, float[] coordenadas) {
        this.nome = nome;
        this.distrito = distrito;
        this.coordenadas = coordenadas;
    }

    // Métodos

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


    // Getters and Setters e Overrides

    /**
     * Método de acesso externo ao nome da empresa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome da empresa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de acesso externo ao distrito da empresa
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Método para definir o distrito da empresa
     */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /**
     * Método de acesso externo às coordenadas da empresa
     */
    public float[] getCoordenadas() {
        return coordenadas;
    }

    /**
     * Método para definir as coordenadas da empresa
     */
    public void setCoordenadas(float[] coordenadas) {
        this.coordenadas = coordenadas;
    }
}
