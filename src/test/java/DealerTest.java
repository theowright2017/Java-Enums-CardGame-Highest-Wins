import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    private Dealer dealer;

    @Before
    public void setUp(){
        dealer = new Dealer();
    }

    @Test
    public void dealerHasFullDeck(){
        assertEquals(52, dealer.checkDeckSize());
    }

    @Test
    public void playersHaveBeenAdded(){
        assertEquals(2, dealer.checkPlayers());
    }

    @Test
    public void canDealCardsToPlayers(){
        dealer.dealCards();
        assertEquals(50, dealer.checkDeckSize());
        assertEquals(2, dealer.checkPlayersHaveCards());
    }

    @Test
    public void checkPlayer1HasWon(){


    }
}
