package modulos.empresas;

public class Cafe extends Restauracao {
    /**
     * O número médio de clientes diário
     */
    float clientesDiarios;
    /**
     * O número médio de cafés que vendem por dia
     */
    float cafesDiarios;
    /**
     *  Valor médio de faturação anual por café vendido por dia é o custo médio de um café
     *  Faturação/Receita anual = cafesDiarios*custoMedioCafe
     *  (Valor médio de faturação anual por café vendido por dia = 'faturacaoAnual'/cafesDiarios)
     */
    float custoMedioCafe;

    /**
     * Construtor da classe, recebe os dados para a inicialização dos atributos
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param empregadosMesa O número de empregados de mesa
     * @param cafesDiarios O número médio de cafés que se vendem por dia
     * @param clientesDiarios O número médio de clientes diário
     * @param custoMedioCafe O valor médio de faturação anual por café vendido por dia
     */
    public Cafe(String nome, String distrito, float[] coordenadas, float salarioMedioAnual,
                int empregadosMesa, float cafesDiarios, float clientesDiarios, float custoMedioCafe) {
        super(nome, distrito, coordenadas, salarioMedioAnual, empregadosMesa);
        this.cafesDiarios = cafesDiarios;
        this.clientesDiarios = clientesDiarios;
        this.custoMedioCafe= custoMedioCafe;
    }

    /**
     * Métodos de acesso externo ao número médio de clientes diário
     */
    public float getClientesDiarios() {
        return clientesDiarios;
    }

    /**
     * Método para definir o número médio de clientes diário
     */
    public void setClientesDiarios(float clientesDiarios) {
        this.clientesDiarios = clientesDiarios;
    }

    /**
     * Métodos de acesso externo ao número médio de cafés que vendem por dia
     */
    public float getCafesDiarios() {
        return cafesDiarios;
    }

    /**
     * Método para definir o número médio de cafés que vendem por dia
     */
    public void setCafesDiarios(float cafesDiarios) {
        this.cafesDiarios = cafesDiarios;
    }

    /**
     * Métodos de acesso externo ao custo médio de um café
     * Diz também respeito ao valor médio de faturação anual por café vendido por dia
     */
    public float getCustoMedioCafe() {
        return custoMedioCafe;
    }

    /**
     * Método para definir o custo médio de um café
     * Diz também respeito ao valor médio de faturação anual por café vendido por dia
     */
    public void setCustoMedioCafe(float custoMedioCafe) {
        this.custoMedioCafe = custoMedioCafe;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    public float calcularDespesaAnual() {
        return empregadosMesa*salarioMedioAnual;
    }

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    public float calcularReceitaAnual() {
        return cafesDiarios*custoMedioCafe;
    }

    public float calcularLucro(){return calcularReceitaAnual()-calcularDespesaAnual();}
    @Override
    public String toString(){
        String s= "Empresa"+
                "\nNome                :\t"+this.nome+
                "\nTipo                :\t"+"Cafe"+
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
