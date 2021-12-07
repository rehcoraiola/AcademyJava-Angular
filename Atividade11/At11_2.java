import java.util.Scanner;

public class At11_2 {
    public static void main(String[] args) {
        cabeçalho();
        do{
            menuPrint();
            int op=leitura();
            if(op>0 && op<5){
                System.out.println("Módulo Bradesco");
                break;
            }
            System.out.println("digite um valor valido. ");
        }while(true);
    }
    static void cabeçalho(){
        System.out.println("-----Bradesco Financiamentos-----");
    }
    static void menuPrint(){
        System.out.println("-----1 - Crédito Pessoa------------");
        System.out.println("-----2 - Crédito Imobiliário-------");
        System.out.println("-----3 - Crédito Empresarial-------");
        System.out.println("-----4 - Empréstimo Consignado-----");
    }
    static int leitura(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite a opção desejada");
        return Integer.parseInt(sc.nextLine());
    }
}
