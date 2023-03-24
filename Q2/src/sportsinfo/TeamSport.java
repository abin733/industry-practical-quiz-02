package sportsinfo;


public abstract class TeamSport extends Sport {


    //Todo 3a. Create an int field and named it numberOfPlayers.
    private int numberOfPlayers = 1;

    /* Todo 3b: Modify the constructor to add an additional integer parameter.
     *          Using the value from the parameter for the numberOfPlayers
     */
    public TeamSport(String name, boolean isOlympicSport, String firstPlayed, int numberOfPlayers) {
        super(name, isOlympicSport, firstPlayed);
        numberOfPlayers = numberOfPlayers;
    }

    // Todo 3c: Create the getter and setter method for the numberOfPlayers


    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
}
