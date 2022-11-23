package modulos.empresas;

public class TipologiaPastelaria extends CategoriaRestauracao {
    float bolosVendidos;
    // Valor médio de faturação anual por bolo vendido por dia é o custo médio de um bolo
    // Receita anual = numeroMedioBolosDiarios*valorMedioFaturacaoAnualPorBoloVendidoPorDia
    // onde valorMedioFaturacaoAnualPorBoloVendidoPorDia = custoMedioBolo
    float custoMedioBolo;

    public TipologiaPastelaria(String nome, String distrito, float[] coordenadas, float custoSalarioMedioAnual, int numeroEmpregadosDeMesa, float numeroMedioClientesDiario, float bolosVendidos, float custoMedioBolo) {
        super(nome, distrito, coordenadas, custoSalarioMedioAnual, numeroEmpregadosDeMesa, numeroMedioClientesDiario);
        this.bolosVendidos = bolosVendidos;
        this.custoMedioBolo = custoMedioBolo;
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
