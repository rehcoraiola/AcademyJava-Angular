import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Utils.ConnectionFactory;

public class create {
    public static void main(String[] args) {
        try (Connection conn= new ConnectionFactory().getConnection();){
        String nome="Eletro"; 

            try (PreparedStatement prepStatement=conn.prepareStatement("INSERT INTO CATEGORIA(nome)VALUES('?')", Statement.RETURN_GENERATED_KEYS)){
                prepStatement.setString(1,nome); //posição(começa em 1) ,  var

                prepStatement.execute();
                ResultSet idsAtualizados = prepStatement.getGeneratedKeys();      //essa função gera uma lista
    
                while (idsAtualizados.next()) {
                    int id=idsAtualizados.getInt(1);
                    System.out.println(id);
                } 
            } catch (Exception e) {
                System.out.println("Erro no insert");
                e.printStackTrace();
            }

        } catch (SQLException e) {
            System.out.println("Erro de conexão");
            e.printStackTrace();
        }
    }
    
}

