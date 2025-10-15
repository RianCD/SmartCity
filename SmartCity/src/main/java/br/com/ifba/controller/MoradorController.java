package br.com.ifba.controller;

import br.com.ifba.entity.Morador;

import java.util.ArrayList;
import java.util.List;
/*
 * Classe responsável por armazenar e buscar moradores
 * */
public class MoradorController {
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

    public Morador buscarMoradorById(Long id){
        for (Morador m : moradores){
            if (m.getId().equals(id))
                return m;
        }
        return null;
    }

    public void listarMoradores() {
        for (Morador m : moradores)
            System.out.println(m);
    }

    public void deleteMorador(Long id){
        moradores.remove(buscarMoradorById(id));
    }
}