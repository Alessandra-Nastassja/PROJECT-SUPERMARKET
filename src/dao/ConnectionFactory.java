package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
 
    public Connection getConexao(){
        try{
           String url = "jdbc:mysql://localhost/mercado";
           String usuario = "root";
           String senha = "";
           
           return DriverManager.getConnection(url, usuario, senha);
        }catch(Exception erro){
           throw new RuntimeException("Erro 1: " + erro);
        }
    }
}
