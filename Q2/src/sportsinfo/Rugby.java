package sportsinfo;

public class Rugby extends TeamSport{

    public Rugby(String name, boolean isOlympicSport, String firstPlayed, int numberOfPlayers) {
        super(name, isOlympicSport, firstPlayed, numberOfPlayers);
        this.name = name;
        this.isOlympicSport = isOlympicSport;
        this.firstPlayed = firstPlayed;
        this.setNumberOfPlayers(numberOfPlayers);
        playMethod = new Foot();
    }
}


