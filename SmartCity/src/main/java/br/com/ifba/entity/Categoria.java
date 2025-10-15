package br.com.ifba.entity;

public class Categoria {
    private Long id;
    private String nome;
    private String descricao;

    public Categoria(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Categoria(String nome) {
        this.nome = nome;
    }
}