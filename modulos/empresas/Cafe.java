package modulos.empresas;

public class Cafe extends Restauracao {
    /**
     * O número médio de clientes diário
     */
    float clientesDiarios;
    /**
     * O número médio de cafés que vendem por dia
     */
    float cafesDiarios;
    /**
     * O valor médio de faturação anual por café vendido por dia
     * Receita anual = cafesDiarios*custoMedioCafe
     */
    float custoMedioCafe;

    /**
     * Construtor da classe, recebe os dados para a inicialização
     * dos atributos
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param empregadosMesa O número de empregados de mesa
     * @param cafesDiarios O número médio de cafés que se vendem por dia
     * @param clientesDiarios O número médio de clientes diário
     * @param custoMedioCafe O valor médio de faturação anual por café vendido por dia
     */
    public Cafe(String nome, String distrito, float[] coordenadas, float salarioMedioAnual,
                int empregadosMesa, float cafesDiarios, float clientesDiarios, float custoMedioCafe) {
        super(nome, distrito, coordenadas, salarioMedioAnual, empregadosMesa);
        this.cafesDiarios = cafesDiarios;
        this.clientesDiarios = clientesDiarios;
        this.custoMedioCafe= custoMedioCafe;
    }

    /** Método para definir o número médio de cafés que se vendem por dia */
    public void setCafesDiarios(float cafesDiarios) {
        this.cafesDiarios = cafesDiarios;
    }

    /** Método para definir o número médio de clientes diário */
    public void setClientesDiario(float clientesDiario) {
        this.clientesDiarios = clientesDiario;
    }

    /** Método para definir o valor médio de faturação anual por café vendido por dia */
    public void setCustoMedioCafe(float custoMedioCafe) {
        this.custoMedioCafe = custoMedioCafe;
    }

    /** Método de acesso externo ao número médio de cafés que se vendem por dia */
    public float getCafesDiarios() {
        return cafesDiarios;
    }

    /** Método de acesso externo ao número médio de clientes diário */
    public float getClientesDiario() {
        return clientesDiarios;
    }

    /** Método de acesso externo ao valor médio de faturação anual por café vendido por dia */
    public float getFaturacaoAnual() {
        return custoMedioCafe;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    public float calcularDespesaAnual() {
        return empregadosMesa*salarioMedioAnual;
    }

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    public float calcularReceitaAnual() {
        return cafesDiarios*custoMedioCafe;
    }
}
