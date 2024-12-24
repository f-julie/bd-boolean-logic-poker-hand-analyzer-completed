package booleans.poker;

public class PokerHandAnalyzer {

    public enum HandType {
        HIGH_CARD,
        PAIR,
        TWO_PAIR,
        THREE_OF_A_KIND,
        STRAIGHT,
        FLUSH,
        FULL_HOUSE,
        FOUR_OF_A_KIND,
        STRAIGHT_FLUSH,
        ROYAL_FLUSH
    }

    private static HandType analyzeHand(Hand hand) {
        hand.sortCards();

        // What is the best HandType we can make with this hand?

        // If I have a straight..
            // If I have a flush...
                // If I have an ACE then I have a Royal Flush
                // Else I have a Straight Flush
            // Else I have a Straight:

        // Four of a kind: four of a kind
        // Full House: Three of a kind and a separate two of a kind (2 pairs)
        // Flush: Flush


        // This way works too.
        /*
        if (hand.IS_STRAIGHT() && hand.HIGHEST_RANK() == Card.Rank.ACE && hand.NUM_SUITS() == 1) {
            return HandType.ROYAL_FLUSH;
        }
        if (hand.IS_STRAIGHT() && hand.NUM_SUITS() == 1) {
            return HandType.STRAIGHT_FLUSH;
        }
        if (hand.IS_STRAIGHT()) {
            return HandType.STRAIGHT;
        }
        */

        if (hand.IS_STRAIGHT()) {
            if (hand.NUM_SUITS() == 1) {
                if (hand.HIGHEST_RANK() == Card.Rank.ACE) {
                    return HandType.ROYAL_FLUSH;
                }
                return HandType.STRAIGHT_FLUSH;
            }
            return HandType.STRAIGHT;
        }

        if (hand.HAS_FOUR_OF_A_KIND()) {
            return HandType.FOUR_OF_A_KIND;
        }

        int numPairs = hand.NUM_PAIRS();

        if (numPairs == 2) {
            if (hand.HAS_THREE_OF_A_KIND()) {
                return HandType.FULL_HOUSE;
            }
            return HandType.TWO_PAIR;
        }

        if (hand.HAS_THREE_OF_A_KIND()) {
            return HandType.THREE_OF_A_KIND;
        }

        if (hand.NUM_SUITS() == 1) {
            return HandType.FLUSH;
        }

        if (numPairs == 1) {
            return HandType.PAIR;
        }

        return HandType.HIGH_CARD;

    }

    public static void main(String... args) {
        for (Hand hand : HandGenerator.generateHands()) {
            System.out.println();
            hand.printHand();
            System.out.println(analyzeHand(hand));
        }
    }
}
