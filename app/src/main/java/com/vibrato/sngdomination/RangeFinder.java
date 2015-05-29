package com.vibrato.sngdomination;

import java.util.ArrayList;

/**
 * Created by PC on 5/28/2015.
 */
public class RangeFinder {
    public RangeFinder() {
        // this object is just a convenient way to reference the RangeFinder function (it's a FUNCTION. and a method)
    }
    private static final int TOTAL_POSSIBLE_HANDS = 1326; // 52 choose 2. no omaha support ;)
    private static final int SUITED_COMBINATIONS = 4; // 4 suits... duh
    private static final int OFFSUIT_COMBINATIONS = 12; // 4 choose 2 times two possibilities for each combination
    private static final int PAIRED_COMBINATIONS = 6;

    private int numberOfHandsInRange;
    private ArrayList<Hand> handsInRange;

    // Find range returns the set of hands which are in the top specified percentile of hands according to HandRanking
    public ArrayList<Hand> findRange(double percentile) {
        // uses the global config for what hand ranking to use
        ArrayList<Hand> completeRanking = HandRanking.getHandRankings();
        this.handsInRange = new ArrayList<Hand>();
        this.numberOfHandsInRange = (int)Math.ceil(percentile * TOTAL_POSSIBLE_HANDS / 100);

        for (int i = 0; handsInRange.size() < numberOfHandsInRange; i++) {
            Hand includedHand = completeRanking.get(i);
            if(includedHand.isPocketPair()) {
                this.addPairToRange(includedHand);
            } else if (includedHand.isSuited()) {
                this.addSuitedToRange(includedHand);
            } else {
                this.addOffsuitToRange(includedHand);
            }
        }

        return this.handsInRange;
    }

    private void addPairToRange (Hand pair) {
        Card card = pair.getCard1();
        //this.addHandToRange(new Hand(new Card(card.getRank()), Suit.CLUBS), new Card())
    }

    private void addSuitedToRange (Hand suited) {

    }

    private void addOffsuitToRange (Hand offsuit) {

    }

    private boolean addHandToRange(Hand hand) {
        if(this.handsInRange.size() < numberOfHandsInRange) {
            this.handsInRange.add(hand);
            return true;
        } else {
            return false;
        }
    }

    private int combosForHand(Hand hand) {
        if (hand.isPocketPair()) {
            return PAIRED_COMBINATIONS;
        } else if (hand.isSuited()) {
            return SUITED_COMBINATIONS;
        } else {
            return OFFSUIT_COMBINATIONS;
        }
    }
}
