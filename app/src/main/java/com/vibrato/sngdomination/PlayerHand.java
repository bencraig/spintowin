package com.vibrato.sngdomination;

/**
 * Created by PC on 5/27/2015.
 */
public class PlayerHand {
    private Card card1, card2;

    public PlayerHand (Card card1, Card card2) {
        this.card1 = card1;
        this.card2 = card2;
    }

    public Card getCard1() {
        return this.card1;
    }

    public Card getCard2() {
        return this.card2;
    }

    public String toString () {
        return card1.toString() +", "+ card2.toString();
    }
}
