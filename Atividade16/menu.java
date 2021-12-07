import java.util.Scanner;

public class menu {
    private int op;
    public static void opMenu(int op){
        switch (op) {
            case 1:
                
            break;
            case 2:
                
            break;
        }
    }
    public static int lerOp(){
        Scanner sc=new Scanner(System.in);
        return Integer.parseInt(sc.nextLine());
    }
    public static void imprimeMenu(int op){
        switch (op) {
            case 1:
                System.out.println("Saldo");
                break;
                case 2:
                System.out.println("Sacar");
                break;
        }
        System.out.println("Digite a opção que deseja: ");
    }
}
