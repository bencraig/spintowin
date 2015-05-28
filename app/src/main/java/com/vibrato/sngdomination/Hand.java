package com.vibrato.sngdomination;

/**
 * Created by PC on 5/28/2015.
 */
public class Hand implements Comparable<Hand> {
    private Card card1;
    private Card card2;
    public Hand(Card card1, Card card2) {
        this.card1 = card1;
        this.card2 = card2;
    }

    public int compareTo(Hand hand2) {
        return 0;
    }

    public boolean isSuited() {
        return card1.getSuit().equals(card2.getSuit());
    }

    public boolean isPocketPair() {
        return card1.getRank().equals(card2.getRank());
    }
}
