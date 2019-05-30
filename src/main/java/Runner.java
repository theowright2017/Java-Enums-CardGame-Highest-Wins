public class Runner {

//    public static void main(String[] args) {
//        SuitType[] suits = SuitType.values();
//
//        for (SuitType suit: suits){
//            System.out.println(suit);
//        }
//    }

    public static void main(String[] args) {
        CardRank[] cardNumbers = CardRank.values();

        for (CardRank number: cardNumbers){
        System.out.println( number );
    }
}
}
// .values() is built in enum method to retrieve all value keys(names), to get actual numerical values it needs to be done
//through .getValue()
