package Utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Categoria;

public class CategoriaDao {
    private Connection conn;

    public CategoriaDao(Connection conn){
        this.conn=conn;
    }

    public void create(Categoria model) throws SQLException{
        PreparedStatement prepStatement=conn.prepareStatement("INSERT INTO CATEGORIA(nome)VALUES('?')", Statement.RETURN_GENERATED_KEYS);
        prepStatement.setString(1,model.getNome()); //posição(começa em 1) ,  var
        prepStatement.execute();
        ResultSet idsAtualizados = prepStatement.getGeneratedKeys();      //essa função gera uma lista
        
        while (idsAtualizados.next()) {
            int id=idsAtualizados.getInt(1);
            System.out.println(id);
        } 
                
    }
    public ArrayList<Categoria> list(){
        ArrayList<Categoria> list=new ArrayList<Categoria>();

        try (PreparedStatement prepstatement=conn.prepareStatement("SELECT * FROM CATEGORIA", Statement.RETURN_GENERATED_KEYS)){
            prepstatement.execute();

            ResultSet result=prepstatement.getResultSet();
            while (result.next()) {
                Categoria cat=new Categoria(result.getInt("id"),result.getString("nome"));
                list.add(cat);
            }
       } catch (Exception e) {
            System.out.println("Erro no select");
            e.printStackTrace();
       }
        return list;
    }
    public int update(Categoria model){
        int linhasAfetadas=0;
        try ( PreparedStatement prepStatement=conn.prepareStatement("UPDATE categoria SET nome='?' WHERE id=?", Statement.RETURN_GENERATED_KEYS)){
            prepStatement.setString(1,model.getNome()); //posição do ?(começa em 1) ,  var
            prepStatement.setInt(2,model.getId()); //posição do ? ,  var
            prepStatement.execute();

            linhasAfetadas=prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
        } catch (Exception e) {
            System.out.println("Erro no update");
            e.printStackTrace();
        }
        return linhasAfetadas;
    }
    public int delete(int id){
        int linhasAfetadas=0;
        try (PreparedStatement prepStatement=conn.prepareStatement("DELETE FROM CATEGORIA WHERE ID=?", Statement.RETURN_GENERATED_KEYS)){
            prepStatement.setInt(1,id); //posição do ? ,  var
            prepStatement.execute();

            linhasAfetadas=prepStatement.getUpdateCount();
        } catch (Exception e) {
            System.out.println("Erro de delete");
            e.printStackTrace();
        }
        return linhasAfetadas;
    }
}
