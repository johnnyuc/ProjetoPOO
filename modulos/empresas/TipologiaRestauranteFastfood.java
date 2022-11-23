package modulos.empresas;

public class TipologiaRestauranteFastfood extends SubcategoriaRestaurante {
    int mesasInterior;
    float faturacaoMediaMesa;
    float numeroMedioClientesDriveThru;
    float faturacaoMediaClienteDriveThru;

    public TipologiaRestauranteFastfood(String nome, String distrito, float[] coordenadas, float custoSalarioMedioAnual, int numeroEmpregadosDeMesa, float numeroMedioClientesDiario, float clientes, int diasFuncionamento, int mesasInterior, float faturacaoMediaMesa, float numeroMedioClientesDriveThru, float faturacaoMediaClienteDriveThru) {
        super(nome, distrito, coordenadas, custoSalarioMedioAnual, numeroEmpregadosDeMesa, numeroMedioClientesDiario, clientes, diasFuncionamento);
        this.mesasInterior = mesasInterior;
        this.faturacaoMediaMesa = faturacaoMediaMesa;
        this.numeroMedioClientesDriveThru = numeroMedioClientesDriveThru;
        this.faturacaoMediaClienteDriveThru = faturacaoMediaClienteDriveThru;
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
