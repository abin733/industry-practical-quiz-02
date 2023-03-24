package sportsinfo;

public abstract class Sport {

    protected String name, firstPlayed;
    protected boolean isOlympicSport;
    protected IPlayMethod playMethod;


    public Sport(String name, boolean isOlympicSport,String firstPlayed) {
        this.name = name;
        this.isOlympicSport = isOlympicSport;
        this.firstPlayed = firstPlayed;
    }

    public String getName() {
        return name;
    }

    public String getFirstPlayed() {
        return firstPlayed;
    }

    public boolean isOlympicSport() {
        return isOlympicSport;
    }

    public IPlayMethod getPlayMethod() {
        return playMethod;
    }


    /*Todo 2. Modify this method so that it will check if the current sport is an Olympic sport.
     *        If so, it will add the following sentence "It is an Olympic sport." to the existing sportInfo string.
     *        Otherwise, it will add the following sentence "It is not an Olympic sport." to the existing sportInfo string.
     */
    public String generateSportInformation(){
        String sportInfo = name + " was first played in " + firstPlayed + ".";
            if (this.isOlympicSport()){
                sportInfo = sportInfo + " It is an olympic sports ";
            } else {
                sportInfo = sportInfo + " It is not an olympic sports ";
            }
        return sportInfo;
    }

    public void displayPlayMethod(){
        System.out.println(name + " is played by " + playMethod.getPlayMethod() + ".");
    }

}
