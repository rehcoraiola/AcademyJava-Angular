import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class read {
    public static void main(String[] args) {
        String url="jdbc:postgresql://localhost:5432/postgres";
        String user="postgres";
        String password="123456";
        try {
            Connection conn= DriverManager.getConnection(url, user, password);
          
            PreparedStatement prepstatement=conn.prepareStatement("SELECT * FROM CATEGORIA", Statement.RETURN_GENERATED_KEYS);
            prepstatement.execute();

            ResultSet result=prepstatement.getResultSet();
            while (result.next()) {
                int id=result.getInt("id");
                String nome=result.getString("nome");
                String descricao=result.getString("descricao");
               
                System.out.printf("%d - %s - %s  \n",id,nome,descricao);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}