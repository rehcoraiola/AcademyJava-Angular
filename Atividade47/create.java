import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class create {
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/postgres";
        String user="postgres";
        String password="123456";
        try {
            Connection conn= DriverManager.getConnection(url, user, password);
            Statement statement=conn.createStatement();
            statement.execute("INSERT INTO CATEGORIA(nome,descricao)VALUES('SBA' ,'GGU')",Statement.RETURN_GENERATED_KEYS);
            ResultSet idsAtualizados = statement.getGeneratedKeys();        //essa função gera uma lista

            while (idsAtualizados.next()) {
                int id=idsAtualizados.getInt(1);
                System.out.println(id);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}

