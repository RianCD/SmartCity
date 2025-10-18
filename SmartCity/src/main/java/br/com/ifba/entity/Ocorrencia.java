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
        this.status = status;
    }

    public String exibirResumo(){
        return "A ocorrência " + getTitulo() +
                " ocorreu às " + getDataOcorrencia() +
                " na rua " + endereco.getRua()  +
                ", nº " + endereco.getNumero() +
                " Status: " + getClass();
    }

    public void atualizarStatus(Status status){
        setStatus(status);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDateTime getDataOcorrencia() {
        return dataOcorrencia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Morador getMorador() {
        return morador;
    }

    public Status getStatus() {
        return status;
    }

    public Long getId() {
        return id;
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