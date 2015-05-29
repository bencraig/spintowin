package com.vibrato.sngdomination;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by PC on 5/28/2015.
 */
public class HandRanking {
    private static HandRanking handRankingInstance;

    private static ArrayList<Hand> handRankings;

    private HandRanking() { // only want to do this big thing one time, so using singleton pattern
        if(handRankingInstance != null) {
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
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.FOUR, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.SIX, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.FIVE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.THREE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.SEVEN, Suit.CLUBS), new Card(Rank.SIX, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.SEVEN, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.FIVE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.SIX, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.JACK, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.FIVE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.FOUR, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.SEVEN, Suit.CLUBS), new Card(Rank.FIVE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.FOUR, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.THREE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.SIX, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.SIX, Suit.CLUBS), new Card(Rank.FIVE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.FOUR, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.FIVE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.SEVEN, Suit.CLUBS), new Card(Rank.SIX, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.SEVEN, Suit.CLUBS), new Card(Rank.FOUR, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.TEN, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.FIVE, Suit.CLUBS), new Card(Rank.FOUR, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.FIVE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.SIX, Suit.CLUBS), new Card(Rank.FOUR, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.THREE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.FOUR, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.SEVEN, Suit.CLUBS), new Card(Rank.FIVE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.SEVEN, Suit.CLUBS), new Card(Rank.THREE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.SIX, Suit.CLUBS), new Card(Rank.FIVE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.FIVE, Suit.CLUBS), new Card(Rank.THREE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.SIX, Suit.CLUBS), new Card(Rank.THREE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.FOUR, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.NINE, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.FOUR, Suit.CLUBS), new Card(Rank.THREE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.SEVEN, Suit.CLUBS), new Card(Rank.FOUR, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.SEVEN, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.FIVE, Suit.CLUBS), new Card(Rank.FOUR, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.SIX, Suit.CLUBS), new Card(Rank.FOUR, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.FIVE, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.SIX, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.FOUR, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.EIGHT, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.SEVEN, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.FIVE, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.SIX, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.THREE, Suit.CLUBS), new Card(Rank.DEUCE, Suit.CLUBS)));
        handRankings.add(new Hand(new Card(Rank.FOUR, Suit.CLUBS), new Card(Rank.THREE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.SEVEN, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.FIVE, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.SIX, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.FOUR, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
        handRankings.add(new Hand(new Card(Rank.THREE, Suit.CLUBS), new Card(Rank.DEUCE, Suit.DIAMONDS)));
    }

    public static ArrayList<Hand> getHandRankings() {
        if (handRankingInstance == null) {
            handRankingInstance = new HandRanking();
        }
        return HandRanking.handRankings;
    }

}
