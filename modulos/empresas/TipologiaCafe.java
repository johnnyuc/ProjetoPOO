package modulos.empresas;

public class TipologiaCafe extends CategoriaRestauracao {
    float numeroMedioCafesDiarios;
    // Valor médio de faturação anual por café vendido por dia é o custo de um café
    // Receita anual = numeroMedioCafesDiarios*valorMedioFaturacaoAnualPorCafeVendidoPorDia
    // onde valorMedioFaturacaoAnualPorCafeVendidoPorDia = custoCafe
    float custoCafe;

    public TipologiaCafe(String nome, String distrito, float[] coordenadas, float custoSalarioMedioAnual, int numeroEmpregadosDeMesa, float numeroMedioClientesDiario, float numeroMedioCafesDiarios, float custoCafe) {
        super(nome, distrito, coordenadas, custoSalarioMedioAnual, numeroEmpregadosDeMesa, numeroMedioClientesDiario);
        this.numeroMedioCafesDiarios = numeroMedioCafesDiarios;
        this.custoCafe = custoCafe;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    public int calcularDespesaAnual() {
        return 0;
    }

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    public int calcularReceitaAnual() {
        return 0;
    }
}
