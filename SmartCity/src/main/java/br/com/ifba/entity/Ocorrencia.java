package br.com.ifba.entity;

import java.time.LocalDateTime;

public class Ocorrencia {
    private final Long id = (long) (Math.random() * 101);
    private String titulo;
    private String descricao;
    private LocalDateTime dataOcorrencia;
    private Categoria categoria;
    private Endereco endereco;
    private Morador morador;
    private Status status;

    public Ocorrencia(String titulo ,String descricao, LocalDateTime dataOcorrencia, Categoria categoria, Endereco endereco, Status status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataOcorrencia = dataOcorrencia;
        this.categoria = categoria;
        this.endereco = endereco;
//        this.morador = morador;
        this.status = status;
    }

//    public void atualizarStatus(Status status){
//    Utilizar quando implementar exceptions que irão precisar de regras de negócio
//        setStatus(status);
//    }

    public Long getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Ocorrencia{" +
                "id= " + id +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataOcorrencia=" + dataOcorrencia +
                ", categoria=" + categoria +
                ", endereco=" + endereco +
                ", status=" + status +
                '}';
    }
}