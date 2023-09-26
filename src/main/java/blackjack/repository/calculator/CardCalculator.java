package blackjack.repository.calculator;

import blackjack.repository.component.Card;

public class CardCalculator {
    public String numToSuits(Card card){
        if (card.getNumber() == 11)
                return ("J");
        return (card.getNumber() == 12 ? "Q" : "K");
    }
}
