package blackjack.repository.user;

import blackjack.repository.component.Card;
import blackjack.repository.component.Deck;
import blackjack.repository.component.DeckFactory;

public class Dealer implements User{

    Deck dealerDeck;

    public Dealer(){
        dealerDeck = DeckFactory.createUserDeck();
    }
    @Override
    public void addCard(Card card) {
        dealerDeck.add(card);
        if (isBust())
            System.out.println("사망");
    }

    @Override
    public boolean isBust() {
        return (getAllCardNumbers() > 21 ? true : false);
    }

    public String showFirstCard(){
        return dealerDeck.getFirstCard();
    }

    @Override
    public void showAllCardsInfo() {
        dealerDeck.showAllCardsInfo();
    }

    public Integer getAllCardNumbers(){
        return dealerDeck.getAllCardsNumber();
    }
}
