
public class at13_1{
    public static void main(String[] args) {
        cabecalho();
        int n1 =soma(17, 6);
        int n2 =soma(2, 7);
        int n3 =soma(1, 29);
        int n4 =soma(32, 9);
        double media=caluloMedia(n1, n2, n3, n4);
        System.out.printf("A média é: %.2f",media); 
    }
    static void cabecalho(){
        System.out.println("----Cálculo de média----");
    }
    static int soma(int n1,int n2){
        int resultado=n1+n2;
        return resultado;
    }
    static double caluloMedia(int n1,int n2, int n3,int n4){
        double resultado=(n1+n2+n3+n4)/4;
        return resultado;
    }
}