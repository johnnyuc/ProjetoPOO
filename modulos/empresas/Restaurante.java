package modulos.empresas;

public abstract class Restaurante extends Restauracao {

    /**
     * O número de dias de funcionamento do estabelecimento por ano
     */
    int diasFuncionamento;


    /**
     *  Construtor da classe, recebe os dados para a inicialização dos atributos
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param empregadosMesa O número de empregados de mesa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param clientesMedioDiario O número médio de clientes diário
     * @param diasFuncionamento O número de dias de funcionamento
     */
    public Restaurante(String nome, String distrito, float[] coordenadas, int empregadosMesa, float salarioMedioAnual, float clientesMedioDiario, int diasFuncionamento) {
        super(nome, distrito, coordenadas, empregadosMesa, salarioMedioAnual, clientesMedioDiario);
        this.diasFuncionamento = diasFuncionamento;
    }


    // Getters and Setters e Overrides

    /**
     * Métodos de acesso externo ao número de dias de funcionamento do estabelecimento por ano
     */
    public int getDiasFuncionamento() {
        return diasFuncionamento;
    }

    /**
     * Método para definir o número de dias de funcionamento do estabelecimento por ano
     */
    public void setDiasFuncionamento(int diasFuncionamento) {
        this.diasFuncionamento = diasFuncionamento;
    }
}
