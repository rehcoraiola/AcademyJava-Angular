import java.util.Scanner;

//package atividade10;
public class ex1 {

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    byte b=Byte.parseByte(sc.nextLine());

    if(b>25){
        System.out.println("Idade maior que 25");
    }else if(b<25){
        System.out.println("Idade menor do que 25");
    }else{
        System.out.println("Idade é 25 anos");
    }
}
}