package blackjack.domain.component;

import java.util.Collections;
import java.util.Stack;

public class Deck {
    private Stack<Card> deck;

    public Deck() {
        this.deck = new Stack<Card>();
    }

    public void add(Card card) {
        deck.add(card);
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }
    public Card draw(){
//        if (deck.size() < 0) {
//            throw new OutOfCardException();
//        }
        return deck.remove(0);
    }

    public String getFirstCard(){
        return deck.peek().showCardInfo();
    }

    public Integer getAllCardsNumber(){
        int sum = 0;
        for (Card c : deck){
            sum += (c.getNumber() > 10 ? 10 : c.getNumber());
        }
        return sum;
    }

    public void showAllCardsInfo(){
        for (Card c : deck){
            System.out.println(c.showCardInfo());
        }
    }
}

















