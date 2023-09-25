package blackjack.domain.user;

import blackjack.domain.component.Card;
import blackjack.domain.component.Deck;

import java.util.ArrayList;

public interface User {
    void addCard(Card card);
    boolean isBust();
    void showAllCardsInfo();
}
