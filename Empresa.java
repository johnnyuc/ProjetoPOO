/**
 * Classe comum de todas as empresas
 */
public abstract class Empresa implements java.io.Serializable {

    /**
     * O nome da empresa
     * */
    private String nome;
    /**
     * O distrito da empresa
     * */
    private String distrito;
    /**
     * As coordendas da empresa (latitude e longitude)
     * */
    private float[] coordenadas;
    /**
     * A categoria de empresa
     */
    private int categoriaEmpresa;


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
    public abstract float calcularDespesaAnual();


    /** Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    public abstract float calcularReceitaAnual();
    /** Método utilizado para calcular o lucro de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor do lucro
     */
    public float calcularLucro(){return calcularReceitaAnual() - calcularDespesaAnual();}


    // Getters and Setters e Overrides
    /**
     * Método de acesso externo à categora da empresa
     * @return inteiro que simboliza o tipo da empresa
     */
    public int getCategoriaEmpresa() {
        return categoriaEmpresa;
    }
    /**
     * Método para definir a categoria
     * @param categoriaEmpresa o tipo da empresa
     */
    public void setCategoriaEmpresa(int categoriaEmpresa) {
        this.categoriaEmpresa = categoriaEmpresa;
    }

    /**
     * Método de acesso externo ao nome da empresa
     * @return o nome da empresa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome da empresa
     * @param nome novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método de acesso externo ao distrito da empresa
     * @return o distrito da empresa
     */
    public String getDistrito() {
        return distrito;
    }

    /**
     * Método para definir o distrito da empresa
     * @param distrito o distrito novo
     */
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    /**
     * Método de acesso externo às coordenadas da empresa
     * @return as coordenadas da empresa
     */
    public float[] getCoordenadas() {
        return coordenadas;
    }

    /**
     * Método para definir as coordenadas da empresa
     * @param coordenadas coordenadas novas
     */
    public void setCoordenadas(float[] coordenadas) {
        this.coordenadas = coordenadas;
    }
}
