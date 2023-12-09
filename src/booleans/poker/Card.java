package booleans.poker;

import static java.lang.String.format;

public class Card implements Comparable<Card> {
    public enum Rank {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE
    }

    public enum Suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }

    private Rank rank;
    private Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return format("%s OF %s", rank.toString(), suit.toString());
    }

    @Override
    public int compareTo(Card o) {
        int rankDelta = rank.ordinal() - o.getRank().ordinal();
        if (rankDelta != 0) return rankDelta;
        int suitDelta = o.getSuit().ordinal() - suit.ordinal();
        return suitDelta;
    }
}
