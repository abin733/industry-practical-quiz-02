import sportsinfo.*;

public class SportKnowledgeApp {
    private Sport[] sports;

    public void start(){


        //TODO 8a. Initialise sports array and fill in the last three elements.
        sports = new Sport[5];
        sports[0] = new Badminton("Badminton", true, "the 19th century");
        sports[1] = new Tennis();
        sports[2] = new Rugby("Rugby", false, "the 19th Century", 15);
        sports[3] = new Basketball("Basketball",true,"the 21st December 1891", 5);
        sports[4] = new Karate("Karate", true, "the 17th century");


        System.out.println();
        System.out.println("Display Sports Information");
        System.out.println("============================");
        //TODO 8b. Appropriately call the displaySportsInformation() method
        displaySportsInformation();
        System.out.println("============================");

        System.out.println();
        System.out.println("Display Team Sports Information");
        System.out.println("============================");
        //TODO 8c. Appropriately call the displayTeamSportInformation() method

        System.out.println("============================");

        System.out.println();
        System.out.println("Some sports have stunt moves, let's see them!");
        System.out.println("============================");
        //TODO 8d. Appropriately call the displayStuntMoves() method

        System.out.println("============================");
        System.out.println();

        //TODO 8e. Set the nbaChampions property of basketball to "Golden State Warriors" & display it as per screenshot.


    }




    //TODO 8b. Create the displaySportsInformation() method, called displayTeamSportDetail in this method
    private void displaySportsInformation() {

        for (int i = 0; i < sports.length; i++) {

            System.out.println(sports[i].generateSportInformation());
            System.out.println(sports[i].getName() +" is played "+(sports[i].getPlayMethod()));


        }
    }


    //TODO: 8c. Create the displayTeamSportsInformation() method


    //TODO: 8d. Create the displayStuntMoves() method, Note: the sport's name should be in small letters



    public static void main(String[] args) {
        SportKnowledgeApp app = new SportKnowledgeApp();
        app.start();
    }
}
