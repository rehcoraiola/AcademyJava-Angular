package Atividade4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nome="",sobrenome="",rg="",cpf="";

        System.out.println("---------------------Cadastro---------------------");
        System.out.println("1 : Cadastrar cliente ");
        System.out.println("2: Listar cliente ");
        System.out.println("0: Sair ");
        short num= sc.nextShort();
        sc.nextLine();

        switch (num){
            case 1:
                do {
                    System.out.printf("Digite o nome: ");
                    nome= sc.nextLine();
                    System.out.printf("Digite o sobrenome: ");
                    sobrenome= sc.nextLine();
                }while (nome.length()<3 || sobrenome.length()<3);
                do {
                    System.out.printf("Digite o RG: ");
                    rg= sc.nextLine();
                }while (rg.length()<4);
                do {
                    System.out.printf("Digite o CPF");
                    cpf= sc.nextLine();
                }while (cpf.length()<11);
                break;
            case 2:
                System.out.printf(" Cadastro realizado com sucesso: \n Nome: %s %s \n RG: %d \n CPF: %d ",nome,sobrenome,rg,cpf);
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
