import br.com.company.screenmatch.model.Movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie();
        movie.setName("Joker");
        movie.setLaunchYear(2019);
        movie.setTimeInMinutes(140);

        movie.showRecord();
        System.out.println("Informe as avaliações:");
        movie.rate(sc.nextDouble());
        movie.rate(sc.nextDouble());
        movie.rate(sc.nextDouble());
        System.out.println("Total de avaliações: " + movie.getTotalAvaliation());
        System.out.printf("Media de avaliações: %.2f\n", movie.averageGrades());

    }
}