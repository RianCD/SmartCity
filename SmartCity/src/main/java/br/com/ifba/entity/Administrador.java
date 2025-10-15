package br.com.ifba.entity;

import br.com.ifba.controller.AdministradorController;
import br.com.ifba.controller.OcorrenciaController;

public class Administrador extends Usuario{
    OcorrenciaController ocorrenciaController;
    AdministradorController administradorController;

    public Administrador(String nome, String telefone, String email, String senha,OcorrenciaController ocorrenciaController) {
        super(nome, telefone, email, senha);
        this.ocorrenciaController = ocorrenciaController;
    }

    public void visualizarOcorrencia(Long id){
        Ocorrencia ocorrencia = ocorrenciaController.buscarOcorrenciaById(id);
        System.out.println(ocorrencia);
    }

    public void atualizarStatusOcorrencia(Status status, Long id){
        ocorrenciaController.buscarOcorrenciaById(id).setStatus(status);
    }
}