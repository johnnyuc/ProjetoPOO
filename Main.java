import modulos.empresas.*;

public class Main {
    public static void main(String[] args) {
        Cafe cafe1= new Cafe("a","a", new float[]{0, 0},0,0,0,0,0);
        System.out.println(cafe1.getClass().equals(Empresa.class));
    }
}
