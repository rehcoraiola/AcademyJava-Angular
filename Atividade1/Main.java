package Atividade1;
import java.util.Scanner;
public class Main{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("=============== Produtos Melhor Desempenho =================\n");
        System.out.println("=============== Cadatro de Produtos =================\n");
        System.out.println("\tBem-Vindo,Digite os dados do seu produto.");

        System.out.printf("\tDigite o nome do produto: ");
        String produto = sc.next();

        System.out.print("\tDigite a descrição de produto: ");
        String descricao = sc.next();

        System.out.print("\tDigite o valor do produto: R$");
        String valor = sc.next();

        System.out.print("\tDigite a categoria do produto:");
        String categoria = sc.next();

        System.out.printf("\tO produto %s de foi cadastrado com sucesso!\n",produto);
    }
}
