package com.vibrato.sngdomination;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Created by PC on 5/28/2015.
 */
public class VillainRangeFinder {
    private double rangePercentage; // what percentile of hands exist in this range
    private ArrayList<Hand> handsInRange; // exhaustive list of all possible hands in this range

    private final int TOTAL_STARTING_POSSIBILITIES = 1326; // 52 choose 2
    public VillainRangeFinder(double rangePercentage) {
        //
        generateHandMap();
    }

    private void generateHandMap() {

    }




}

