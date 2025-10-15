package br.com.ifba.controller;

import br.com.ifba.entity.Ocorrencia;

import java.util.ArrayList;
import java.util.List;
/*
 * Classe responsável por armazenar e buscar ocorrencias
 * */
public class OcorrenciaController {
    private List<Ocorrencia> ocorrencias = new ArrayList<>();

    public void addOcorrencia(Ocorrencia ocorrencia){
        ocorrencias.add(ocorrencia);
    }

    public Ocorrencia buscarOcorrenciaById(Long id){
        for (Ocorrencia ocorrencia : ocorrencias){
            if (ocorrencia.getId().equals(id)){
                return ocorrencia;
            }
        }
        return null;
    }

    public void listarOcorrencias(){
        for (Ocorrencia o : ocorrencias)
            System.out.println(o);
    }

    public void deleteOcorrencia(Long id){
        ocorrencias.remove(buscarOcorrenciaById(id));
    }
}