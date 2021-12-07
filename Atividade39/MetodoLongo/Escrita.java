package MetodoLongo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class Escrita {
    public static void main(String[] args) {
        try {
           // InputStream fis = new FileInputStream("P2/dados/teclado.txt");
            InputStream fis = System.in;
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);

            OutputStream fos = System.out;
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            
            String linha = br.readLine();
            while(linha != null && !linha.equals("q")){
                linha = br.readLine();
                bw.write(linha+"\n");                
                //bw.flush(); // salva imediatamente
            }
            br.close();
            bw.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("Nao foi possivel encontrar o arquivo");
        } catch (IOException e) {
            System.out.println("Nao foi possivel escrever no arquivo");
        }
    }


    //     try {
    //         OutputStream fos= System.out;
    //         Writer osw=new OutputStreamWriter(fos);
    //         BufferedWriter bw=new BufferedWriter(osw);

    //         String linha = bw.readLine();
            
    //         br.close();
    //     } catch (FileNotFoundException e) {
    //         System.out.println("Arquivo não encontrado");
    //     }catch(IOException e){
    //         System.out.println("Não foi possivel escrever o arquivo");
    //     }
    // }
}
