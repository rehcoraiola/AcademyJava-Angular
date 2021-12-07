import java.util.Random;
public class at13_2{
    public static void main(String[] args) {
        cabecalho();
        System.out.println(geradorNum());
    }
    static void cabecalho(){
        System.out.println("----Cálculo de média----");
    }
    static int soma(int n1,int n2){
        int resultado=n1+n2;
        return resultado;
    }
    static int geradorNum(){
        int aculumador=0;
        Random gerador=new Random();
        for (int i = 0; i < 4; i++) {
            aculumador +=soma(gerador.nextInt(200), gerador.nextInt(50));
        }
        System.out.printf("A média é: %d",(aculumador/4)); 
        return aculumador;
    }
}