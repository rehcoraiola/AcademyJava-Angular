package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private String url="jdbc:postgresql://localhost:5432/postgres";
    private String user="postgres";
    private String password="123456";

    public ConnectionFactory(){
        url="jdbc:postgresql://localhost:5432/postgres";
        user="postgres";
        password="123456";
    }

    public Connection getConnection() throws SQLException{  //delega o try catch para cada uso
        return DriverManager.getConnection(url, user, password); 
        
        //Mode com variaveis diferentes
        //Connection conn= DriverManager.getConnection(url, user, password); 
        //return conn;
    }
    
}

