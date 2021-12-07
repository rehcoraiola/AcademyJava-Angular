import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Utils.ConnectionFactory;

public class delete {
    public static void main(String[] args) {
        try (Connection conn= new ConnectionFactory().getConnection();){
            int id=1;

            try (PreparedStatement prepStatement=conn.prepareStatement("DELETE FROM CATEGORIA WHERE ID=?", Statement.RETURN_GENERATED_KEYS)){
                prepStatement.setInt(1,id); //posição do ? ,  var
                prepStatement.execute();

                int linhasAfetadas=prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);
            } catch (Exception e) {
                System.out.println("Erro de delete");
                e.printStackTrace();
            }
        } catch (SQLException e) {
            System.out.println("Erro de conexão");
            e.printStackTrace();
        }
    }
    
}