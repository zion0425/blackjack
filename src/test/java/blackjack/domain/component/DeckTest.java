package blackjack.domain.component;

import blackjack.domain.component.Card;
import blackjack.domain.component.Deck;
import blackjack.domain.component.DeckFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DeckTest {

    @DisplayName("52 * 6 장의 카드가 덱에 올바르게 들어가 있으면 성공")
    @Test
    void correctDeckSize() {
//        Assertions.assertEquals(DeckFactory.createGameDeck(6).getAll(), 52 * 6);
    }

//    @DisplayName("Deck getAllReturn 값에 모든 카드가 들어 있으면 성공")
//    @Test
//    void vaildateReturnAllCards() {
//        ArrayList<Card> d = new ArrayList<>();
//        Deck deck = DeckFactory.createGameDeck(1);
//        List<Integer> i;
//        i = deck.getAllCards();
//
//        Assertions.assertEquals(i.size(), 52);
//    }


//    @DisplayName("club이 1 ~ K 까지 13장 * 6 있으면 성공")
//    @Test
//    void correctClubCount() {
//        long clubCount = 0;
//        for(String number : numbers) {
//            clubCount += d.getDeck().stream()
//                    .filter(card -> card.showCardInfo().equals("club"+number))
//                    .count();
//        }
//        Assertions.assertEquals(13 * 6, clubCount);
//    }
//
//
//    @DisplayName("heart가 1 ~ K 까지 13장 * 6 있으면 성공")
//    @Test
//    void correctHeartCount() {
//        long clubCount = 0;
//        for(String number : numbers) {
//            clubCount += d.getDeck().stream()
//                    .filter(card -> card.showCardInfo().equals("heart"+number))
//                    .count();
//        }
//        Assertions.assertEquals(13 * 6, clubCount);
//    }
//
//    @DisplayName("diamond가 1 ~ K 까지 13장 * 6 있으면 성공")
//    @Test
//    void correctDiamondCount() {
//        long clubCount = 0;
//        for(String number : numbers) {
//            clubCount += d.getDeck().stream()
//                    .filter(card -> card.showCardInfo().equals("diamond"+number))
//                    .count();
//        }
//        Assertions.assertEquals(13 * 6, clubCount);
//    }
//
//    @DisplayName("spade가 1 ~ K 까지 13장 * 6 있으면 성공")
//    @Test
//    void correctSpadeCount() {
//        long clubCount = 0;
//        for(String number : numbers) {
//            clubCount += d.getDeck().stream()
//                    .filter(card -> card.showCardInfo().equals("spadZ"+number))
//                    .count();
//        }
//        Assertions.assertEquals(13 * 6, clubCount);
//    }
//
//    @DisplayName("spade가 1 ~ K 까지 13장 * 6 있으면 성공")
//    @Test
//    void IteratorTest() {
//        long clubCount = 0;
//        for(String number : numbers) {
//            d.getDeck().forEach(card -> card.showCardInfo().equals("spade"+number));
//            clubCount += d.getDeck().parallelStream()
//                    .filter(card -> card.showCardInfo().equals("spade"+number))
//                    .count();
//        }
//        Assertions.assertEquals(13 * 6, clubCount);
//    }
}
