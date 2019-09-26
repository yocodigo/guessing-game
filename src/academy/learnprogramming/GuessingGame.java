package academy.learnprogramming;

public class GuessingGame {

    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    int p1Score = 0;
    int p2Score = 0;
    int p3Score = 0;
    int playerScore = 0;
//    public int targetNum = (int) (Math.random() * 10);
    public int targetNum = 0;

    public void StartGame(int credits) {


        p1Score = getPlayerScore(credits, p1, targetNum, playerScore);
//        p2Score = getPlayerScore(credits, p2, targetNum);
//        p3Score = getPlayerScore(credits, p3, targetNum);

        System.out.print("-----------------------------------Player 1 score: " + p1.score + " || ");
        System.out.print("Player 2 score: " + p2.score + " || ");
        System.out.println("Player 3 score: " + p3.score + "-----------------------------------");
    }

    public int getPlayerScore(int credits, Player player, int targetNum, int playerScore) {
        for(int i = 0; i <= credits; i++) {


//            p2.getNumber();
//            p3.getNumber();

            if (targetNum == player.guessNumber()) {
                playerScore++;
            }
//
//            if (targetNum == p2.number) {
//                p2Score++;
//            }
//
//            if (targetNum == p3.number) {
//                p3Score++;
//            }
//            System.out.print("target number is " + targetNum + " | ");
//            System.out.print("Player 1: " + p1.number + " | ");
//            System.out.print("Player 2: " + p2.number + " | ");
//            System.out.println("Player 3: " + p3.number);
//            System.out.println();
        }
        return playerScore;
    }
}