import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean cont;
        do{
            cont=false;
            System.out.print("Digite o valor do salario: ");
            double salario=Double.parseDouble(sc.nextLine());

            if(salario>5399.99){
                System.out.println("Salario maior que R$5399,99 ");
            }else if(salario>1997.58){
                System.out.println("Salario maior que R$1997,58 ");
            }else if(salario>0){
                System.out.println("Salario maior que zero e menor que R$1997,58");
            }else if(salario<=0){
                System.out.println("Valor menor ou igual a zero \n Digite novamente. ");
                cont=true;
            }
        }while(cont);
    }
}

