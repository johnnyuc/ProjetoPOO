package modulos.empresas;

public class Cafe extends Restauracao {

    /**
     * O número médio de cafés vendidos por dia
     */
    float cafesMedioDiario;
    /**
     *  Valor médio de faturação anual por café vendido por dia
     */
    float faturacaoMediaAnualCafe;


    /**
     * Construtor da classe, recebe os dados para a inicialização dos atributos
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param empregadosMesa O número de empregados de mesa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param clientesMedioDiario O número médio de clientes diário
     * @param cafesMedioDiario O número médio de cafés vendidos por dia
     * @param faturacaoMediaAnualCafe O valor médio de faturação anual por café vendido por dia
     */
    public Cafe(String nome, String distrito, float[] coordenadas, int empregadosMesa, float salarioMedioAnual, float clientesMedioDiario, float cafesMedioDiario, float faturacaoMediaAnualCafe) {
        super(nome, distrito, coordenadas, empregadosMesa, salarioMedioAnual, clientesMedioDiario);
        this.cafesMedioDiario = cafesMedioDiario;
        this.faturacaoMediaAnualCafe = faturacaoMediaAnualCafe;
        this.tipo= 0;
    }


    // Métodos

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    public float calcularReceitaAnual() {
        return cafesMedioDiario * faturacaoMediaAnualCafe;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    public float calcularDespesaAnual() {
        return empregadosMesa * salarioMedioAnual;
    }

    /**
     * Método utilizado para calcular o lucro anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor do lucro anual
     */
    public float calcularLucro() {
        return calcularReceitaAnual() - calcularDespesaAnual();
    }


    // Getters and Setters e Overrides

    /**
     * Métodos de acesso externo ao número médio de cafés que vendem por dia
     */
    public float getCafesMedioDiario() {
        return cafesMedioDiario;
    }

    /**
     * Método para definir o número médio de cafés que vendem por dia
     */
    public void setCafesMedioDiario(float cafesMedioDiario) {
        this.cafesMedioDiario = cafesMedioDiario;
    }

    /**
     * Métodos de acesso externo ao valor médio de faturação anual por café vendido por dia
     */
    public float getFaturacaoMediaAnualCafe() {
        return faturacaoMediaAnualCafe;
    }

    /**
     * Método para definir o valor médio de faturação anual por café vendido por dia
     */
    public void setFaturacaoMediaAnualCafe(float faturacaoMediaAnualCafe) {
        this.faturacaoMediaAnualCafe = faturacaoMediaAnualCafe;
    }
    /**
     * Método para apresentar todos os atributos de um determinado objeto
     * @return Uma ‘string’ que contém todos os atributos de um determinado objeto
     */
    @Override
    public String toString(){
        String s=
                "Tipo                  :\t"+"Café"+
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
