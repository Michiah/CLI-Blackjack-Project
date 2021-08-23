package cd.rr.blackjack;

public class BlackjackGame {
    public static void main(String[] args) {

        //Welcome message
        System.out.println("Welcome to Blackjack!");

        //Create playing Deck
        Deck playingDeck = new Deck();
        playingDeck.createFullDeck();
        playingDeck.shuffle();
        System.out.println(playingDeck.toString());




    }
}
