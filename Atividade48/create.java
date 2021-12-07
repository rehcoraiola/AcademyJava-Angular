import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class create {
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/postgres";
        String user="postgres";
        String password="123456";
        try {
        String nome="Eletro');delete from categoria; insert into categoria(nome)values('Apagado"; 

            Connection conn= DriverManager.getConnection(url, user, password);
            PreparedStatement prepStatement=conn.prepareStatement("INSERT INTO CATEGORIA(nome)VALUES('?')" ,Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1,nome); //posição(começa em 1) ,  var

            prepStatement.execute();
            ResultSet idsAtualizados = prepStatement.getGeneratedKeys();      //essa função gera uma lista

            while (idsAtualizados.next()) {
                int id=idsAtualizados.getInt(1);
                System.out.println(id);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}

