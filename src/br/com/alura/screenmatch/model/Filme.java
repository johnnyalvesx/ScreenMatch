package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.model.Titulo;

public class Filme extends Titulo {

    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
