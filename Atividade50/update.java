import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import Utils.ConnectionFactory;

public class update {
    public static void main(String[] args) {
        try (Connection conn= new ConnectionFactory().getConnection();){
            String nome="Re";
            int id=1;
            
            try ( PreparedStatement prepStatement=conn.prepareStatement("UPDATE categoria SET nome='?' WHERE id=?", Statement.RETURN_GENERATED_KEYS)){
                prepStatement.setString(1,nome); //posição do ?(começa em 1) ,  var
                prepStatement.setInt(2,id); //posição do ? ,  var
                prepStatement.execute();

                int linhasAfetadas=prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);
            } catch (Exception e) {
                System.out.println("Erro no update");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            System.out.println("Erro de conexão");
            e.printStackTrace();
        }
    }
    
}
