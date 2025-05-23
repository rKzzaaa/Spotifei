package spotifei.dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
/**
 */


 /*
 * @author unifralonso
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:postgresql://localhost:5432/Spotifei"; 
    private static final String USUARIO = "rafa"; 
    private static final String SENHA = "5Brda23f@aaa"; 

     public static Connection getConnection() {
        Connection conn = null;
        try {
            // Registrar o driver (opcional com JDBC moderno)
            Class.forName("org.postgresql.Driver");
            // Tentar conectar
            conn = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
        } catch (ClassNotFoundException e) {
            System.err.println("Erro: Driver JDBC do PostgreSQL não encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Erro de conexão: " + e.getMessage());
        }
        return conn;
    }
}
