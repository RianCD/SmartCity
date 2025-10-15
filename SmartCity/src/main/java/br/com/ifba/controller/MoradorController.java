package br.com.ifba.controller;

import br.com.ifba.entity.Morador;

import java.util.ArrayList;
import java.util.List;

public class MoradorController {
    /*
    * Classe responsável por armazenar e buscar moradores
    * */
    private List<Morador> moradores = new ArrayList<>();

    public void cadastrarMorador(Morador morador){
        moradores.add(morador);
    }

    public Morador buscarMoradorByEmail(String email){
        for (Morador m : moradores){
            if (m.getEmail().equalsIgnoreCase(email)){
                return m;
            }
        }
        return null;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }
}