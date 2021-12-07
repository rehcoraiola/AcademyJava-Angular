package Atividade3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("---------------------Cadastro---------------------");
        System.out.println("1 : Cadastro de Filme ");
        System.out.println("2: cadastro de Serie ");
        System.out.println("3: Cadastro de Documentario ");
        System.out.println("0: Sair ");
        short num= sc.nextShort();
        sc.nextLine();

        switch (num){
            case 1:
                System.out.printf("Digite o nome do filme: ");
                String nome= sc.nextLine();
                System.out.printf("Digite o descrição do filme: ");
                String desc= sc.nextLine();
                System.out.printf("Digite o genero do filme: ");
                String genero= sc.nextLine();
                System.out.printf("Digite ano de lançamento");
                int ano= sc.nextInt();
                System.out.printf(" Cadastro de filme: \n Nome: %s \n Descrição: %s \n Genero: %s \n Ano Lançamento: %d",nome,desc,genero,ano);
                break;
            case 2:
                System.out.printf("Digite o nome do Serie: ");
                String nomeS= sc.nextLine();
                System.out.printf("Digite o descrição da serie: ");
                String descS= sc.nextLine();
                System.out.printf("Digite ano de lançamento");
                int anoS= sc.nextInt();
                System.out.printf(" Cadastro de serie: \n Nome: %s \n Ano Lançamento: %d \n Descrição: %s" ,nomeS,anoS,descS);
                break;
            case 3:
                System.out.printf("Digite o nome do Documentario: ");
                String nomeD= sc.nextLine();
                System.out.printf("Digite o tema da Documentario: ");
                String temaD= sc.nextLine();
                System.out.printf("Digite ano de lançamento");
                int anoD= sc.nextInt();
                System.out.printf(" Cadastro do Documenario:\n Nome: %s \n Ano Lançamento: %d \n Tema: %s" ,nomeD,anoD,temaD);
                break;
            case 0:
                System.out.printf("Sair");
                break;
            default:
                System.out.printf("Valor não encontrado");
                break;
        }
    }
}