package modulos.empresas;

public class Fastfood extends Restaurante {
    /**
     * O número de mesas no interior
     */
    int mesasInterior;
    /**
     * O valor de faturação média por mesa por dia
     */
    float faturacaoMediaMesa;
    /**
     * O número médio de clientes 'drive-thru' diário
     */
    float clientesDriveThru;
    /**
     * O valor médio de faturação por cliente de 'drive-thru' (diário)
     */
    float faturacaoMediaClienteDriveThru;

    /**
     *  Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param empregadosMesa O número de empregados de mesa
     * @param diasFuncionamento O número de dias de funcionamento
     * @param mesasInterior O número de mesas no interior
     * @param faturacaoMediaMesa A faturação média por mesa
     * @param clientesDriveThru O número médio de clientes 'drive-thru' diário
     * @param faturacaoMediaClienteDriveThru O valor médio de faturação por cliente de 'drive-thru' (diário)
     */
    public Fastfood(String nome, String distrito, float[] coordenadas, float salarioMedioAnual,
                    int empregadosMesa, int diasFuncionamento, int mesasInterior, float faturacaoMediaMesa,
                    float clientesDriveThru, float faturacaoMediaClienteDriveThru) {
        super(nome, distrito, coordenadas, salarioMedioAnual, empregadosMesa, diasFuncionamento);
        this.mesasInterior = mesasInterior;
        this.faturacaoMediaMesa = faturacaoMediaMesa;
        this.clientesDriveThru = clientesDriveThru;
        this.faturacaoMediaClienteDriveThru = faturacaoMediaClienteDriveThru;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    @Override
    public float calcularDespesaAnual() {
        return empregadosMesa*salarioMedioAnual;
    }

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    @Override
    public float calcularReceitaAnual() {
        return ((mesasInterior*faturacaoMediaMesa) + (clientesDriveThru*faturacaoMediaClienteDriveThru))
                *diasFuncionamento;
    }
}
