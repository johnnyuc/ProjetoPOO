package modulos.empresas;

public class Fastfood extends Restaurante {
    int mesasInterior;
    float faturacaoMediaMesa;
    float clientesDriveThru;
    float faturacaoMediaClienteDriveThru;

    public Fastfood(String nome, String distrito, float[] coordenadas, float custoSalarioMedioAnual, int numeroEmpregadosDeMesa, float numeroMedioClientesDiario, int diasFuncionamento, int mesasInterior, float faturacaoMediaMesa, float clientesDriveThru, float faturacaoMediaClienteDriveThru) {
        super(nome, distrito, coordenadas, custoSalarioMedioAnual, numeroEmpregadosDeMesa, diasFuncionamento);
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
