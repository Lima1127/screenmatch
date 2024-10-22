package br.com.company.screenmatch.model;

public class Movie {
    private String name;
    private int launchYear,timeInMinutes, totalAvaliation;
    private boolean inThePlan;
    private double sumOfRatings;

    public String getName() {
        return name;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public boolean isInThePlan() {
        return inThePlan;
    }

    public int getTimeInMinutes() {
        return timeInMinutes;
    }

    public int getTotalAvaliation(){
        return totalAvaliation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public void setInThePlan(boolean inThePlan) {
        this.inThePlan = inThePlan;
    }

    public void setTimeInMinutes(int timeInMinutes) {
        this.timeInMinutes = timeInMinutes;
    }

    public void showRecord(){
        System.out.printf("Movie's Name: %s\n", name);
        System.out.printf("Movie's launch year: %d\n", launchYear);
    }

    public void rate (double score){
        sumOfRatings += score;
        totalAvaliation++;
    }

    public double averageGrades(){
        return sumOfRatings / totalAvaliation;
    }
}
