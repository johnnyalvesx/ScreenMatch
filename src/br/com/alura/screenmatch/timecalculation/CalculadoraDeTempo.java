package br.com.alura.screenmatch.timecalculation;

import br.com.alura.screenmatch.model.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de: " + titulo.getDuracaoEmMinutos());
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
