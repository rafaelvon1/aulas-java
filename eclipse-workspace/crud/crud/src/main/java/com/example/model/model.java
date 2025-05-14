package com.example.model;
import com.example.connect.ConexaoBanco;
public class model {
    public static void main(String[] args) {
        ConexaoBanco con = new ConexaoBanco();
        con.conectar();
    }
    public void inserir(String nome, String email, String senha){
        
    }
}
