package br.com.company.screenmatch.model;

import br.com.company.screenmatch.calculation.Classifiable;

public class Movie extends Title implements Classifiable {
    private String director;

    public Movie(String name, int lauchYear) {
        super(name, lauchYear);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassificacao() {
        return (int) averageGrades() / 2;
    }

    @Override
    public String toString() {
        return "Movie: " + this.getName() + " (" + getLaunchYear() + ")";
    }
}
