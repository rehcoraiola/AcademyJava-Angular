package Utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class ConnectionFactory {
    private DataSource dataSource;      //classe mais abstrata

    public ConnectionFactory(){
        ComboPooledDataSource pool=new ComboPooledDataSource(); //PGConnectionPoolDataSource(específico postgres)
        pool.setJdbcUrl("jdbc:postgresql://localhost:5432/postgres");   
        pool.setUser("postgres");  
        pool.setPassword("123456");  
        pool.setMaxPoolSize(50);

        this.dataSource=pool;
    }

    public Connection getConnection() throws SQLException{  //delega o try catch para cada uso
        return this.dataSource.getConnection(); 
    }
    
}

