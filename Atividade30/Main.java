import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculadora c=new Calculadora();

        imprimeMenu();
        int op=lerTerminalMenu(sc,"opção: ",1,4);
        switch (op) {
            case 1:
                System.out.println(c.soma(lerTerminal(sc,"Num: "), lerTerminal(sc,"Num: ")));
            break;
            case 2:
                System.out.println(c.sub(lerTerminal(sc,"Num: "), lerTerminal(sc,"Num: ")));
            break;
            case 3:
                System.out.println(c.mult(lerTerminal(sc,"Num: "), lerTerminal(sc,"Num: ")));
            break;
            case 4:
            int num= lerTerminal(sc, "Num: "); 
            int num2=0;
            boolean valido;
                do {
                    valido=true;
                    try {
                        num2= lerTerminal(sc, "Num");
                        verificaZero(num2);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage()+" Digite novamente: ");
                        valido=false;
                 }
                } while (!valido);
                System.out.println(c.div(num,num2));
            break;
        }
    }

  
    public static void imprimeMenu(){
        System.out.println("1. Soma: ");
        System.out.println("2. Subtração: ");
        System.out.println("3. Multiplicação: ");
        System.out.println("4. Divisão: ");
    }
    public static int lerTerminalMenu(Scanner sc, String msg,int min,int max){
        int aux;
        do{
            try {
                System.out.println("Digite "+msg);
                aux= Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage()+" Erro na opção, Digite novamente: ");
               aux=-1;
            }
        }while(aux<min || aux>max || aux==-1);
        return aux;
    }
    public static int lerTerminal(Scanner sc, String msg){
        boolean aux;
        int num=0;
        do{
            aux=false;
            try {
                System.out.println("Digite "+msg);
                num= Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage()+" Digite um numero: ");
               aux=true;
            }
        }while(aux);
        return num;  
    }
    public static void verificaZero(int num){
        if(num==0){
            throw new IllegalArgumentException("Número não pode ser zero");
        }
    }
}
