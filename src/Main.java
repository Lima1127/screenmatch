import br.com.company.screenmatch.calculation.ClassificationFilter;
import br.com.company.screenmatch.calculation.TimeCalculator;
import br.com.company.screenmatch.model.Episodes;
import br.com.company.screenmatch.model.Movie;
import br.com.company.screenmatch.model.Serie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie();
        Movie movie1 = new Movie();
        Serie serie = new Serie();
        TimeCalculator timeCalculator = new TimeCalculator();
        movie.setName("Joker");
        movie.setLaunchYear(2019);
        movie.setTimeInMinutes(140);

        movie.showRecord();
        System.out.println("Informe as avaliações:");
        movie.rate(sc.nextDouble());
        movie.rate(sc.nextDouble());
        movie.rate(sc.nextDouble());
        System.out.println("Total de avaliações: " + movie.getTotalAvaliation());
        System.out.printf("Media de avaliações: %.2f\n\n", movie.averageGrades());

        serie.setName("ReZero");
        serie.setLaunchYear(2016);
        serie.showRecord();
        serie.setSeasons(2);
        serie.setEpisodesForSeason(26);
        serie.setMinutesForEpisodes(24);
        System.out.println("Duração total de ReZero: " + serie.getTimeInMinutes());

        movie1.setName("Venom");
        movie1.setLaunchYear(2019);
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


    }
}