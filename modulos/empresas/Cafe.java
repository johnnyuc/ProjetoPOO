package modulos.empresas;

public class Cafe extends Restauracao {
    /**
     * O número médio de clientes diário
     */
    float clientesDiario;
    /**
     * O número médio de cafés que vendem por dia
     */
    float cafesDiarios;
    /**
     * O valor médio de faturação anual por café vendido por dia
     */
    float faturacaoAnual;

    /**
     * Construtor da classe, recebe os dados para a inicialização
     * dos atributos
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param empregadosDeMesa O número de empregados de mesa
     * @param cafesDiarios O número médio de cafés que se vendem por dia
     * @param clientesDiario O número médio de clientes diário
     * @param faturacaoAnual O valor médio de faturação anual por café vendido por dia
     */
    public Cafe(String nome, String distrito, float[] coordenadas, float salarioMedioAnual, int empregadosDeMesa, float cafesDiarios, float clientesDiario, float faturacaoAnual) {
        super(nome, distrito, coordenadas, salarioMedioAnual, empregadosDeMesa);
        this.cafesDiarios = cafesDiarios;
        this.clientesDiario = clientesDiario;
        this.faturacaoAnual= faturacaoAnual;
    }
    /** Método para definir o número médio de cafés que se vendem por dia */
    public void setCafesDiarios(float cafesDiarios) {
        this.cafesDiarios = cafesDiarios;
    }
    /** Método para definir o número médio de clientes diário */
    public void setClientesDiario(float clientesDiario) {
        this.clientesDiario = clientesDiario;
    }
    /** Método para definir o valor médio de faturação anual por café vendido por dia */
    public void setFaturacaoAnual(float faturacaoAnual) {
        this.faturacaoAnual = faturacaoAnual;
    }
    /** Método de acesso externo ao número médio de cafés que se vendem por dia */
    public float getCafesDiarios() {
        return cafesDiarios;
    }
    /** Método de acesso externo ao número médio de clientes diário */
    public float getClientesDiario() {
        return clientesDiario;
    }
    /** Método de acesso externo ao valor médio de faturação anual por café vendido por dia */
    public float getFaturacaoAnual() {
        return faturacaoAnual;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    public float calcularDespesaAnual() {
        return empregadosDeMesa*salarioMedioAnual;
    }

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    public float calcularReceitaAnual() {
        return cafesDiarios*faturacaoAnual;
    }
}
