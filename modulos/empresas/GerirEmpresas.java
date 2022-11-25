package modulos.empresas;

import java.util.ArrayList;
import java.util.Objects;

public class GerirEmpresas {
    ArrayList <Empresa> empresas;

    public ArrayList<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }

    public GerirEmpresas(ArrayList <Empresa> empresas){this.empresas=empresas;}

    public void imprimirEmpresas(){
        if(this.empresas!=null){
            for(int i=0; i< this.empresas.size(); i++){
                System.out.println(this.empresas.get(i).toString());
            }
        }
    }

    /**Método responsável por adicionar uma empresa a lista de gestão de empresas
     *
     * @param empresa Empresa a ser adicionada na lista
     * @return 1: se a empresa já está na lista. 0: se a empresa ainda
     * não estava na lista e o programa foi executado adequadamente
     */
    public int adicionarEmpresa(Empresa empresa){
        int jaExiste= 0;
        if(this.empresas!=null){
                for (int i = 0; i < this.empresas.size(); i++) {
                    if (Objects.equals(this.empresas.get(i).nome, empresa.nome)) {
                        jaExiste = 1;
                        break;
                    }
                }

        }
        if(jaExiste==0){
            assert this.empresas != null : "Lista inexistente";
            this.empresas.add(empresa);
        }
        return jaExiste;
    }

    /** Método utilizado para apagar uma empresa da lista de gestão de empresas
     *
     * @param nome Nome da empresa a ser apagada
     * @return 1: se não existe uma empresa na lista. 0: se existe uma empresa na lista e o programa foi
     * executado adequadamente
     */
    public int apagarEmpresa(String nome){
        int existe= 1;
        if(this.empresas!=null){
            for(int i=0; i< this.empresas.size(); i++){
                if(Objects.equals(this.empresas.get(i).nome, nome)){
                    this.empresas.remove(i);
                    existe=0;
                    i--;
                }
            }
        }
        return existe;
    }
}
