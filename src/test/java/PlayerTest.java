import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    private Player player;

    @Before
    public void setUp(){
        player = new Player();
    }

    @Test
    public void playerHandStartsEmpty(){
        assertEquals(0, player.checkHand());
    }


}
