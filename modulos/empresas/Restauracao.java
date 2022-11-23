package modulos.empresas;

public abstract class Restauracao extends Empresa {
    /**
     * O custo do salário médio anual por empregado de mesa
     */
    float salarioMedioAnual;
    /**
     * o número de empregados de mesa
     */
    int empregadosMesa;

    /**
     * Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param empregadosMesa O número de empregados de mesa
     */
    public Restauracao(String nome, String distrito, float[] coordenadas,
                       float salarioMedioAnual, int empregadosMesa) {
        super(nome, distrito, coordenadas);
        this.salarioMedioAnual = salarioMedioAnual;
        this.empregadosMesa = empregadosMesa;
    }
}
