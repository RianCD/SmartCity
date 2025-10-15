package br.com.ifba.entity;

public class Usuario {
    private Long id;
    private String nome;
    private String telefone;
    private String email;
    private String senha;

    public Usuario(String nome, String telefone, String email, String senha) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }
    //Irei implementar o meio otimizado de utilizar o ID em todas as classes


    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
}