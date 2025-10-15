package br.com.ifba.entity;

import java.time.LocalDateTime;

public class Ocorrencia {
    private Long id;
    private String titulo;
    private String descricao;
    private LocalDateTime dataOcorrencia;
    private Categoria categoria;
    private Endereco endereco;
    private Morador morador;
    private Status status;

    public Ocorrencia(String titulo ,String descricao, LocalDateTime dataOcorrencia, Categoria categoria, Endereco endereco, Status status) {
//        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataOcorrencia = dataOcorrencia;
        this.categoria = categoria;
        this.endereco = endereco;
//        this.morador = morador;
        this.status = status;
    }
}