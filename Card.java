package com.bridgelabzOops;

import java.util.*;

public class Card {
    private final String suit;
    private final String rank;

    //constructor
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return  suit + ":" + rank ;
    }

}

