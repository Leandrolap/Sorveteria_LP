package br.newtonpaiva.lp.domain;

import java.util.ArrayList;
import java.util.List;

public class Sorvete {
    private String sorvete;
    private String tipoPote;
    private Integer tamanho;
    private Double preco;

    List<String> sabores = new ArrayList<>();

    public String getSorvete() {
        return sorvete;
    }

    public void setSorvete(String sorvete) {
        this.sorvete = sorvete;
    }

    public List<String> getSabores() {
        return sabores;
    }

    public void setSabores(List<String> sabores) {
        this.sabores = sabores;
    }
}
