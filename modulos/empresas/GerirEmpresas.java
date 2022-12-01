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
     * Método para a maior receita anual de todas as empresas
     */
    int maiorReceitaAnual(Class classe) {
        if (empresas != null) {
            String nome = null;
            float valor = Float.MIN_VALUE;
            for (Empresa empresa : empresas) {
                if (empresa.getClass().equals(classe)) {
                    float valor_temp = empresa.calcularReceitaAnual();
                    if (valor_temp >= valor)
                        nome = empresa.nome;
                    valor = valor_temp;
                }
            }
            if(nome != null){
                System.out.println("Empresa do tipo"+classe.getSimpleName()+" com a maior receita anual:" +
                        "\nNome                  :\t"+ nome+
                        "\nValor da receita anual:\t"+valor);
                return 0;
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
