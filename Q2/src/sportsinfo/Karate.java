package sportsinfo;

public class Karate extends Sport implements IStunt{

    public Karate(String name, boolean isOlympicSport, String firstPlayed) {
        super(name, isOlympicSport, firstPlayed);
        playMethod = new Foot();
    }

    @Override
    public String getStuntMove() {
        return "SPIN KICK";
    }
}
