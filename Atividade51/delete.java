import java.sql.Connection;
import java.sql.SQLException;

import Utils.CategoriaDao;
import Utils.ConnectionFactory;

public class delete {
    public static void main(String[] args) {
        try (Connection conn=new ConnectionFactory().getConnection()) {
            CategoriaDao dao=new CategoriaDao(conn);

            dao.delete(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}