import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class update {
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/postgres";
        String user="postgres";
        String password="123456";
        try {
            Connection conn= DriverManager.getConnection(url, user, password);
            Statement statement=conn.createStatement();
            statement.execute("UPDATE PRODUTOS SET nome='GABRIEL' WHERE id=2",Statement.RETURN_GENERATED_KEYS);
            int linhasAfetadas=statement.getUpdateCount();
            System.out.println(linhasAfetadas);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}