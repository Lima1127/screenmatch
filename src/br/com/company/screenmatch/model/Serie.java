package br.com.company.screenmatch.model;

public class Serie extends Title {
    private int seasons;
    private boolean active;
    private int episodesForSeason;
    private int minutesForEpisodes;

    public Serie(String name, int launchYear) {
        super(name, launchYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getMinutesForEpisodes() {
        return minutesForEpisodes;
    }

    public void setMinutesForEpisodes(int minutesForEpisodes) {
        this.minutesForEpisodes = minutesForEpisodes;
    }

    public int getEpisodesForSeason() {
        return episodesForSeason;
    }

    public void setEpisodesForSeason(int episodesForSeason) {
        this.episodesForSeason = episodesForSeason;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public int getTimeInMinutes() {
        return seasons * episodesForSeason * minutesForEpisodes;
    }
}
