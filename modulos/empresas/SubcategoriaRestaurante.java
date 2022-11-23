package modulos.empresas;

public abstract class SubcategoriaRestaurante extends CategoriaRestauracao {
    int diasFuncionamento;

    public SubcategoriaRestaurante(String nome, String distrito, float[] coordenadas, float custoSalarioMedioAnual, int numeroEmpregadosDeMesa, float numeroMedioClientesDiario, float clientes, int diasFuncionamento) {
        super(nome, distrito, coordenadas, custoSalarioMedioAnual, numeroEmpregadosDeMesa, numeroMedioClientesDiario);
        this.diasFuncionamento = diasFuncionamento;
    }
}
