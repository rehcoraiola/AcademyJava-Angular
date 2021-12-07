package p3;

public class Tela {
    public static void main(String[] args) {
        Calculadora c=new Calculadora();
        System.out.println(c.soma(7,3));
        System.out.println(c.soma(12.22, 22.30));
        System.out.println(c.soma(23.22f, 23.22f, 23.22f));
        System.out.println(c.soma(124235, 15351, 153151));
    }
}
