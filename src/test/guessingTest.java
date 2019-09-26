package test;

import academy.learnprogramming.GuessingGame;
import academy.learnprogramming.Player;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class guessingTest {

//    @Test
//    public void shouldReturnAnInstanceOfGetNumberMethod() {
//        Player player = new Player();
//        Assert.assertNotNull(player);
//    }
//
    @Ignore
    @Test
    public void shouldReturnSomeNumber() {
        Player player = new Player();
        GuessingGame game = new GuessingGame();
        int target = game.targetNum = 2;
        Assert.assertEquals(target, player.guessNumber());
    }

    @Ignore
    @Test
    public void shouldReturnCorrectPlayerScore() {
        GuessingGame game = new GuessingGame();
        Player player = new Player();
        int credit = 8;
        int targetNum = 7;
        Assert.assertEquals(9, game.getPlayerScore(credit, player, targetNum));
    }

    @Ignore @Test
    public void shouldReturnNegativeOneIfCreditIsLessThanZero() {
        GuessingGame game = new GuessingGame();
        Player player = new Player();
        int credit = -1;
        int targetNum = 7;
        Assert.assertEquals(-1, game.getPlayerScore(credit, player, targetNum));
    }

    @Test
    public void shouldReturnNegativeOneIfTargetIsLessThanZero() {
        GuessingGame game = new GuessingGame();
        Player player = new Player();
        int credit = 6;
        int targetNum = -7;
        Assert.assertEquals(-1, game.getPlayerScore(credit, player, targetNum));
    }
}
