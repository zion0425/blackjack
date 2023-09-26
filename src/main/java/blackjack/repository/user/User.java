package blackjack.repository.user;

import blackjack.repository.component.Card;

public interface User {
    void addCard(Card card);
    boolean isBust();
    void showAllCardsInfo();
}
