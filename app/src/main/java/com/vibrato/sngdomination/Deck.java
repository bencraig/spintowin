package com.vibrato.sngdomination;

import java.util.ArrayList;

/**
 * Created by PC on 5/28/2015.
 */
public class Deck {
    private static Deck deckInstance;
    private static Card[][] deck; // to avoid creating millions of cards, there is only one deck singleton which contains one instance of each card.
    // deck is a two d array of cards such that a card can be found by deck[Suit.ordinal()][Rank.ordinal()]

    private Deck() { // only want to do this big thing one time, so using singleton pattern
        if (deckInstance != null) {
            throw new IllegalStateException("Already instantiated");
        }

        deck = new Card[Suit.values().length][Rank.values().length];

        for (int i = 0; i < Suit.values().length; i++) {
            for (int j = 0; j < Rank.values().length; j++) {
                deck[i][j] = new Card(Rank.values()[j], Suit.values()[i]);
            }
        }
    }

    public static Card getCard(Rank r, Suit s) {
        if (deckInstance == null) {
            deckInstance = new Deck();
        }
        return deck[s.ordinal()][r.ordinal()];
    }
}
