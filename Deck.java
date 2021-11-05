package com.bridgelabzOops;

import java.util.*;

public class Deck {
    private static final String suits[] = {"club", "diamond", "heart", "spade"};
    private static final String ranks[] = {"ace","1","2","3","4","5","6","7","8","9","jack", "queen", "king"};
    private static final ArrayList<Card> cards = new ArrayList<Card>();

    public ArrayList deckOfCard() {
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cards.add(new Card(suits[i], ranks[j]));
            }
        }
        return cards;
    }

}