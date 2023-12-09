package booleans.poker;

public class PokerHandAnalyzer {

    private static HandType analyzeHand(Hand hand) {
        hand.sortCards();

    }

    public static void main(String... args) {
        for (Hand hand : HandGenerator.generateHands()) {
            System.out.println();
            hand.printHand();
            System.out.println(analyzeHand(hand));
        }
    }
}
