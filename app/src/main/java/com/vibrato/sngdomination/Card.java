package com.vibrato.sngdomination;

/**
 * Created by PC on 5/27/2015.
 */

public class Card {
    private Rank rank;
    private Suit suit;

    public Card(Rank r, Suit s) {
        this.rank = r;
        this.suit = s;
    }

    public Rank getRank() {
        return this.rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}