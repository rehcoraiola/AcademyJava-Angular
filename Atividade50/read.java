import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Utils.ConnectionFactory;

public class read {
    public static void main(String[] args) { 
        try (Connection conn= new ConnectionFactory().getConnection();){
          
           try (PreparedStatement prepstatement=conn.prepareStatement("SELECT * FROM CATEGORIA", Statement.RETURN_GENERATED_KEYS)){
                prepstatement.execute();

                ResultSet result=prepstatement.getResultSet();
                while (result.next()) {
                    int id=result.getInt("id");
                    String nome=result.getString("nome");
                    String descricao=result.getString("descricao");
               
                    System.out.printf("%d - %s - %s  \n",id,nome,descricao);
                }
           } catch (Exception e) {
                System.out.println("Erro no select");
                e.printStackTrace();
           }
        } catch (SQLException e) {
            System.out.println("Erro de conexão");
            e.printStackTrace();
        }
    }
    
}