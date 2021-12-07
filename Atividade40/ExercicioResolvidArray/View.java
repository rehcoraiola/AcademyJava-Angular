package ExercicioResolvidArray;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
    private static String FileName="ExercicioResolvido/Empresas.cvc";
    public static void main(String[] args) {
        Empresa e=new Empresa();
        e.nome="Renata";
        e.cnpj="5278001/58";
        e.ramoAtividade="523742";
        //DAO
        String empresa=String.format("%s;%s;%s\n", e.nome,e.cnpj,e.ramoAtividade);
        
        //escrita
        try {
            FileWriter fw=new FileWriter(FileName,true);
            fw.write(empresa);
            fw.close();
        } catch (IOException ee) {
            System.out.println("O arquivo não pode ser aberto");
        }

        //leitura
        ArrayList<String> linhas=new ArrayList<String>();
        try {
            Scanner sc=new Scanner(new File(FileName));
            while (sc.hasNextLine()) {
                //Lendo uma linha
                String linha= sc.nextLine();
                //Quebrando as linhas
               linhas.add(linha);
        
            }
        } catch (FileNotFoundException ee) {
            System.out.println("O arquivo não pode ser aberto");
        }

        //DAO
        ArrayList<Empresa> empresas=new ArrayList<Empresa>();
        for (String l : linhas) {
            String[] dadosEmpresa= l.split(";");

            //DAO - transformar um dado para diferentes tipos
            Empresa emp=new Empresa();
            e.nome=dadosEmpresa[0];
            e.cnpj=dadosEmpresa[1];
            e.ramoAtividade=dadosEmpresa[2];
            empresas.add(e);
            
        }
        for (Empresa empresa2 : empresas) {
            System.out.printf("%s;%s;%s", empresa2.nome,empresa2.cnpj,empresa2.ramoAtividade);
        }


    }
}
