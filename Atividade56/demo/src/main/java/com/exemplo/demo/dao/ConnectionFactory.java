package com.exemplo.demo.dao;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
    private DataSource dataSource;      //classe mais abstrata

    public ConnectionFactory(){
        ComboPooledDataSource pool=new ComboPooledDataSource(); //PGConnectionPoolDataSource(específico postgres)
        this.dataSource=pool;
    }

    public Connection getConnection() throws SQLException{  //delega o try catch para cada uso
        return this.dataSource.getConnection(); 
    }
}
