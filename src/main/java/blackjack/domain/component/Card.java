package blackjack.domain.component;

public class Card {
    private String suit;
    private Integer number;

    public Card(String suit, Integer number) {
        this.suit = suit;
        this.number = number;
    }

    public String showCardInfo() {
        return suit + " " + numToSuits();
    }

    private String numToSuits(){
        if (number.equals(11))
            return ("J");
        if (number.equals(12))
            return ("Q");
        if (number.equals(13))
            return ("Q");
        return number.toString();
    }

    public Integer getNumber() {
        return number;
    }
}
