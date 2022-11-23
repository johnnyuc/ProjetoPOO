package modulos.empresas;

public class Local extends Restaurante {
    int mesasInterior;
    int mesasEsplanada;
    float custoLicencaMesaEsplanada;
    float faturacaoMediaMesa;

    float clientesDiarios;

    public Local(String nome, String distrito, float[] coordenadas, float custoSalarioMedioAnual, int numeroEmpregadosDeMesa, float clientesDiario, float clientes, int diasFuncionamento, int mesasInterior, int mesasEsplanada, float custoLicencaMesaEsplanada, float faturacaoDiaria) {
        super(nome, distrito, coordenadas, custoSalarioMedioAnual, numeroEmpregadosDeMesa, diasFuncionamento);
        this.mesasInterior = mesasInterior;
        this.mesasEsplanada = mesasEsplanada;
        this.custoLicencaMesaEsplanada = custoLicencaMesaEsplanada;
        this.faturacaoMediaMesa = faturacaoDiaria;
        this.clientesDiarios= clientesDiario;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    @Override
    public float calcularDespesaAnual() {
        return 0;
    }

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    @Override
    public float calcularReceitaAnual() {
        return 0;
    }
}
