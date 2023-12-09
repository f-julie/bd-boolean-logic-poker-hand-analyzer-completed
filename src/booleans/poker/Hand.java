package booleans.poker;

import java.util.Arrays;

public class Hand {
    Card[] cards = new Card[5];

    public Hand(Card[] cards) {
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public void sortCards() {
        Arrays.sort(cards);
    }

    public int NUM_PAIRS() {
        int numPairs = 0;
        for (int i = 0; i < cards.length-1; i++) {
            if (cards[i].getRank() == cards[i+1].getRank()) {
                if (i > 2 && cards[i-2].getRank() == cards[i].getRank()) {
                    continue;
                }
                numPairs++;
                i++;
            }
        }
        return numPairs;
    }

    public int NUM_SUITS() {
        int clubs = 0;
        int diamonds = 0;
        int hearts = 0;
        int spades = 0;

        for (int i = 0; i < cards.length; i++) {
            if (cards[i].getSuit() == Card.Suit.CLUBS) {
                clubs = 1;
            }
            if (cards[i].getSuit() == Card.Suit.DIAMONDS) {
                diamonds = 1;
            }
            if (cards[i].getSuit() == Card.Suit.HEARTS) {
                hearts = 1;
            }
            if (cards[i].getSuit() == Card.Suit.SPADES) {
                spades = 1;
            }
        }

        return clubs + hearts + diamonds + spades;
    }

    public boolean HAS_THREE_OF_A_KIND() {
        for (int i = 0; i < cards.length-2; i++) {
            if (cards[i].getRank() == cards[i+1].getRank() &&
                cards[i].getRank() == cards[i+2].getRank()) {
                return true;
            }
        }
        return false;
    }

    public boolean IS_STRAIGHT() {
        for (int i = 0; i < cards.length-1; i++) {
            if (cards[i].getRank().ordinal() + 1 != cards[i + 1].getRank().ordinal()) {
                return false;
            }
        }
        return true;
    }

    public Card.Rank HIGHEST_RANK() {
        return cards[4].getRank();
    }

    public boolean HAS_FOUR_OF_A_KIND() {
        for (int i = 0; i < cards.length-2; i++) {
            if (cards[i].getRank() == cards[i+1].getRank() &&
                cards[i].getRank() == cards[i+2].getRank() &&
                cards[i].getRank() == cards[i+3].getRank()) {
                return true;
            }
        }
        return false;
    }

    public void printHand() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }
}
