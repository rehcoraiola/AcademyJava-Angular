import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Escrita {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("dados/arquivo.txt");
            OutputStreamWriter osw=new OutputStreamWriter(fos);
            BufferedWriter bw=new BufferedWriter(osw);

            bw.write("\nOi");
            bw.write("\nvocê vem sempre aqui?");
            bw.close();


        } catch (FileNotFoundException e) {
            System.out.println("Não foi possivel criar arquivo");
        } catch (IOException e) {
           System.out.println("Não foi possivel escrever no arquivo");
        }
    }
}
