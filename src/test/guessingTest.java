package test;

import academy.learnprogramming.Player;
import org.junit.Assert;
import org.junit.Test;

public class guessingTest {

    @Test
    public void shouldReturnAnInstanceOfGetNumberMethod() {
        Player player = new Player();
        Assert.assertNotNull(player);
    }

    @Test
    public void shouldReturnSomeNumber() {
        Player player = new Player();
        int validNum = 0;
        Assert.assertEquals(validNum, player.number);
    }
}
