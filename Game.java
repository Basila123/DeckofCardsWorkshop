package com.bridgelabzOops;

import java.util.*;

public class Game {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int n = s.nextInt();
        if ((n >= 2)&&(n<=4)) {
            Deck deck = new Deck();
            ArrayList<Card> cards = deck.deckOfCard();
            for (Card card : cards) {
                System.out.println(card);
            }
        } else {
            System.out.println("You cant play");
        }

    }
}


