package br.com.company.screenmatch.main;

import br.com.company.screenmatch.calculation.ClassificationFilter;
import br.com.company.screenmatch.calculation.TimeCalculator;
import br.com.company.screenmatch.model.Episodes;
import br.com.company.screenmatch.model.Movie;
import br.com.company.screenmatch.model.Serie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie("Joker", 2019);
        Movie movie1 = new Movie("Venom", 2019);
        Movie movieDuarte = new Movie("SAO Ordinale Scale", 2017);
        Serie serie = new Serie("ReZero", 2016);
        TimeCalculator timeCalculator = new TimeCalculator();
        movie.setTimeInMinutes(140);

        movie.showRecord();
        System.out.println("Informe as avaliações:");
        movie.rate(sc.nextDouble());
        movie.rate(sc.nextDouble());
        movie.rate(sc.nextDouble());
        System.out.println("Total de avaliações: " + movie.getTotalAvaliation());
        System.out.printf("Media de avaliações: %.2f\n\n", movie.averageGrades());

        serie.showRecord();
        serie.setSeasons(2);
        serie.setEpisodesForSeason(26);
        serie.setMinutesForEpisodes(24);
        System.out.println("Duração total de ReZero: " + serie.getTimeInMinutes());

        movie1.setTimeInMinutes(160);

        timeCalculator.insert(movie);
        timeCalculator.insert(movie1);
        timeCalculator.insert(serie);
        System.out.println(timeCalculator.getTotalTime());

        ClassificationFilter filter = new ClassificationFilter();
        filter.filters(movie);

        Episodes episodes = new Episodes();
        episodes.setNumber(1);
        episodes.setSerie(serie);
        episodes.setTotalViews(300);
        filter.filters(episodes);

        movieDuarte.setTimeInMinutes(110);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(movieDuarte);
        moviesList.add(movie);
        moviesList.add(movie1);
        System.out.println("List Size: " + moviesList.size());
        System.out.println("First Movie: " + moviesList.getFirst().getName());
        System.out.println(moviesList);

    }
}