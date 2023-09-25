package blackjack.domain.component;

import blackjack.domain.component.Card;
import blackjack.domain.component.Deck;

import java.util.Collections;

public class DeckFactory {
    private static final String[] suits = {"spade", "diamond", "heart", "club"};
    private static final Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 ,13};

    public static Deck createUserDeck(){
        Deck deck = new Deck();
        return deck;
    }

    public static Deck createGameDeck(int PackCount) {
        Deck deck = new Deck();
        for(int i = 0; i < PackCount; i ++) {
            createOnePack(deck);
        }
        deck.shuffle();
        return deck;
    }

    private static void createOnePack(Deck deck){
        for (String suit : suits) {
            for (Integer number : numbers) {
                deck.add(new Card(suit, number));
            }
        }
    }
}
