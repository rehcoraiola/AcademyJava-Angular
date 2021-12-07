import java.sql.Connection;
import Utils.CategoriaDao;
import Utils.ConnectionFactory;
import model.Categoria;

public class read {
    public static void main(String[] args) { 
        try(Connection conn=new ConnectionFactory().getConnection()){
            CategoriaDao dao=new CategoriaDao(conn);
            for (Categoria c : dao.list()) {
                System.out.println(c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}