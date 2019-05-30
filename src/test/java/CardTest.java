import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card;
    private Card card2;

    @Before
        public void setUp(){
        card = new Card(SuitType.HEARTS, CardRank.ACE);
        card2 = new Card(SuitType.HEARTS, CardRank.EIGHT);
    }
    //pass in enum instead of string

    @Test
    public void canGetSuit(){
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

//    @Test
//    public void suitCanBeMisspelled() {
//        card = new Card("Hearstss");
//        assertEquals("Hearstss", card.getSuit());
//    }

    @Test
    public void canGetRank(){
        assertEquals(CardRank.ACE, card.getRank());
    }

    @Test
    public void eightHasValue8(){
        int value = card2.getValueFromEnum();
        assertEquals(8, value);
    }




}
