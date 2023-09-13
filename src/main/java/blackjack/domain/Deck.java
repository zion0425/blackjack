package blackjack.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Deck {

    private static final int DECK_MAX_COUNT = 6;
    private static final int SUIT_SIZE = 4;
    private static final int NUMBER_SIZE = 13;
    private static final String[] suits = {"spade", "diamond", "heart", "club"};
    private static final String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};
    private Stack<Card> deck = new Stack<>();

    public Deck() {
        initDeck();
    }

    private void initDeck(){
        for (int j = 0; j < DECK_MAX_COUNT; j++) {
            for (int i = 0; i < SUIT_SIZE; i++) {
                for (int k = 0; k < NUMBER_SIZE; k++) {
                    deck.add(new Card(suits[i], numbers[k]));
                }
            }
        }

    }

    private void deckShuffle(){
        Collections.shuffle(deck);
    }

    public Stack<Card> getDeck() {
        return deck;
    }
}
