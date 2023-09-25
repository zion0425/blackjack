package blackjack.service;

import blackjack.domain.component.Card;
import blackjack.domain.component.Deck;
import blackjack.domain.component.DeckFactory;
import blackjack.domain.user.Dealer;
import blackjack.domain.user.Player;
import blackjack.domain.user.User;

import java.util.Scanner;
import java.util.concurrent.Delayed;

public class GameService {
    public static void gameStart(){
        printString("6팩으로 구성된 게임 덱을 세팅합니다.");
        Deck gameDeck = DeckFactory.createGameDeck(6);
        Dealer dealer = new Dealer();
        Player player = new Player();

        printString("게임을 시작합니다.");
        dealer.addCard(gameDeck.draw());
        dealer.addCard(gameDeck.draw());

        player.addCard(gameDeck.draw());
        player.addCard(gameDeck.draw());
        printString("딜러의 첫 번째 카드 : " + dealer.showFirstCard());

        printString("당신의 모든 카드 : ");
        player.showAllCardsInfo();

        printString("Hit 1, Stand 2, DoubleDown 3");
        Scanner sca = new Scanner(System.in);
        while (sca.nextInt() == 1) {
            player.addCard(gameDeck.draw());
            player.showFirstCard();
        }
        printString("딜러의 턴");
        while (dealer.getAllCardNumbers() < 17){
            dealer.addCard(gameDeck.draw());
            printString("딜러의 모든 카드");
            dealer.showAllCardsInfo();
        }
        printString("끝");
        if (dealer.getAllCardNumbers() > player.getAllCardNumbers()){
            printString("딜러 승");
        }
        if (dealer.getAllCardNumbers() < player.getAllCardNumbers()){
            printString("플레이어 승");
        }
        if (dealer.getAllCardNumbers() == player.getAllCardNumbers()){
            printString("비김");
        }
    }
//    private static void userInput(){
//
//    }

//    private static void hit(){
//    }

//    private static void stand(){
//
//    }

    private static void printString(String str){
        System.out.println(str);
    }
}
