package com.bridgelabzOops;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Deck deck = new Deck();
        ArrayList<Card> cards = deck.deckOfCard();
        for (Card card : cards) {
            System.out.println(card);
        }

    }

}


