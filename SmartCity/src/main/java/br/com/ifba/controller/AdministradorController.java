package br.com.ifba.controller;

import br.com.ifba.entity.Administrador;

import java.util.ArrayList;
import java.util.List;
/*
 * Classe responsável por armazenar e buscar administradores
 * */
public class AdministradorController {
    private List<Administrador> administradores = new ArrayList<>();

    public void cadastrarAdministrador(Administrador administrador){
        administradores.add(administrador);
    }

    public Administrador buscarAdministradorByEmail(String email){
        for (Administrador a : administradores){
            if (a.getEmail().equalsIgnoreCase(email)){
                return a;
            }
        }
        return null;
    }
}
