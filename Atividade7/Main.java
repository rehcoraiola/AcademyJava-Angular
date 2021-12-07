package Atividade7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int opcao;
        do{
        cabecalho();
        escolhaMenu();
        opcao = leitura("Escolha uma opção: \n");
        }while(!valida_opcao(opcao));
        menu(opcao);
    }

    static void cabecalho() {
        System.out.println("Bem-vindos a Calculadora \n");
    }

    static void escolhaMenu() {
        System.out.println("1 - Somar ");
        System.out.println("2 - Subtrair ");
        System.out.println("3 - Multiplicar ");
        System.out.println("4 - Dividir");
    }

    static int leitura(String mensagem) {
        System.out.println(mensagem);
        Scanner sc = new Scanner(System.in);
        int numero = Integer.parseInt(sc.nextLine());
        return numero;
    }

    static void menu(int opcao){
        double resultado;
        int n1, n2;

        switch (opcao){

            case 1:
                n1 = leitura("Digite o primeiro valor: ");
                n2 = leitura("Digite o segundo valor: ");
                resultado = somar(n1, n2);
                System.out.printf("O resultado é: %.2f", resultado);
            break;

            case 2:
                n1 = leitura("Digite o primeiro valor: ");
                n2 = leitura("Digite o segundo valor: ");
                resultado = subtrair(n1, n2);
                System.out.printf("O resultado é: %.2f", resultado);
            break;

            case 3:
                n1 = leitura("Digite o primeiro valor: ");
                n2 = leitura("Digite o segundo valor: ");
                resultado = multiplicar(n1, n2);
                System.out.printf("O resultado é: %.2f", resultado);
            break;

            case 4:
                n1 = leitura("Digite o primeiro valor: ");
                n2 = leitura("Digite o segundo valor: ");
                resultado = dividir(n1, n2);
                System.out.printf("O resultado é: %.2f", resultado);
            break;
        }
    
    }

    static double somar(double n1, double n2) {
        double resultado_soma = n1 + n2;
        return resultado_soma;
    }

    static double subtrair(double n1, double n2) {
        double resultado_subt = n1 - n2;
        return resultado_subt;
    }

    static double multiplicar(double n1, double n2) {
        double resultado_mult = n1 * n2;
        return resultado_mult;
    }

    static double dividir(double n1, double n2) {
        double resultado_div = n1 / n2;
        return resultado_div;
    }

    static boolean valida_opcao(int opcao) {
        if (opcao > 4 || opcao < 1) {
            System.out.println("Opção inválida. Selecione uma opção valida: ");
            return false;
        } else {
            return true;
        }

    }
}