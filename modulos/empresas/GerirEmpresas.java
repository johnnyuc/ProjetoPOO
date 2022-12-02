package modulos.empresas;

import java.util.ArrayList;
import java.util.Objects;

public class GerirEmpresas {

    /**
     * Lista de empresas
     */
    public static ArrayList <Empresa> empresas;


    /**
     * Construtor da classe, recebe os dados para a inicialização dos atributos
     * @param empresas A lista de empresas
     */
    public GerirEmpresas(ArrayList <Empresa> empresas){
        GerirEmpresas.empresas = empresas;
    }

    // Métodos

    /**
     * Método para adicionar imprimir os dados de todas as empresas
     */
    public void imprimirEmpresas(){
        if(empresas != null){
            for (Empresa empresa : empresas) {
                System.out.println(empresa.toString());
            }
        }
    }

    /**
     * Método responsável por adicionar uma empresa a lista de gestão de empresas
     *
     * @param empresa Empresa a ser adicionada na lista
     * @return 1: se a empresa já está na lista. 0: se a empresa ainda
     * não estava na lista e o programa foi executado adequadamente
     */
    public int adicionarEmpresa(Empresa empresa){
        if(empresas != null){
            for (Empresa value : empresas) {
                if (Objects.equals(value.nome, empresa.nome)) {
                    return 1;
                }
            }
            empresas.add(empresa);
            return 0;
        }
        return 1;
    }

    /**
     * Método utilizado para apagar uma empresa da lista de gestão de empresas
     *
     * @param nome Nome da empresa a ser apagada
     * @return 1: se não existe uma empresa na lista. 0: se existe uma empresa na lista e o programa foi
     * executado adequadamente
     */
    public int apagarEmpresa(String nome){
        if(empresas!=null){
            for(int i=0; i< empresas.size(); i++){
                if(Objects.equals(empresas.get(i).nome, nome)){
                    empresas.remove(i);
                    return 0;
                }
            }
            return 1;
        }
        return 1;
    }

    /**
     * Método para mostrar a empresa com a maior receita anual
     * @param tipoProcurar Categoria da empresa a procurar
     * @return 1: se o programa não foi executado adequadamente. 0: se o programa foi
     * executado adequadamente
     */
    public int maiorReceitaAnual(int tipoProcurar) {
        if (empresas != null) {
            String nome = null;
            float valor = Float.MIN_VALUE;
            for (Empresa empresa : empresas) {
                if (empresa.tipo==tipoProcurar){
                    float receitaTemp = empresa.calcularReceitaAnual();
                    if (receitaTemp >= valor) {
                        nome = empresa.nome;
                        valor = receitaTemp;
                    }
                }

            }
            if(nome != null){
                System.out.println("Empresa do tipo escolhido com a maior receita anual:" +
                        "\nNome                  :\t"+ nome+
                        "\nValor da receita anual:\t€"+valor);
                return 0;
            }
            return 1;
        }
        return 1;
    }
    /**
     * Método para mostrar a empresa com a menor despesa anual
     * @param tipoProcurar Categoria da empresa a procurar
     * @return 1: se o programa não foi executado adequadamente. 0: se o programa foi
     * executado adequadamente
     */
    public int menorDespesaAnual(int tipoProcurar) {
        if (empresas != null) {
            String nome = null;
            float valor = Float.MAX_VALUE;
            for (Empresa empresa : empresas) {
                if (empresa.tipo==tipoProcurar){
                    float despesaTemp = empresa.calcularDespesaAnual();
                    if (despesaTemp <= valor) {
                        nome = empresa.nome;
                        valor = despesaTemp;
                    }
                }

            }
            if(nome != null){
                System.out.println("Empresa do tipo escolhido com a menor despesa anual:" +
                        "\nNome                  :\t"+ nome+
                        "\nValor da despesa anual:\t€"+valor);
                return 0;
            }
            return 1;
        }
        return 1;
    }
    /**
     * Método para mostrar a empresa com o maior lucro
     * @param tipoProcurar Categoria da empresa a procurar
     * @return 1: se o programa não foi executado adequadamente. 0: se o programa foi
     * executado adequadamente
     */
    public int maiorLucroAnual(int tipoProcurar) {
        if (empresas != null) {
            String nome = null;
            float valor = Float.MIN_VALUE;
            for (Empresa empresa : empresas) {
                if (empresa.tipo==tipoProcurar){
                    float lucroTemp = empresa.calcularLucro();
                    if (lucroTemp <= valor) {
                        nome = empresa.nome;
                        valor = lucroTemp;
                    }
                }

            }
            if(nome != null){
                System.out.println("Empresa do tipo escolhido com o maior lucro:" +
                        "\nNome          :\t"+ nome+
                        "\nValor do lucro:\t€"+valor);
                return 0;
            }
            return 1;
        }
        return 1;
    }
    /**
     * Método para mostrar a empresa de Restauração com a maior capacidade de clientes por dia
     * @param tipoProcurar Categoria da empresa a procurar
     * @return 1: se o programa não foi executado adequadamente. 0: se o programa foi
     * executado adequadamente
     */
    public int maiorCapacidadeClientes(int tipoProcurar) {
        if(tipoProcurar<=3) {
            if (empresas != null) {
                String nome1 = null;
                float valor1 = Float.MIN_VALUE;
                String nome2= null;
                float valor2 = Float.MIN_VALUE;
                for (Empresa empresa : empresas) {
                    if (empresa.tipo == tipoProcurar) {
                        float clientesTemp = ((Restauracao)empresa).clientesMedioDiario;
                        if (clientesTemp <= valor1) {
                            //A empresa que antes estava em primeiro, agora passa a segunda
                            nome2= nome1;
                            valor2=valor1;
                            //Substituem-se os valores da empresa antes em primeiro, pelos novos dados
                            nome1 = empresa.nome;
                            valor1 = clientesTemp;
                        }
                        if(!empresa.nome.equals(nome1)&&clientesTemp<=valor2){
                            nome2 = empresa.nome;
                            valor2 = clientesTemp;
                        }
                    }
                }
                if(nome1!=null&&nome2!=null){
                    System.out.println("Empresa de restauração com a maior capacidade de clientes por dia" +
                            "\nNome          :\t" + nome1 +
                            "\nCapacidade de clientes por dia\t" + valor1);
                    System.out.println("Empresa de restauração com a segunda maior capacidade de clientes por dia" +
                            "\nNome          :\t" + nome2 +
                            "\nCapacidade de clientes por dia\t" + valor2);
                    return 0;
                }
                return 1;
            }
            return 1;
        }
        return 1;
    }
    // Getters and Setters e Overrides

    /**
     * Método de acesso externo às empresas geridas
     * @return Um array que contém todas as empresas geridas
     */
    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    /**
     * Método utilizado para definir a lista de empresas geridas
     * @param empresas lista de empresas geridas
     */
    public void setEmpresas(ArrayList<Empresa> empresas) {
        GerirEmpresas.empresas = empresas;
    }
}
