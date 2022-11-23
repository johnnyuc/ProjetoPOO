package modulos.empresas;

public abstract class SubcategoriaRestaurante extends CategoriaRestauracao {
    int diasFuncionamento;

    public SubcategoriaRestaurante(String nome, String distrito, float[] coordenadas, float custoSalarioMedioAnual, int numeroEmpregadosDeMesa, int diasFuncionamento) {
        super(nome, distrito, coordenadas, custoSalarioMedioAnual, numeroEmpregadosDeMesa);
        this.diasFuncionamento = diasFuncionamento;
    }
}
