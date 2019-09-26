package test;

import academy.learnprogramming.GuessingGame;
import academy.learnprogramming.Player;
import org.junit.Assert;
import org.junit.Test;

public class guessingTest {

//    @Test
//    public void shouldReturnAnInstanceOfGetNumberMethod() {
//        Player player = new Player();
//        Assert.assertNotNull(player);
//    }
//
    @Test
    public void shouldReturnSomeNumber() {
        Player player = new Player();
        GuessingGame game = new GuessingGame();
        int target = game.targetNum = 2;
        Assert.assertEquals(target, player.guessNumber());
    }


//    @Test
//    public void shouldReturnPlayerGuess() {
//        GuessingGame game = new GuessingGame();
//        Player player = new Player();
//        int credit = 5;
//        int targetNum = 5;
//        int score = 0;
//        Assert.assertEquals(1, game.getPlayerScore(credit, player, targetNum, score));
//    }
}
