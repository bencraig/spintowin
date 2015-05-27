package com.vibrato.sngdomination;

import android.util.Log;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by PC on 5/27/2015.
 */
public class ShuffledDeck {
    private ArrayList<Card> Deck;

    public ShuffledDeck () {
        Deck = new ArrayList<Card>();
        for (int i = 0; i< Rank.values().length; i++) {
            for (int j = 0; j<Suit.values().length; j++ ) {
                Card card = new Card(Rank.values()[i], Suit.values()[j]);
                Deck.add(card);
            }
        }

        Log.i(this.getClass().getName(), Deck.toString());

        for (int i = 0; i < (int )(Math. random() * 50 + 1); i++) {
            //since collections.shuffle isnt quite sufficiently random, shuffle the deck a random amount more times.
            Collections.shuffle(Deck);
        }

        Log.i(this.getClass().getName(), "SHUFFLED DECK:" + Deck.toString());
    }

    public Card dealOne() {
        return Deck.remove(0);
    }

    public ArrayList<Card> getRemainingCards () {
        return Deck;
    }
}
