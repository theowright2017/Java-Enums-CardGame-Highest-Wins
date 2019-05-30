import java.util.ArrayList;

public class Dealer {

    private Deck dealerDeck;
    private ArrayList<Player> playersList;

    public Dealer(){
        this.dealerDeck = new Deck();
        this.playersList = new ArrayList<Player>();
        this.addPlayersToList();
        dealerDeck.populateWithCards();
        dealerDeck.shuffleDeck();
    }

    public void addPlayersToList(){
        Player player1 = new Player();
        Player player2 = new Player();
        this.playersList.add(player1);
        this.playersList.add(player2);
    }

    public int checkDeckSize() {
        return this.dealerDeck.checkDeckIsFull();
    }

    public int checkPlayers() {
        return this.playersList.size();
    }

    public int checkPlayersHaveCards(){
        int total = 0;
        Player player1 = this.playersList.get(0);
        total += player1.checkHand();
        Player player2 = this.playersList.get(1);
        total += player2.checkHand();
        return total;
    }

    public void dealCards() {
        Player player1 = this.playersList.get(0);
        this.dealerDeck.dealCard(player1);
        Player player2 = this.playersList.get(1);
        this.dealerDeck.dealCard(player2);
    }




//    public int checkPlayersHaveCards() {
//        Player player1 = this.playersList.get(0);
//        player1.checkWhichCard();
//
//    }
}
