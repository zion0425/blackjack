package blackjack.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DeckTest {
    Deck d = new Deck();
    private  final String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "k"};

    @DisplayName("52 * 6 장의 카드가 덱에 올바르게 들어가 있으면 성공")
    @Test
    void correctDeckSize() {
        Assertions.assertEquals(d.getDeck().size(), 52 * 6);
    }

    @DisplayName("club이 1 ~ K 까지 13장 * 6 있으면 성공")
    @Test
    void correctClubCount() {
        long clubCount = 0;
        for(String number : numbers) {
            clubCount += d.getDeck().stream()
                    .filter(card -> card.showCardInfo().equals("club"+number))
                    .count();
        }
        Assertions.assertEquals(13 * 6, clubCount);
    }


    @DisplayName("heart가 1 ~ K 까지 13장 * 6 있으면 성공")
    @Test
    void correctHeartCount() {
        long clubCount = 0;
        for(String number : numbers) {
            clubCount += d.getDeck().stream()
                    .filter(card -> card.showCardInfo().equals("heart"+number))
                    .count();
        }
        Assertions.assertEquals(13 * 6, clubCount);
    }

    @DisplayName("diamond가 1 ~ K 까지 13장 * 6 있으면 성공")
    @Test
    void correctDiamondCount() {
        long clubCount = 0;
        for(String number : numbers) {
            clubCount += d.getDeck().stream()
                    .filter(card -> card.showCardInfo().equals("diamond"+number))
                    .count();
        }
        Assertions.assertEquals(13 * 6, clubCount);
    }

    @DisplayName("spade가 1 ~ K 까지 13장 * 6 있으면 성공")
    @Test
    void correctSpadeCount() {
        long clubCount = 0;
        for(String number : numbers) {
            clubCount += d.getDeck().stream()
                    .filter(card -> card.showCardInfo().equals("spade"+number))
                    .count();
        }
        Assertions.assertEquals(13 * 6, clubCount);
    }
}
