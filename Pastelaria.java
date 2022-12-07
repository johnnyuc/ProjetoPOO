/**
 * Classe que simboliza as empresas do tipo pastelaria
 */
public class Pastelaria extends Restauracao {

    /**
     * O número médio de bolos vendidos por dia
     */
    private float bolosMedioDiario;
    /**
     *  Valor médio de faturação anual por bolo vendido por dia
     */
    private float faturacaoMediaAnualBolo;


    /**
     * Construtor da classe, recebe os dados para a inicialização dos atributos
     * @param nome O nome da empresa
     * @param distrito O distrito onde se localiza a empresa
     * @param coordenadas As coordenadas da empresa
     * @param empregadosMesa O número de empregados de mesa
     * @param salarioMedioAnual O custo do salário médio anual
     * @param clientesMedioDiario O número médio de clientes diário
     * @param bolosMedioDiario O número de bolos vendidos por dia
     * @param faturacaoMediaAnualBolo O custo médio de um bolo vendido por dia
     */
    public Pastelaria(String nome, String distrito, float[] coordenadas, int empregadosMesa, float salarioMedioAnual, float clientesMedioDiario, float bolosMedioDiario, float faturacaoMediaAnualBolo) {
        super(nome, distrito, coordenadas, empregadosMesa, salarioMedioAnual, clientesMedioDiario);
        this.bolosMedioDiario = bolosMedioDiario;
        this.faturacaoMediaAnualBolo = faturacaoMediaAnualBolo;
        this.setCategoriaEmpresa(1);
    }


    // Métodos

    /**
     * Método utilizado para calcular a receita anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da receita anual
     */
    public float calcularReceitaAnual() {
        return bolosMedioDiario * faturacaoMediaAnualBolo;
    }

    /**
     * Método utilizado para calcular a despesa anual de uma determinada empresa a partir dos seus dados,
     *
     * @return O valor da despesa anual
     */
    public float calcularDespesaAnual() {
        return getEmpregadosMesa() * getSalarioMedioAnual();
    }

    /**
     * Método para definir o número médio de bolos vendidos por dia
     * @return o número médio de bolos vendidos por dia
     */
    public float getBolosMedioDiario() {
        return bolosMedioDiario;
    }

    /**
     * Método para definir o número médio de bolos vendidos por dia
     * @param bolosMedioDiario o número médio de bolos vendidos por dia
     */
    public void setBolosMedioDiario(float bolosMedioDiario) {
        this.bolosMedioDiario = bolosMedioDiario;
    }

    /**
     * Diz também respeito ao valor médio de faturação anual por bolo vendido por dia
     * @return o valor médio de faturação anual por bolo vendido por dia
     */
    public float getFaturacaoMediaAnualBolo() {
        return faturacaoMediaAnualBolo;
    }

    /**
     * Diz também respeito ao valor médio de faturação anual por bolo vendido por dia
     * @param faturacaoMediaAnualBolo o valor médio de faturação anual por bolo vendido por dia
     */
    public void setFaturacaoMediaAnualBolo(float faturacaoMediaAnualBolo) {
        this.faturacaoMediaAnualBolo = faturacaoMediaAnualBolo;
    }
    /**
     * Método para apresentar todos os atributos de um determinado objeto
     * @return Uma ‘string’ que contém todos os atributos de um determinado objeto
     */
    @Override
    public String toString(){
        String s=
                "Tipo                  :\t"+"Pastelaria"+
                "\nNome                :\t"+this.getNome()+
                "\nDistrito            :\t"+this.getDistrito()+
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
