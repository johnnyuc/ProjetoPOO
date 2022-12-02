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
    float faturacaoMediaMesaDiario;


    /**
     *  Construtor da classe, recebe os dados para a inicialização
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param empregadosMesa O número de empregados de mesa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param clientesMedioDiario O número médio de clientes diário
     * @param diasFuncionamento O número de dias de funcionamento
     * @param mesasInterior O número de mesas no interior
     * @param mesasEsplanada O número de mesas na esplanada
     * @param custoLicencaMesaEsplanada O custo da licença de mesa na esplanada
     * @param faturacaoMediaMesaDiario A faturação média por mesa
     */
    public Local(String nome, String distrito, float[] coordenadas, int empregadosMesa, float salarioMedioAnual, float clientesMedioDiario, int diasFuncionamento, int mesasInterior, int mesasEsplanada, float custoLicencaMesaEsplanada, float faturacaoMediaMesaDiario) {
        super(nome, distrito, coordenadas, empregadosMesa, salarioMedioAnual, clientesMedioDiario, diasFuncionamento);
        this.mesasInterior = mesasInterior;
        this.mesasEsplanada = mesasEsplanada;
        this.custoLicencaMesaEsplanada = custoLicencaMesaEsplanada;
        this.faturacaoMediaMesaDiario = faturacaoMediaMesaDiario;
        this.tipo = 2;
    }


    // Métodos
    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    public float calcularReceitaAnual() {
        return (mesasInterior + mesasEsplanada) * faturacaoMediaMesaDiario * diasFuncionamento;
    }

    /**
     * Método para calcular o custo a despesa anual de uma determinada empresa a partir dos seus dados,
     * @return O valor da despesa anual
     */
    public float calcularDespesaAnual() {
        return (empregadosMesa * salarioMedioAnual) + (mesasEsplanada*custoLicencaMesaEsplanada);
    }

    /**
     * Método para calcular o lucro anual de uma determinada empresa a partir dos seus dados,
     * @return O valor do lucro anual
     */
    public float calcularLucro() {
        return calcularReceitaAnual() - calcularDespesaAnual();
    }


    // Getters and Setters e Overrides

    /**
     * Métodos de acesso externo ao número de mesas no interior
     */
    public int getMesasInterior() {
        return mesasInterior;
    }

    /**
     * Método para definir o número de mesas no interior
     */
    public void setMesasInterior(int mesasInterior) {
        this.mesasInterior = mesasInterior;
    }

    /**
     * Métodos de acesso externo ao número de mesas na esplanada
     */
    public int getMesasEsplanada() {
        return mesasEsplanada;
    }

    /**
     * Método para definir o número de mesas na esplanada
     */
    public void setMesasEsplanada(int mesasEsplanada) {
        this.mesasEsplanada = mesasEsplanada;
    }

    /**
     * Métodos de acesso externo ao custo da licença de mesa na esplanada
     */
    public float getCustoLicencaMesaEsplanada() {
        return custoLicencaMesaEsplanada;
    }

    /**
     * Método para definir o custo da licença de mesa na esplanada
     */
    public void setCustoLicencaMesaEsplanada(float custoLicencaMesaEsplanada) {
        this.custoLicencaMesaEsplanada = custoLicencaMesaEsplanada;
    }

    /**
     * Métodos de acesso externo à faturação média por mesa
     */
    public float getFaturacaoMediaMesaDiario() {
        return faturacaoMediaMesaDiario;
    }

    /**
     * Método para definir a faturação média por mesa
     */
    public void setFaturacaoMediaMesaDiario(float faturacaoMediaMesaDiario) {
        this.faturacaoMediaMesaDiario = faturacaoMediaMesaDiario;
    }
    /**
     * Método para apresentar todos os atributos de um determinado objeto
     * @return Uma ‘string’ que contém todos os atributos de um determinado objeto
     */
    @Override
    public String toString(){
        String s=
                "Tipo                  :\t"+"Local"+
                "\nNome                :\t"+this.nome+
                "\nDistrito            :\t"+this.distrito+
                "\nDespesa Anual       :\t"+calcularDespesaAnual()+
                "\nReceita Anual       :\t"+calcularReceitaAnual()+
                "\nLucro               :\t";
        float lucro= this.calcularLucro();
        if (lucro>0){
            s+="Sim";
        }
        else{
            s+="Não";
        }
        return s;
    }
}
