package suburbsreport;

public class Suburb {


    private String name, directionFromCBD;
    private int population, numOfHouseholds;
    private double distancesFromCBD;


    public Suburb(String name, double distancesFromCBD, String directionFromCBD, int population, int numOfHouseholds) {
        this.name = name;
        this.directionFromCBD = directionFromCBD;
        this.population = population;
        this.numOfHouseholds = numOfHouseholds;
        this.distancesFromCBD = distancesFromCBD;
    }

    // TODO: 1. Create the toString() method.
    public String toString(){
        String message;
        message = this.name + "is situated " + this.directionFromCBD + " of the Auckland CBD.\n" + "It has a population of " + this.population + " with " + this.numOfHouseholds + " households.";
        return message;
    }

    public String getName() {
        return name;
    }

    public String getDirectionFromCBD() {
        return directionFromCBD;
    }

    public int getPopulation() {
        return population;
    }

    public int getNumOfHouseholds() {
        return numOfHouseholds;
    }

    public double getDistancesFromCBD() {
        return distancesFromCBD;
    }

    public boolean isFurtherFromCBDThan(Suburb other){
        if(other.distancesFromCBD > this.distancesFromCBD){
            return false;
        }else {
            return true;
        }
    }
}
