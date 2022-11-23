package modulos.empresas;

public abstract class Restauracao extends Empresa {
    /**
     * O custo do salário médio anual por empregado de mesa
     */
    float salarioMedioAnual;
    /**
     * o número de empregados de mesa
     */
    int empregadosDeMesa;


    public Restauracao(String nome, String distrito, float[] coordenadas, float salarioMedioAnual, int empregadosDeMesa) {
        super(nome, distrito, coordenadas);
        this.salarioMedioAnual = salarioMedioAnual;
        this.empregadosDeMesa = empregadosDeMesa;
    }
}
