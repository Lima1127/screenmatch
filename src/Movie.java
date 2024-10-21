public class Movie {
    String name;
    int launchYear,totalAvaliation,timeInMinutes;
    boolean inThePlan;
    double sumOfRatings;

    void showRecord(){
        System.out.printf("Movie's Name: %s\n", name);
        System.out.printf("Movie's launch year: %d\n", launchYear);
    }

    void rate (double score){
        sumOfRatings += score;
        totalAvaliation++;
    }

    double averageGrades(){
        return sumOfRatings / totalAvaliation;
    }
}
