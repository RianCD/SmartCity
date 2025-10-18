package br.com.ifba.entity;

import br.com.ifba.controller.OcorrenciaController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Morador extends Usuario{
    private final List<Ocorrencia> ocorrencias = new ArrayList<>();
    private OcorrenciaController ocorrenciaController;

    public Morador(String nome, String telefone, String email, String senha) {
        super(nome, telefone, email, senha);
    }

    public Ocorrencia gerarOcorrencia(String titulo , String descricao, LocalDateTime dataOcorrencia, Categoria categoria, Endereco endereco){
        return new Ocorrencia(titulo, descricao, dataOcorrencia, categoria, endereco, Status.ABERTA);
    }

    public void addOcorrencia(Ocorrencia ocorrencia) {
        ocorrencias.add(ocorrencia);
    }

    public void listOcorrencias (){
        for (Ocorrencia ocorrencia : ocorrencias){
            System.out.println(ocorrencia);
        }
    }

    public void deletarOcorrencia(Long id){
        ocorrenciaController.deleteOcorrencia(id);
    }
}