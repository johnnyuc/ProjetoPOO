package modulos.empresas;

import java.util.ArrayList;
import java.util.Objects;

public class GerirEmpresas {

    /**
     * Lista de empresas
     */
    ArrayList <Empresa> empresas;


    /**
     * Construtor da classe, recebe os dados para a inicialização dos atributos
     * @param empresas A lista de empresas
     */
    public GerirEmpresas(ArrayList <Empresa> empresas){
        this.empresas = empresas;
    }

    // Métodos

    /**
     * Método para adicionar imprimir os dados de todas as empresas
     */
    public void imprimirEmpresas(){
        if(this.empresas != null){
            for(int i = 0; i < this.empresas.size(); i++){
                System.out.println(this.empresas.get(i).toString());
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
        boolean jaExiste = false;
        if(this.empresas != null){
                for (int i = 0; i < this.empresas.size(); i++) {
                    if (Objects.equals(this.empresas.get(i).nome, empresa.nome)) {
                        jaExiste = true;
                        return 1;
                    }
                }
            this.empresas.add(empresa);
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
        if(this.empresas!=null){
            for(int i=0; i< this.empresas.size(); i++){
                if(Objects.equals(this.empresas.get(i).nome, nome)){
                    this.empresas.remove(i);
                    return 0;
                }
            }
            return 1;
        }
        return 1;
    }

    /*
    * Método para a maior receita anual de todas as empresas
     */
    int maiorReceitaAnual(Class classe) {
        if (this.empresas != null) {
            String nome = null;
            float valor = Float.MIN_VALUE;
            for (int i = 0; i < this.empresas.size(); i++) {
                if (this.empresas.get(i).getClass().equals(classe)) {
                    float valor_temp = this.empresas.get(i).calcularReceitaAnual();
                    if(valor_temp >= valor)
                    nome = this.empresas.get(i).nome;
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

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }
}
