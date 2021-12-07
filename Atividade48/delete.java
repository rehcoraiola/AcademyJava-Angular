import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/postgres";
        String user="postgres";
        String password="123456";
        try {
            int id=1;

            Connection conn= DriverManager.getConnection(url, user, password);

            PreparedStatement prepStatement=conn.prepareStatement("DELETE FROM CATEGORIA WHERE ID=?",Statement.RETURN_GENERATED_KEYS);
            prepStatement.setInt(1,id); //posição do ? ,  var
            prepStatement.execute();

            int linhasAfetadas=prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}