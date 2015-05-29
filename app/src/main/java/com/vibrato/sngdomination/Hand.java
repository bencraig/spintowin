package com.vibrato.sngdomination;

/**
 * Created by PC on 5/28/2015.
 */
public class Hand implements Comparable<Hand> {
    private Card card1;
    private Card card2;
    private boolean isSuited;
    private boolean isPocketPair;

    public Hand(Card card1, Card card2) {
        this.card1 = card1;
        this.card2 = card2;
        //init these here for speed consideration instead of comparing on the fly
        this.isSuited = card1.getSuit().equals(card2.getSuit());
        this.isPocketPair = card1.getRank().equals(card2.getRank());
    }

    public Card getCard1() {
        return this.card1;
    }

    public Card getCard2() {
        return this.card2;
    }

    public int compareTo(Hand hand2) {
       // HandRanking.getHandRankings()
        return 0;
    }

    public boolean isSuited() {
        return this.isSuited;
    }

    public boolean isPocketPair() {
        return this.isPocketPair;
    }

    public String toString(){
        return card1.getRank().toString() +":"+ card2.getRank().toString() + (this.isSuited ? "s" : "o") + "\n";
    }
}
