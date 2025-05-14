package com.example;
import com.example.controller.controllercadastro;
import com.example.view.TelaCadastro;
public class index {
    public static void main(String[] args) {
        TelaCadastro tela = new TelaCadastro();
        tela.Cadastro();
    }
    public void cadastrar(String nome,String email,String senha){
        controllercadastro controller = new controllercadastro();
        controller.InserirDados(nome, email, senha);
    }
}