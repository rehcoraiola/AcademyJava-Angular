import java.util.Scanner;

public class At11_1 {
    public static void main(String[] args) {
        int op;
        cabeçalho();
        do{
            menuPrint();
            op=leitura();
        }while(op<1 || op>4);  
        System.out.println("Módulo Bradesco");
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
