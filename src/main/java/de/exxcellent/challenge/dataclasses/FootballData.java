package de.exxcellent.challenge.dataclasses;

import com.opencsv.bean.CsvBindByName;
import de.exxcellent.challenge.calculator.RangeObject;

public class FootballData implements RangeObject {
    @CsvBindByName(column = "Team")
    private String team;
    @CsvBindByName(column = "Games")
    private int games;
    @CsvBindByName(column = "Wins")
    private int wins;
    @CsvBindByName(column = "Losses")
    private int losses;
    @CsvBindByName(column = "Draws")
    private int draws;
    @CsvBindByName(column = "Goals")
    private int goals;
    @CsvBindByName(column = "Goals Allowed")
    private int goalsAllowed;
    @CsvBindByName(column = "Points")
    private int points;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "FootballData{" +
                "team='" + team + '\'' +
                ", games=" + games +
                ", wins=" + wins +
                ", losses=" + losses +
                ", draws=" + draws +
                ", goals=" + goals +
                ", goalsAllowed=" + goalsAllowed +
                ", points=" + points +
                '}';
    }

    @Override
    public int bound1() {
        return this.goals;
    }

    @Override
    public int bound2() {
        return this.goalsAllowed;
    }
}
