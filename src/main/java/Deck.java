import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;
//    private ArrayList<Card> originalDeck;


    public Deck(){
        this.deck = new ArrayList<Card>();
//        this.originalDeck = new ArrayList<Card>();
    }

    public void changeToArray() {
        CardRank[] cardNumbers = CardRank.values();

        for (CardRank number: cardNumbers){
            System.out.println( number );
        }
    }


    public int checkDeckIsFull() {
        return this.deck.size();
    }

    public void populateWithCards() {
        CardRank[] cardNumbers = CardRank.values();
        SuitType[] suits = SuitType.values();
    for (SuitType suit: suits){
        for(CardRank newCard: cardNumbers){
            Card card = new Card(suit, newCard);
            this.deck.add(card);

        }
    }
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }


    public void dealCard(Player player) {
        Card cardToDeal = deck.remove(0);
        player.addToHand(cardToDeal);
    }
}
