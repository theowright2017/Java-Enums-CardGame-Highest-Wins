import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private Player player1;

    @Before
    public void setUp(){
        deck = new Deck();
        player1 = new Player();
    }

    @Test
    public void checkDeckHasAllCards() {
        deck.populateWithCards();
        assertEquals(52, deck.checkDeckIsFull());
    }

//    @Test
//    public void checkDeckHasBeenShuffled(){
//        deck.populateWithCards();
//        deck.shuffleDeck();
//        assert(true);
//    }

    @Test
    public void canDealCardToPlayer(){
        deck.populateWithCards();
        deck.shuffleDeck();
        deck.dealCard(player1);
        System.out.println(player1.checkWhichCard());
        assertEquals(51, deck.checkDeckIsFull());
        assertEquals(1, player1.checkHand());
    }
}
