package academy.learnprogramming;

public class GuessingGame {

    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    int p1Score = 0;
    int p2Score = 0;
    int p3Score = 0;
    int playerScore = 0;
    public int targetNum = 0;

    public void StartGame(int credits) {


        p1Score = getPlayerScore(credits, p1, targetNum);
//        p2Score = getPlayerScore(credits, p2, targetNum);
//        p3Score = getPlayerScore(credits, p3, targetNum);

        System.out.print("-----------------------------------Player 1 score: " + p1.score + " || ");
        System.out.print("Player 2 score: " + p2.score + " || ");
        System.out.println("Player 3 score: " + p3.score + "-----------------------------------");
    }

    public int getPlayerScore(int credits, Player player, int targetNum) {
        if(credits < 0 || targetNum < 0) {
            return -1;
        }

        for(int i = 0; i <= credits; i++) {

            if (targetNum == player.guessNumber()) {
                player.setScore(1);
            }
        }
        return player.score;
    }
}