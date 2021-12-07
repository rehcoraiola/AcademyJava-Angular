package Atividade14;

import java.util.Scanner;

public class Main {

    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        double n1,n2;
        n1=lerDouble();
        n2=lerDouble();
        imprimirOp(soma(n1,n2));
        imprimirOp(sub(n1,n2));
        imprimirOp(mult(n1,n2));
        imprimirOp(div(n1,n2));

    }
    static double lerDouble(){
        System.out.println("Digite um número: ");
        double n=Double.parseDouble(sc.nextLine());  //double n=sc.nextDouble(); //valor?
        return n;
    }
    static double soma(double n1,double n2){
        return n1+n2;
    }
    static double sub(double n1,double n2){
        return n1-n2;
    }
    static double mult(double n1,double n2){
        return n1*n2;
    }
    static double div(double n1,double n2){
        return n1/n2;
    }
    static void imprimirOp(double n){
        System.out.printf("O resultado da operação %.2f \n",n);
    }
}