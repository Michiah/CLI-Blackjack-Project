package cd.rr.blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

     //instance variable
     private ArrayList<Card> cards;

     //construct
     public Deck(){
         this.cards = new ArrayList<Card>();
     }

     //Create full deck method.
     public void createFullDeck() {
         // Generate Cards here
         for (Suit cardSuit : Suit.values()) {
             for (Rank cardRank : Rank.values()) {
                 //add new card to the deck
                 this.cards.add(new Card(cardSuit, cardRank));

             }

         }
     }
        //shuffle method
         public void shuffle(){
             ArrayList<Card> tempDeck = new ArrayList<Card>();
             //Use random object
             Random random = new Random();
             int randomCardIndex = 0;
             int originalSize = this.cards.size();

             for (int i = 0; i<originalSize; i++){
                 //Generate random index
                 randomCardIndex = random.nextInt((this.cards.size()-1-0)+1)+0;
                 tempDeck.add(this.cards.get(randomCardIndex));
                 //remove from original Deck
                 this.cards.remove(randomCardIndex);
             }
             this.cards = tempDeck;

         }
        //toString method
         public String toString(){
         String cardListOutput = " ";
         int i = 0;
         for (Card aCard : this.cards){
             cardListOutput += "\n" + i + "-" + aCard.toString();
             i++;
         }
         return cardListOutput;
         }

     }




