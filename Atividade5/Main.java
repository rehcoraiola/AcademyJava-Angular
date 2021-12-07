package Atividade5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("-------------------");
        System.out.println("1 - Números Pares: ");
        System.out.println("2 - Números Impares: ");
        System.out.println("3 - Números Primos: ");
        System.out.println("4 - Números Calculo de Juros compostos: ");
        System.out.println("5 - Sair: ");
        System.out.println("Digite a opção que deseja: ");
        int op=sc.nextInt();
        switch (op){
            case 1:
                System.out.println("Digite o valor: ");
                int num=sc.nextInt();
                for (int i = 0; i <=num ; i++) {
                    if(i%2==0){
                        System.out.println(i);
                    }
                }
                break;
            case 2:
                System.out.println("Digite um valor: \n");
                int numImpar = sc.nextInt();
                for (int i = 0; i <=numImpar; i++) {
                    if (i % 2 != 0){
                        System.out.println(i);
                    }
                }
                break;
            case 3:
                System.out.println("Digite um valor: ");
                int i;
                int valor = sc.nextInt();
                for (int j = 1; j < valor; j++) {
                    boolean primo = true;
                    for ( i = 2; i < j ; i++) {
                        if (j % i == 0){
                            primo = false;
                        }
                    }
                    if (primo){
                        System.out.println(j);
                    }
                }

                break;
            case 4:
                int mes;
                double vlInvest,juros;
                do {
                    System.out.print("Digite o valor do investimento: ");
                    vlInvest = sc.nextDouble();
                }while (vlInvest<0);
                do{
                    System.out.print("Digite quantos meses: ");
                    mes=sc.nextInt();
                }while (mes<0);
                do {
                    System.out.print("Digite taxa de juros: ");
                    juros = sc.nextDouble();
                }while (juros<0);

                for (int iy = 0; iy < mes; iy++) {
                    vlInvest+=vlInvest*juros/100;
                    System.out.printf("O %dº mês o retorno: %.2f \n",iy+1,vlInvest);
                }
                System.out.printf("Valor Total de retorno: %.2f",vlInvest);

                break;
            case 5:
                System.out.println("Programa Finalizado.");
                break;
            default:

        }
    }
}