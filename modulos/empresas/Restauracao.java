package modulos.empresas;

public abstract class Restauracao extends Empresa {
    /**
     * O número de empregados de mesa
     */
    int empregadosMesa;
    /**
     * O custo do salário médio anual por empregado de mesa
     */
    float salarioMedioAnual;
    /**
     * O número médio de clientes diário
     * Este campo é transversal a todas as empresas de restauração, logo foi passado à classe mãe
     */
    float clientesMedioDiario;

    /**
     * Construtor da classe, recebe os dados para a inicialização dos atributos
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param empregadosMesa O número de empregados de mesa
     * @param salarioMedioAnual O custo do salário médio anual por empregado de mesa
     * @param clientesMedioDiario O número médio de clientes diário
     */
    public Restauracao(String nome, String distrito, float[] coordenadas, int empregadosMesa, float salarioMedioAnual, float clientesMedioDiario) {
        super(nome, distrito, coordenadas);
        this.empregadosMesa = empregadosMesa;
        this.salarioMedioAnual = salarioMedioAnual;
        this.clientesMedioDiario = clientesMedioDiario;
    }


    /**
     * Métodos de acesso externo ao número de empregados de mesa
     */
    public int getEmpregadosMesa() {
        return empregadosMesa;
    }

    /**
     * Método para definir o número de empregados de mesa
     */
    public void setEmpregadosMesa(int empregadosMesa) {
        this.empregadosMesa = empregadosMesa;
    }

    /**
     * Métodos de acesso externo ao custo do salário médio anual por empregado de mesa
     */
    public float getSalarioMedioAnual() {
        return salarioMedioAnual;
    }

    /**
     * Método para definir o custo do salário médio anual por empregado de mesa
     */
    public void setSalarioMedioAnual(float salarioMedioAnual) {
        this.salarioMedioAnual = salarioMedioAnual;
    }

    /**
     * Métodos de acesso externo ao número médio de clientes diário
     */
    public float getClientesMedioDiario() {
        return clientesMedioDiario;
    }

    /**
     * Método para definir o número médio de clientes diário
     */
    public void setClientesMedioDiario(float clientesMedioDiario) {
        this.clientesMedioDiario = clientesMedioDiario;
    }
}
