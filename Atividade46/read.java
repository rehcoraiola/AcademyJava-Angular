import java.sql.Connection;
import java.sql.DriverManager;
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
            Statement statement=conn.createStatement();
            statement.execute("SELECT * FROM PRODUTOS",Statement.RETURN_GENERATED_KEYS);

            ResultSet result=statement.getResultSet();
            while (result.next()) {
                int id=result.getInt("id");
                String nome=result.getString("nome");
                String descricao=result.getString("descricao");
                String codigo=result.getString("codigo");
                double preco=result.getDouble("preco");

                System.out.printf("%d - %s - %s - %s - %.2f \n",id,nome,descricao,codigo,preco);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}