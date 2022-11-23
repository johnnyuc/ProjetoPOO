package modulos.empresas;

public abstract class Restaurante extends Restauracao {
    /**
     * O número de dias de funcionamento do estabelecimento por ano
     */
    int diasFuncionamento;

    /**
     *  Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param empregadosMesa O número de empregados de mesa
     * @param diasFuncionamento O número de dias de funcionamento
     */
    public Restaurante(String nome, String distrito, float[] coordenadas, float salarioMedioAnual, int empregadosMesa, int diasFuncionamento) {
        super(nome, distrito, coordenadas, salarioMedioAnual, empregadosMesa);
        this.diasFuncionamento = diasFuncionamento;
    }

    /*
     * Métodos de acesso externo ao número de dias de funcionamento do estabelecimento por ano
     */
    public int getDiasFuncionamento() {
        return diasFuncionamento;
    }

    /*
     * Método para definir o número de dias de funcionamento do estabelecimento por ano
     */
    public void setDiasFuncionamento(int diasFuncionamento) {
        this.diasFuncionamento = diasFuncionamento;
    }
}
