package sportsinfo;

//Todo 7a. This class also implements the IStunt interface.

public class Badminton extends Sport implements IStunt{

    //Todo 7b. Modify the constructor to initialize the playMethod to a Racket object.
    public Badminton(String name, boolean isOlympicSport, String firstPlayed) {
        super(name, isOlympicSport, firstPlayed);
        playMethod = new Racket();
    }

    @Override
    public String getStuntMove() {
        return "JUMP SMASH";
    }
}
