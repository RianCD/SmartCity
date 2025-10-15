package br.com.ifba.entity;

public class Usuario {
    private final Long id = (long) (Math.random() * 101);
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

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}