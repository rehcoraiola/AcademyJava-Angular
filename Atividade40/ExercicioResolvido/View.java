package ExercicioResolvido;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Empresa e=new Empresa();
        e.nome="Renata";
        e.cnpj="5278001/58";
        e.ramoAtividade="523742";
        //DAO
        String empresa=String.format("%s;%s;%s\n", e.nome,e.cnpj,e.ramoAtividade);
        
        //escrita
        try {
            FileWriter fw=new FileWriter("ExercicioResolvido/Empresas.cvc",true);
            fw.write(empresa);
            fw.close();
        } catch (IOException ee) {
            System.out.println("O arquivo não pode ser aberto");
        }

        //leitura
        try {
            Scanner sc=new Scanner(new File("ExercicioResolvido/Empresas.cvc"));
            while (sc.hasNextLine()) {
                //Lendo uma linha
                String linha= sc.nextLine();
                //Quebrando as linhas
                String[] dadosEmpresa= linha.split(";");

                //DAO - transformar um dado para diferentes tipos
                Empresa emp=new Empresa();
                e.nome=dadosEmpresa[0];
                e.cnpj=dadosEmpresa[1];
                e.ramoAtividade=dadosEmpresa[2];
                System.out.printf("%s  %s  %s\n", e.nome,e.cnpj,e.ramoAtividade);
        
            }
        } catch (FileNotFoundException ee) {
            System.out.println("O arquivo não pode ser aberto");
        }

    }
}
