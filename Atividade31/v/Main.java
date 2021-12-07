package v;

import java.util.Scanner;

import c.CategoriaControler;
import c.ProdutoControler;
import m.Categoria;
import m.Produto;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CategoriaControler CC=new CategoriaControler();
        ProdutoControler PC=new ProdutoControler();
        Produto p=new Produto();
        Categoria c=new Categoria();

        do {
            imprimeMenu();
        } while (condition);
        


        c.id=lerNum(sc);
        c.nome=lerString(sc, "Nome do Produto");
        c.tipo=lerString(sc, "Tipo de Produto");
    
        CC.imprime(CC.read());
    }
    public static void imprimeMenu(){
        System.out.println("1. Create: ");
        System.out.println("\t2. Read: ");
        System.out.println("\t3. Update: ");
        System.out.println("\t4. Delete: ");
        System.out.println("Digite a opção escolhida: ");
    }
    public static void validaOpcao(){

    }
    public static void Menu(int op){
        switch (op) {
            case 1:
                
            break;
            case 2:
                
            break;
            case 3:
                
            break;
            case 4:
                
            break;
        }
    }
    public static int lerNum(Scanner sc){
        int id=0;
        boolean valido;
        do{
            try {
                id=Integer.parseInt(sc.nextLine());
                valido=true;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage()+" Digite um numero inteiro");
                valido=false;
            }  
        }while(!valido);
        return id;
    }
    public static String lerString(Scanner sc, String msg){
        System.out.println("Digite "+ msg.toLowerCase());
        return sc.nextLine().toUpperCase(); 
    }
}
