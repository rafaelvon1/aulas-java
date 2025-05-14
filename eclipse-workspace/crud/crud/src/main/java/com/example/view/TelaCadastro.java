package com.example.view;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.example.index;

public class TelaCadastro extends JFrame {
    public void Cadastro() {
        
        // Configuração da janela
        setTitle("Cadastro");
        setSize(800, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.BLACK);
        setLayout(new GridBagLayout());

        // Painel central
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.DARK_GRAY);
        panel.setBorder(BorderFactory.createEmptyBorder(40, 50, 40, 50));

        // Título
        JLabel titleLabel = new JLabel("Cadastro");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Campos de entrada
        JLabel labelNome = new JLabel("Nome:");
        estilizarLabel(labelNome);
        JTextField textNome = new JTextField(20);

        JLabel labelEmail = new JLabel("Email:");
        estilizarLabel(labelEmail);
        JTextField textEmail = new JTextField(20);

        JLabel labelSenha = new JLabel("Senha:");
        estilizarLabel(labelSenha);
        JPasswordField textSenha = new JPasswordField(20);

        JLabel labelConfirmarSenha = new JLabel("Confirme a Senha:");
        estilizarLabel(labelConfirmarSenha);
        JPasswordField textConfirmarSenha = new JPasswordField(20);

        // Botões
        JButton btnCadastrar = new JButton("Cadastrar");
        estilizarBotao(btnCadastrar);

        // Ação do botão "Cadastrar"
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = textNome.getText().toLowerCase();
                String email = textEmail.getText().toLowerCase();
                String senha = new String(textSenha.getPassword());
                String Confirmarsenha = new String(textConfirmarSenha.getPassword());
                
                if (nome.isEmpty() || email.isEmpty() || senha.isEmpty() || Confirmarsenha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
                    
                }
                else{
                    index index = new index();
                    index.cadastrar(nome, email, senha);
                }
            }
        });


        // Adicionar componentes ao painel
        panel.add(titleLabel);
        panel.add(Box.createVerticalStrut(20));
        panel.add(labelNome);
        panel.add(textNome);
        panel.add(Box.createVerticalStrut(10));
        panel.add(labelEmail);
        panel.add(textEmail);
        panel.add(Box.createVerticalStrut(10));
        panel.add(labelSenha);
        panel.add(textSenha);
        panel.add(Box.createVerticalStrut(20));
        panel.add(labelConfirmarSenha);
        panel.add(textConfirmarSenha);
        panel.add(Box.createVerticalStrut(20));
        panel.add(btnCadastrar);

        // Adicionar painel à janela
        add(panel);

        setVisible(true);
    }

    // Método para estilizar labels
    private void estilizarLabel(JLabel label) {
        label.setFont(new Font("Arial", Font.BOLD, 14));
        label.setForeground(Color.WHITE);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    // Método para estilizar botões
    private void estilizarBotao(JButton botao) {
        botao.setFont(new Font("Arial", Font.BOLD, 14));
        botao.setBackground(new Color(30, 144, 255));
        botao.setForeground(Color.WHITE);
        botao.setFocusPainted(false);
        botao.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        botao.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TelaCadastro());
    }
}