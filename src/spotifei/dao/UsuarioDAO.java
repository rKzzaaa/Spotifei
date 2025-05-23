/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spotifei.dao;

/**
 *
 * @author unifralonso
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UsuarioDAO {
    public boolean cadastrar(String nomeCompleto, String nomeUsuario, String senha) {
        String sql = "INSERT INTO usuarios (nome_completo, nome_usuario, senha) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nomeCompleto);
            stmt.setString(2, nomeUsuario);
            stmt.setString(3, senha);

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
            return false;
        }
    }
}
