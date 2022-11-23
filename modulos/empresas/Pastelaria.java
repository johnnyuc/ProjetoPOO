package modulos.empresas;

public class Pastelaria extends Restauracao {
    /**
     * O número médio de bolos vendidos por dia
     */
    float bolosVendidos;
    /**
     *  Valor médio de faturação anual por bolo vendido por dia é o custo médio de um bolo
     *  Faturação/Receita anual = bolosVendidos*custoMedioBolo
     *  (Valor médio de faturação anual por bolo vendido por dia = 'faturacaoAnual'/bolosVendidos)
     */
    float custoMedioBolo;
    /*
     * O número médio de clientes diário
     */
    float clientesDiarios;

    /**
     * Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param empregadosMesa O número de empregados de mesa
     * @param clientesDiarios O número médio de clientes diário
     * @param bolosVendidos O número de bolos vendidos por dia
     * @param custoMedioBolo O custo médio de um bolo vendido por dia
     */
    public Pastelaria(String nome, String distrito, float[] coordenadas, float salarioMedioAnual,
                      int empregadosMesa, float clientesDiarios, float bolosVendidos, float custoMedioBolo) {
        super(nome, distrito, coordenadas, salarioMedioAnual, empregadosMesa);
        this.clientesDiarios = clientesDiarios;
        this.bolosVendidos = bolosVendidos;
        this.custoMedioBolo = custoMedioBolo;
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
        return bolosVendidos*custoMedioBolo;
    }
}
