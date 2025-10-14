package br.com.ifba.entity;

import java.time.LocalDateTime;

public class Ocorrencia {
    private Long id;
    private String descricao;
    private LocalDateTime dataOcorrencia;
    private Categoria categoria;
    private Endereco endereco;
    private Morador morador;
    private Status status;
}
