package com.vibrato.sngdomination;

import java.util.ArrayList;

/**
 * Created by PC on 5/28/2015.
 */
public class HandRankingArray {
    private static final HandRankingArray handRankingSingleton = new HandRankingArray();
    private ArrayList<Hand> handRankings;

    private HandRankingArray() {
        if(handRankingSingleton != null) {
            throw new IllegalStateException("Already instantiated");
        }
        // create hand ranking array based on flopzilla HU allin equity hand rankings
        handRankings = new ArrayList<Hand>(); // suits are not used for hand ranking, except to specify offsuit or not
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.ACE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.KING, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.QUEEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.JACK, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.TEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.NINE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.EIGHT, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.KING, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.SEVEN, Suit.CLUBS), new Card(Rank.SEVEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.QUEEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.JACK, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.KING, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.TEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.QUEEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.JACK, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.QUEEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.SIX, Suit.CLUBS), new Card(Rank.SIX, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.NINE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.TEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.JACK, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.EIGHT, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.TEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.QUEEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.SEVEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.NINE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.JACK, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.FIVE, Suit.CLUBS), new Card(Rank.FIVE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.JACK, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.NINE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.FIVE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.SIX, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.EIGHT, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.TEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.TEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.FOUR, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.SEVEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.EIGHT, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.THREE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.JACK, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.NINE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.FIVE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.SIX, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.NINE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.SEVEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.TEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.TEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.FOUR, Suit.CLUBS), new Card(Rank.FOUR, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.FOUR, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.SIX, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.EIGHT, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.EIGHT, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.FIVE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.NINE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.NINE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.TEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.SEVEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.ACE, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.FOUR, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.SEVEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.SIX, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.THREE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.NINE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.EIGHT, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.THREE, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.SIX, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.EIGHT, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.FIVE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.NINE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.FIVE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.EIGHT, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.FOUR, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.EIGHT, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.SEVEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.FOUR, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.SEVEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.NINE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.EIGHT, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.SIX, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.THREE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.EIGHT, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.SEVEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.SIX, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.KING, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.DEUCE, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.FIVE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.FIVE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.EIGHT, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.SEVEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.FOUR, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.SEVEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.FOUR, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.SIX, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.THREE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.EIGHT, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.SEVEN, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.SEVEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.SIX, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.SIX, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.QUEEN, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.FIVE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.FIVE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.FOUR, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.SEVEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.SIX, Suit.CLUBS)));

    }

    public ArrayList<Hand> getHUHandRankings() {
        return handRankingSingleton.handRankings;
    }

}

J4o,T6o,95s,T3s,76s,J3o,87o,T2s,85s,96o,J2o,T5o,94s,75s,T4o,93s,86o,65s,84s,95o,T3o,92s,76o,74s,T2o,54s,85o,64s,83s,94o,75o,82s,73s,93o,65o,53s,63s,84o,92o,43s,74o,72s,54o,64o,52s,62s,83o,42s,82o,73o,53o,63o,32s,43o,72o,52o,62o,42o,32o,