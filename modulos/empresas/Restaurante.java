package modulos.empresas;

public abstract class Restaurante extends Restauracao {
    int diasFuncionamento;

    public Restaurante(String nome, String distrito, float[] coordenadas, float custoSalarioMedioAnual, int numeroEmpregadosDeMesa, int diasFuncionamento) {
        super(nome, distrito, coordenadas, custoSalarioMedioAnual, numeroEmpregadosDeMesa);
        this.diasFuncionamento = diasFuncionamento;
    }
}
