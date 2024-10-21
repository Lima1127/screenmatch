//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.name = "Joker";
        movie.launchYear = 2019;
        movie.timeInMinutes = 140;

        movie.showRecord();
        movie.rate(8);
        movie.rate(5);
        movie.rate(10);
        System.out.println(movie.sumOfRatings);
        System.out.println(movie.totalAvaliation);
        System.out.println(movie.averageGrades());

    }
}