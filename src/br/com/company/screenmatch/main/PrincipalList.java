package br.com.company.screenmatch.main;

import br.com.company.screenmatch.model.Movie;
import br.com.company.screenmatch.model.Serie;
import br.com.company.screenmatch.model.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalList {
    public static void main(String[] args) {
        Movie movie = new Movie("Joker", 2019);
        movie.rate(8);
        Movie movie1 = new Movie("Venom", 2019);
        movie1.rate(7);
        Movie movieDuarte = new Movie("SAO Ordinale Scale", 2017);
        movieDuarte.rate(6);
        Serie serie = new Serie("ReZero", 2016);

        List<Title> list = new ArrayList<>();
        list.add(movieDuarte);
        list.add(movie);
        list.add(movie1);
        list.add(serie);
        for (Title file:list){
            System.out.println(file.getName());
            if(file instanceof Movie isMovie && isMovie.getClassification() > 2){
                System.out.println("Classificação: " + isMovie.getClassification());
            }
        }

        System.out.println("Ordenando títulos");
        Collections.sort(list);
        System.out.println();
        System.out.println("Ordenando ano");
        list.sort(Comparator.comparing(Title::getLaunchYear));
        System.out.println(list);
    }
}
