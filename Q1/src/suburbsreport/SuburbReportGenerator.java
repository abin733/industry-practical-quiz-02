package suburbsreport;

/**
 *  This class generates a status report based on 20 Auckland suburbs.
 *  It provides the detail descriptions of all 20 suburbs and computes some statical results based on some queries.
 *  It also lists out the suburbs with a given household ranges.
 *
 * @author Vita Tsai
 *
 */
public class SuburbReportGenerator {
    private void start() {
        //TODO: 2. Declare and construct an array of 20 Suburb objects. The array variable name musts be 'suburbs'.
        Suburb[] suburbs = new Suburb[20];


        generateSuburbDetails(suburbs);
        System.out.println();
        System.out.println("Auckland Suburbs Report");
        System.out.println("==============================================================");
        System.out.println("List of Suburbs:");
        printSuburbDetails(suburbs);
        System.out.println();

        System.out.println("Status queries based on the suburbs listed in this report:");
        Suburb furthestSuburb = getFurthestSuburbFromCBD(suburbs);
        System.out.println("The furthest suburb (away from Auckland CBD) is " + furthestSuburb.getName() + ".");

        int numOfSuburbIn6kmSouthwest = countSuburbsWithCriteria(suburbs, 6.0, "Southwest");
        int numOfSuburbIn6kmNorth = countSuburbsWithCriteria(suburbs, 6.0, "north");
        int numOfSuburbIn9kmEast = countSuburbsWithCriteria(suburbs, 9.0, "EAST");
        System.out.println("There are " + numOfSuburbIn6kmSouthwest + " suburbs in the southwest direction that are within 6km away from Auckland CBD.");
        System.out.println("There are " + numOfSuburbIn6kmNorth + " suburbs in the north direction that are within 6km away from Auckland CBD.");
        System.out.println("There are " + numOfSuburbIn9kmEast + " suburbs in the east direction that are within 9km away from Auckland CBD.");

        int totalPopulation = calculateTotalPopulation(suburbs);
        System.out.println("The total population of the 20 suburbs is " + totalPopulation + ".");

        System.out.println();
        System.out.println("Suburbs with the number of households between 1500 - 3000 are as listed:");
        printSuburbsWithinHouseholdsRange(suburbs, 1500,3000);

        System.out.println("==============================================================");
    }

    //TODO: 3. Complete the printSuburbDetails() method
    private void printSuburbDetails(Suburb[] suburbs) {

        for (int i = 0; i < suburbs.length; i++) {
            System.out.println(suburbs[i].toString());

        }
    }

    //TODO: 4. Complete the getFurthestSuburbFromCBD() method
    // You may assume only one suburb is the furthest away from Auckland CBD
    private Suburb getFurthestSuburbFromCBD(Suburb[] suburbs) {
        double furthest = (suburbs[0].getDistancesFromCBD());
        int newMax = 0;
        for (int i = 0; i < suburbs.length ; i++) {

                furthest = suburbs[i].getDistancesFromCBD();
                newMax = i;

        }
        return suburbs[newMax];
    }

    //TODO: 5. Complete the countSuburbsWithCriteria() method
    // Note: You need to ignore the case when checking the direction with the condition string
    private int countSuburbsWithCriteria(Suburb[] suburbs,  double distance, String direction) {
        double distanceQueried;
        String directionQueried = "";
        int criteriaQueried = 0;
        for (int i = 0; i < suburbs.length; i++) {
            distanceQueried = suburbs[i].getDistancesFromCBD();
            directionQueried = suburbs[i].getDirectionFromCBD();
            if (distanceQueried < distance){

                if(directionQueried.compareToIgnoreCase(direction) == 0){
                    criteriaQueried++;

                }
            }
        }


        return criteriaQueried;
    }

    //TODO: 6. Complete the calculateTotalPopulation() method
    private int calculateTotalPopulation(Suburb[] suburbs) {
        int totalPopulation = 0;
        for (int i = 0; i < suburbs.length; i++) {
            totalPopulation += suburbs[i].getPopulation();
        }
        return totalPopulation;
    }

    //TODO: 7. Complete the printSuburbsWithinHouseholdsRange() method
    private void printSuburbsWithinHouseholdsRange(Suburb[] suburbs, int lowerBound, int upperBound) {
        for (int i = 0; i < suburbs.length; i++) {
            if ((suburbs[i].getNumOfHouseholds() > lowerBound) && (suburbs[i].getNumOfHouseholds() < upperBound) ) {
                System.out.printf(suburbs[i].getName() +" has " + suburbs[i].getNumOfHouseholds() + " households.\n");
            }
        }
    }

    /**
     *  This method constructs the suburb objects in the array.
     */
    private void generateSuburbDetails(Suburb[] suburbs){
        suburbs[0] = new Suburb("Avondale", 4.9, "SouthWest", 20082, 5985);
        suburbs[1] = new Suburb("Balmoral", 5.6, "SouthWest", 10164, 3276);
        suburbs[2] = new Suburb("Blockhouse Bay", 12.9, "SouthWest", 15747, 4767);
        suburbs[3] = new Suburb("Eden Terrace", 2.4, "South", 3933, 1803);
        suburbs[4] = new Suburb("Ellerslie", 8.6, "SouthEast", 9186, 3174);
        suburbs[5] = new Suburb("Epsom", 5.7, "South",19428,  5904);
        suburbs[6] = new Suburb("Freemans Bay", 2.9 ,"West",4407,1920);
        suburbs[7] = new Suburb("Glendowie", 11.9,"East", 8832,2877);
        suburbs[8] = new Suburb("Glen Innes",11.5 ,"SouthWest",4413 ,1212);
        suburbs[9] = new Suburb("Grafton", 1.3,"South",1686,558);
        suburbs[10] = new Suburb("Greenlane", 6.3,"SouthEast",8010 ,2577);
        suburbs[11] = new Suburb("Grey Lynn",6.6 ,"SouthWest",11733 ,4173);
        suburbs[12] = new Suburb("Herne Bay",6.8 ,"West",3036 ,1233);
        suburbs[13] = new Suburb("Hillsborough",15.8 ,"South",12489 ,3870);
        suburbs[14] = new Suburb("Kingsland", 3.7,"SouthWest", 3372,1131);
        suburbs[15] = new Suburb("Kohimarama", 9,"East",4350 ,1707);
        suburbs[16] = new Suburb("Lynfield",13.5 ,"SouthWest", 7503,2247);
        suburbs[17] = new Suburb("Meadowbank",9.1 ,"East", 5328,1947);
        suburbs[18] = new Suburb("Mission Bay", 8.4,"East", 4341,1677);
        suburbs[19] = new Suburb("Morningside", 4.8,"SouthWest", 3981,1500);
    }

    public static void main(String[] args) {
        SuburbReportGenerator reportGenerator = new SuburbReportGenerator();
        reportGenerator.start();
    }

}
