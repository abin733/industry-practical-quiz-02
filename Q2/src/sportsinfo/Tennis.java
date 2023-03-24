package sportsinfo;


public class Tennis extends Sport {

    public Tennis() {
        super("Tennis", true, "the 19th century");
        playMethod = new Racket();
    }
}
