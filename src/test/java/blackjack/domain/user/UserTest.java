package blackjack.domain.user;

import blackjack.domain.component.Card;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    Player player;

    @Test
    @DisplayName("Player 덱에 1 2 를 넣고 isBust를 체크해서 false면 성공")
    void validatePlayerNotBust1(){
        player = new Player();
        player.addCard(new Card("club", 1));
        player.addCard(new Card("club", 2));
        Assertions.assertEquals(player.isBust(), false);
    }

    @Test
    @DisplayName("Player 덱에 11 12 를 넣고 isBust를 체크해서 false면 성공")
    void validatePlayerNotBust2(){
        player = new Player();
        player.addCard(new Card("club", 11));
        player.addCard(new Card("club", 12));
        Assertions.assertEquals(player.isBust(), false);
    }

    @Test
    @DisplayName("Player 덱에 10 10 10 를 넣고 isBust를 체크해서 true면 성공")
    void validatePlayerBust(){
        player = new Player();
        player.addCard(new Card("club", 10));
        player.addCard(new Card("club", 10));
        player.addCard(new Card("club", 10));
        Assertions.assertEquals(player.isBust(), true);
    }

    @Test
    @DisplayName("Card의 맨 첫 번째 카드 보기")
    void peekPlayerTopCard(){
        player = new Player();
        player.addCard(new Card("club", 9));
        player.addCard(new Card("club", 10));
        player.addCard(new Card("club", 10));
        player.showFirstCard();
    }
}
