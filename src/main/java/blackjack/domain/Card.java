package blackjack.domain;

public class Card {
    private String suit;
    private String number;

    public Card(String suit, String number) {
        this.suit = suit;
        this.number = number;
    }

    public String showCardInfo() {
        return suit + number;
    }

    // 테스트 코드 작성 방법이 떠오르지 않아 추가하였으나, 추후 삭제
    public String getSuit() {
        return suit;
    }
}
