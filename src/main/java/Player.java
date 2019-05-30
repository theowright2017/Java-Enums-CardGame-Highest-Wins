import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<Card>();
    }

    public int checkHand() {
        return this.hand.size();
    }

    public void addToHand(Card card){
        this.hand.add(card);
    }

    public int checkWhichCard(){
        Card thisCard = this.hand.get(0);
       return thisCard.getValueFromEnum();
    }
}
