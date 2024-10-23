package br.com.company.screenmatch.calculation;

import br.com.company.screenmatch.model.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void insert(Title title){
        System.out.println("Adding time in minutes of " + title.getName());
        totalTime += title.getTimeInMinutes();
    }
}
