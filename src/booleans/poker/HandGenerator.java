package booleans.poker;

import java.util.ArrayList;
import java.util.List;

public class HandGenerator {
    public static List<Hand> generateHands() {
        List<Hand> hands = new ArrayList<>();

        hands.add(new Hand(new Card[] {
                new Card(Card.Rank.ACE, Card.Suit.DIAMONDS),
                new Card(Card.Rank.KING, Card.Suit.DIAMONDS),
                new Card(Card.Rank.QUEEN, Card.Suit.DIAMONDS),
                new Card(Card.Rank.TEN, Card.Suit.DIAMONDS),
                new Card(Card.Rank.JACK, Card.Suit.DIAMONDS),
        }));


        hands.add(new Hand(new Card[] {
                new Card(Card.Rank.TEN, Card.Suit.DIAMONDS),
                new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS),
                new Card(Card.Rank.QUEEN, Card.Suit.DIAMONDS),
                new Card(Card.Rank.TWO, Card.Suit.DIAMONDS),
                new Card(Card.Rank.JACK, Card.Suit.DIAMONDS),
        }));


        hands.add(new Hand(new Card[] {
                new Card(Card.Rank.TEN, Card.Suit.DIAMONDS),
                new Card(Card.Rank.TEN, Card.Suit.CLUBS),
                new Card(Card.Rank.TEN, Card.Suit.SPADES),
                new Card(Card.Rank.TEN, Card.Suit.HEARTS),
                new Card(Card.Rank.JACK, Card.Suit.DIAMONDS),
        }));

        hands.add(new Hand(new Card[] {
                new Card(Card.Rank.TEN, Card.Suit.DIAMONDS),
                new Card(Card.Rank.TEN, Card.Suit.CLUBS),
                new Card(Card.Rank.THREE, Card.Suit.SPADES),
                new Card(Card.Rank.JACK, Card.Suit.HEARTS),
                new Card(Card.Rank.JACK, Card.Suit.DIAMONDS),
        }));

        hands.add(new Hand(new Card[] {
                new Card(Card.Rank.TEN, Card.Suit.DIAMONDS),
                new Card(Card.Rank.TEN, Card.Suit.CLUBS),
                new Card(Card.Rank.THREE, Card.Suit.SPADES),
                new Card(Card.Rank.THREE, Card.Suit.HEARTS),
                new Card(Card.Rank.THREE, Card.Suit.DIAMONDS),
        }));

        hands.add(new Hand(new Card[] {
                new Card(Card.Rank.TEN, Card.Suit.DIAMONDS),
                new Card(Card.Rank.TEN, Card.Suit.CLUBS),
                new Card(Card.Rank.FIVE, Card.Suit.SPADES),
                new Card(Card.Rank.THREE, Card.Suit.HEARTS),
                new Card(Card.Rank.JACK, Card.Suit.DIAMONDS),
        }));

        hands.add(new Hand(new Card[] {
                new Card(Card.Rank.KING, Card.Suit.DIAMONDS),
                new Card(Card.Rank.TEN, Card.Suit.CLUBS),
                new Card(Card.Rank.FIVE, Card.Suit.SPADES),
                new Card(Card.Rank.THREE, Card.Suit.HEARTS),
                new Card(Card.Rank.JACK, Card.Suit.DIAMONDS),
        }));

        hands.add(new Hand(new Card[] {
                new Card(Card.Rank.THREE, Card.Suit.DIAMONDS),
                new Card(Card.Rank.TWO, Card.Suit.CLUBS),
                new Card(Card.Rank.FIVE, Card.Suit.SPADES),
                new Card(Card.Rank.SIX, Card.Suit.HEARTS),
                new Card(Card.Rank.FOUR, Card.Suit.DIAMONDS),
        }));

        hands.add(new Hand(new Card[] {
                new Card(Card.Rank.THREE, Card.Suit.DIAMONDS),
                new Card(Card.Rank.TWO, Card.Suit.DIAMONDS),
                new Card(Card.Rank.FIVE, Card.Suit.DIAMONDS),
                new Card(Card.Rank.SIX, Card.Suit.DIAMONDS),
                new Card(Card.Rank.FOUR, Card.Suit.DIAMONDS),
        }));

        hands.add(new Hand(new Card[] {
                new Card(Card.Rank.TEN, Card.Suit.DIAMONDS),
                new Card(Card.Rank.FOUR, Card.Suit.CLUBS),
                new Card(Card.Rank.THREE, Card.Suit.SPADES),
                new Card(Card.Rank.THREE, Card.Suit.HEARTS),
                new Card(Card.Rank.THREE, Card.Suit.DIAMONDS),
        }));

        return hands;
    }

}
