package academy.learnprogramming;

public class GuessingGame {

    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    public void StartGame() {
        p1.getNumber();
        System.out.println(p1.number);
    }
}