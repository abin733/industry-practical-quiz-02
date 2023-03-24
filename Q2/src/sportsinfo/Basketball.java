package sportsinfo;

public class Basketball extends TeamSport{
    private String nbaChampions;

    public Basketball(String name, boolean isOlympicSport, String firstPlayed, int numberOfPlayers) {
        super(name, isOlympicSport, firstPlayed, numberOfPlayers);
        name = "Basketball";
        isOlympicSport = true;
        firstPlayed = "the 21st December 1891";
        numberOfPlayers = numberOfPlayers;
        playMethod = new Hand();
    }

    public void setNbaChampions(String nbaChampions) {
        this.nbaChampions = nbaChampions;
    }

    public String getNbaChampions() {
        return nbaChampions;
    }
}
