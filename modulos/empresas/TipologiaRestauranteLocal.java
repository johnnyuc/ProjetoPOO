package modulos.empresas;

public class TipologiaRestauranteLocal extends SubcategoriaRestaurante {
    int mesasInterior;
    int mesasEsplanada;
    float custoLicencaMesaEsplanada;
    float faturacaoMediaMesa;

    public TipologiaRestauranteLocal(String nome, String distrito, float[] coordenadas, float custoSalarioMedioAnual, int numeroEmpregadosDeMesa, float numeroMedioClientesDiario, float clientes, int diasFuncionamento, int mesasInterior, int mesasEsplanada, float custoLicencaMesaEsplanada, float faturacaoDiaria) {
        super(nome, distrito, coordenadas, custoSalarioMedioAnual, numeroEmpregadosDeMesa, numeroMedioClientesDiario, clientes, diasFuncionamento);
        this.mesasInterior = mesasInterior;
        this.mesasEsplanada = mesasEsplanada;
        this.custoLicencaMesaEsplanada = custoLicencaMesaEsplanada;
        this.faturacaoMediaMesa = faturacaoDiaria;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    @Override
    public int calcularDespesaAnual() {
        return 0;
    }

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    @Override
    public int calcularReceitaAnual() {
        return 0;
    }
}
