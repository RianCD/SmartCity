package br.com.ifba.entity;

public class Endereco {
    private Long id;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String cep;

    public Endereco(Long id, String rua, int numero, String bairro, String cidade, String cep) {
        this.id = id;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
    }
}