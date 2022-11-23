package modulos.empresas;

public class Local extends Restaurante {
    /**
     * O número de mesas no interior
     */
    int mesasInterior;
    /**
     * O número de mesas no exterior
     */
    int mesasEsplanada;
    /**
     * O custo de licença anual por mesa de esplanada
     */
    float custoLicencaMesaEsplanada;
    /**
     * O valor de faturação média por mesa por dia
     */
    float faturacaoMediaMesa;
    /**
     * O número médio de clientes diário
     */
    float clientesDiarios;

    /**
     *  Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param empregadosMesa O número de empregados de mesa
     * @param diasFuncionamento O número de dias de funcionamento
     * @param mesasInterior O número de mesas no interior
     * @param mesasEsplanada O número de mesas na esplanada
     * @param custoLicencaMesaEsplanada O custo da licença de mesa na esplanada
     * @param faturacaoMediaMesa A faturação média por mesa
     * @param clientesDiarios O número médio de clientes diário
     */
    public Local(String nome, String distrito, float[] coordenadas, float salarioMedioAnual,
                 int empregadosMesa, int diasFuncionamento, int mesasInterior, int mesasEsplanada,
                 float custoLicencaMesaEsplanada, float faturacaoMediaMesa, float clientesDiarios) {
        super(nome, distrito, coordenadas, salarioMedioAnual, empregadosMesa, diasFuncionamento);
        this.mesasInterior = mesasInterior;
        this.mesasEsplanada = mesasEsplanada;
        this.custoLicencaMesaEsplanada = custoLicencaMesaEsplanada;
        this.faturacaoMediaMesa = faturacaoMediaMesa;
        this.clientesDiarios = clientesDiarios;
    }

    /*
     * Métodos de acesso externo ao número de mesas no interior
     */
    public int getMesasInterior() {
        return mesasInterior;
    }

    /*
     * Método para definir o número de mesas no interior
     */
    public void setMesasInterior(int mesasInterior) {
        this.mesasInterior = mesasInterior;
    }

    /*
     * Métodos de acesso externo ao número de mesas na esplanada
     */
    public int getMesasEsplanada() {
        return mesasEsplanada;
    }

    /*
     * Método para definir o número de mesas na esplanada
     */
    public void setMesasEsplanada(int mesasEsplanada) {
        this.mesasEsplanada = mesasEsplanada;
    }

    /*
     * Métodos de acesso externo ao custo da licença de mesa na esplanada
     */
    public float getCustoLicencaMesaEsplanada() {
        return custoLicencaMesaEsplanada;
    }

    /*
     * Método para definir o custo da licença de mesa na esplanada
     */
    public void setCustoLicencaMesaEsplanada(float custoLicencaMesaEsplanada) {
        this.custoLicencaMesaEsplanada = custoLicencaMesaEsplanada;
    }

    /*
     * Métodos de acesso externo à faturação média por mesa
     */
    public float getFaturacaoMediaMesa() {
        return faturacaoMediaMesa;
    }

    /*
     * Método para definir a faturação média por mesa
     */
    public void setFaturacaoMediaMesa(float faturacaoMediaMesa) {
        this.faturacaoMediaMesa = faturacaoMediaMesa;
    }

    /*
     * Métodos de acesso externo ao número médio de clientes diário
     */
    public float getClientesDiarios() {
        return clientesDiarios;
    }

    /*
     * Método para definir o número médio de clientes diário
     */
    public void setClientesDiarios(float clientesDiarios) {
        this.clientesDiarios = clientesDiarios;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    @Override
    public float calcularDespesaAnual() {
        return (empregadosMesa*salarioMedioAnual) + (mesasEsplanada*custoLicencaMesaEsplanada);
    }

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    @Override
    public float calcularReceitaAnual() {
        return (mesasInterior+mesasEsplanada)*faturacaoMediaMesa*diasFuncionamento;
    }
}
