package br.newtonpaiva.lp.domain;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;

    List<String> listNome = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getListNome() {
        return listNome;
    }

    public void setListNome(List<String> listNome) {
        this.listNome = listNome;
    }
}
