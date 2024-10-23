package br.com.company.screenmatch.model;

import br.com.company.screenmatch.calculation.Classifiable;

public class Movie extends Title implements Classifiable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
