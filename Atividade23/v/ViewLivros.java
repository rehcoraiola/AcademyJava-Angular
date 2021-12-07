package v;

import java.util.Scanner;

import c.ControlerLivros;
import m.Base;
import m.Livro;

public class ViewLivros {
    public static void main(String[] args) {
        ControlerLivros cl=new ControlerLivros();
        Livro l=new Livro();
        Scanner sc=new Scanner(System.in);

        int op;
        do{
            System.out.print("Digite a opção: ");
            op= Integer.parseInt(sc.nextLine());
            switch (op) {
                case 1:
                System.out.println("____Cadastrar____");
                    l.setNome(lerString("nome"));
                    l.setAutor(lerString("autor"));
                    cl.create(l);
                break;

                case 2:
                System.out.println("Listar");
                    for (Livro livro : cl.read()) {
                        System.out.println(livro);
                    }
                break;

                case 3:
                System.out.println("____Atualizar____");
                String id=lerString("ID: ");
                
                Base b=new Livro();
                Livro lll=new Livro();
                lll=b;

                ///////////////////
                l.setNome(lerString("nome"));
                l.setAutor(lerString("autor"));
                cl.update(l);
                break;

                case 4:
                System.out.println("____Deletar____");
                cl.delete(l);
                break;
                
                default:
                    
                break;
                
            }
            op=0;
        }while(op==0);
    }
    public static String lerString(String msg){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Digite %s",msg);
        return sc.nextLine();
    }
     
}
