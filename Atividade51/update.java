import java.sql.Connection;

import Utils.CategoriaDao;
import Utils.ConnectionFactory;
import model.Categoria;

public class update {
    public static void main(String[] args) {
        try(Connection conn=new ConnectionFactory().getConnection()) {
            CategoriaDao dao=new CategoriaDao(conn);

            Categoria cat1=new Categoria(1,"Re");
            System.out.println(dao.update(cat1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
