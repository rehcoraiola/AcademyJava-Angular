package Atividade6;

import java.util.Scanner;

public class a6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "", sobrenome = "";
        int contador = 0;

        System.out.println("Informe o seu nome: ");
        nome = sc.nextLine();

        System.out.println("Informe o seu sobrenome: ");
        sobrenome = sc.nextLine();

        System.out.println("========== While ==========");
        while(contador < 10){
            System.out.printf(" %s %s \n", nome, sobrenome);
            contador++;
        }
        System.out.println("=========== For ===========");

        for (int i = 0; i < 10; i++) {
            System.out.printf(" %s %s \n", nome, sobrenome);

        }
    }
}