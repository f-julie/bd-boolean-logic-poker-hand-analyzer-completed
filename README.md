# Poker Hand Analyzer

You are tasked with creating a method which takes in a poker `Hand` as
input and output's a `HandType` as output.

The `Hand` and `Card` class have been created for you already.

## The Card Class

Take a look first at the `Card` class let's notice a few things 
about how it works.

First we define two public `enum`s, `Rank` and `Suit`. The benefit
of using enums for these properties instead of, say, Strings or ints,
is that we've encapsulated all possible card types and excluded any
impossible card types, e.g. "12 of Diamonds" or "15 of Jacks".

Additionally, it is nice that we can process the enum as either a
String or an integer (using `.ordinal()`) depending on what we need
it for.

The rest of the `Card` class should be self-explanatory, except for
`implements Comparable` and the associated `compareTo` method. We 
will be covering this in detail in a later Unit. For now, understand
that this allows us to define a sorting order for cards.

Remember in a moment to take a look at the `sortCards` method of 
the `Hand` class.

```java
public void sortCards() {
    Arrays.sort(cards);
}
```

The reason it can be written so simply here is because of the setup
work done by implementing `Comparable`.

## The Hand Class

Now let's look at the `Hand` class. This class has an array of 5
`Cards` (We will be covering Arrays in detail in a later lesson),
 as well as several helper methods written in ALL_CAPS. 

These helper methods will be what you will be using to write the
logic for the `analyzeHand` method.

- `int NUM_PAIRS()` returns number of unique pairs. 
    - e.g. a pair of 10s and a pair of 3s returns `2` pairs
- `int NUM_SUITS()` returns number of unique suits.
- `boolean IS_STRAIGHT()` returns true if the hand can be arranged 
in a consecutive, ascending order.
- `boolean HAS_THREE_OF_A_KIND()` returns true if the hand contains
three cards of equal Rank
- `boolean HAS_FOUR_OF_A_KIND()` returns true is the hand contains
four cards of equal Rank
- `Card.Rank HIGHEST_RANK()` returns the `Card.Rank` of the highest
ranked card
    - e.g. `Card.Rank.KING`
    
# Your Task

1. Create an enum inside the `PokerHandAnalyzer` class named `HandType`
and include the following members:

    ```
    HIGH_CARD
    PAIR
    TWO_PAIR
    THREE_OF_A_KIND
    STRAIGHT
    FLUSH
    FULL_HOUSE
    FOUR_OF_A_KIND
    STRAIGHT_FLUSH
    ROYAL_FLUSH
    ```

2. Complete the `analyzeHand` method. The `main` method will call
this method several times and supply several different hands. You do
not need to generate any hands yourself.
    - Use if-statements, else, and `Hand` helper methods.
    - return the correct `HandType` for each hand.
    - remember that as soon as a `return` statement is called, the
    method ends.

## A Completed Project Will

Successfully output the following HandTypes in this order
for the generated hands:

```java
ROYAL_FLUSH
FLUSH
FOUR_OF_A_KIND
TWO_PAIR
FULL_HOUSE
PAIR
HIGH_CARD
STRAIGHT
STRAIGHT_FLUSH
THREE_OF_A_KIND
```
*(You can comment out `hand.printHand()` to see only the HandTypes)*
