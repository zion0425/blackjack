package blackjack.domain.user;

import blackjack.domain.component.Card;
import blackjack.domain.component.Deck;
import blackjack.domain.component.DeckFactory;

public class Player implements User{
    Deck playerDeck;

    public Player(){
        playerDeck = DeckFactory.createUserDeck();
    }

    @Override
    public void addCard(Card card) {
        playerDeck.add(card);
        if (isBust())
            System.out.println("사망");
    }
    public void showFirstCard(){
        System.out.println(playerDeck.getFirstCard());
    }
    @Override
    public boolean isBust() {
        return (getAllCardNumbers() > 21 ? true : false);
    }

    @Override
    public void showAllCardsInfo() {
        playerDeck.showAllCardsInfo();
    }

    public Integer getAllCardNumbers(){
        return playerDeck.getAllCardsNumber();
    }
}
