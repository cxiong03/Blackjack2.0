package com.codewithchang;

public class Main {

    public static void main(String[] args) {
        Deck myDeck = new StandardDeck();
        myDeck.shuffle();
        System.out.println(myDeck.draw().displayFace());
        System.out.println(myDeck.draw().displayFace());
        System.out.println(myDeck.draw().displayFace());
        System.out.println(myDeck.draw().displayFace());
    }
}
