package com.example.model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.mindrot.jbcrypt.BCrypt;

import com.example.connect.ConexaoBanco;
public class model {
    public static void main(String[] args) {
        ConexaoBanco con = new ConexaoBanco();
        con.conectar();
    }
    public void inserir(String nome, String email, String senha){
        // Query SQL para inserção
        String sql = "INSERT INTO usuarios (nome, email,senha) VALUES (?, ?, ?)";
        PreparedStatement ps = null;
        String hashSenha = BCrypt.hashpw(senha, BCrypt.gensalt());
        try {
            ps = ConexaoBanco.conectar().prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2,email);
            ps.setString(3,hashSenha);
            ps.execute();
        } catch (Exception e) {
            System.out.println("cagou no model em inserir" + e);
        }
      
    }
}
    

