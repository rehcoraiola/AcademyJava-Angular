import java.sql.Connection;
import java.sql.SQLException;

import Utils.CategoriaDao;
import Utils.ConnectionFactory;
import model.Categoria;

public class create {
    public static void main(String[] args) {
        try (Connection conn=new ConnectionFactory().getConnection()) {
            CategoriaDao dao=new CategoriaDao(conn);

            Categoria cat1=new Categoria("Teste");
            dao.create(cat1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

