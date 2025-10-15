package br.com.ifba.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Morador extends Usuario{
    private List<Ocorrencia> ocorrencias = new ArrayList<>();
    public Morador(String nome, String telefone, String email, String senha) {
        super(nome, telefone, email, senha);
    }

    public Ocorrencia gerarOcorrencia(String titulo , String descricao, LocalDateTime dataOcorrencia, Categoria categoria, Endereco endereco){
        return new Ocorrencia(titulo, descricao, dataOcorrencia, categoria, endereco, Status.ABERTA);
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

//    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
//        this.ocorrencias = ocorrencias;
//    }

    //adicionar metodo validar morador
}