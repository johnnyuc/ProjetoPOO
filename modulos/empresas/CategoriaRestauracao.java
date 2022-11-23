package modulos.empresas;

public abstract class CategoriaRestauracao extends Empresa {
    // Custo dos empregados de mesa é um custo implícito pois
    // Custo dos empregados de mesa = custoSalarioMedioAnual*numeroEmpregadosDeMesa
    float custoSalarioMedioAnual;
    int numeroEmpregadosDeMesa;

    // numeroMedioClientesDiario é um custo transversal a todas as empresas do tipo Restauracao
    float numeroMedioClientesDiario;

    public CategoriaRestauracao(String nome, String distrito, float[] coordenadas, float custoSalarioMedioAnual, int numeroEmpregadosDeMesa, float numeroMedioClientesDiario) {
        super(nome, distrito, coordenadas);
        this.custoSalarioMedioAnual = custoSalarioMedioAnual;
        this.numeroEmpregadosDeMesa = numeroEmpregadosDeMesa;
        this.numeroMedioClientesDiario = numeroMedioClientesDiario;
    }
}
