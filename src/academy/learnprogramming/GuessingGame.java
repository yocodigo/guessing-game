package academy.learnprogramming;

public class GuessingGame {

    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    int p1Score = 0;
    int p2Score = 0;
    int p3Score = 0;

    public void StartGame(int credits) {

        for(int i = 0; i <= credits; i++) {
            int targetNum = (int) (Math.random() * 10);
            p1.getNumber();
            p2.getNumber();
            p3.getNumber();

            boolean p1isGuess = false;
            boolean p2isGuess = false;
            boolean p3isGuess = false;

            if (targetNum == p1.number) {
                p1Score++;
            }

            if (targetNum == p2.number) {
                p2Score++;
            }

            if (targetNum == p3.number) {
                p3Score++;
            }
            System.out.print("target number is " + targetNum + " | ");
            System.out.print("Player 1: " + p1.number + " | ");
            System.out.print("Player 2: " + p2.number + " | ");
            System.out.println("Player 3: " + p3.number);
            System.out.println();

//            if (p1isGuess == true || p2isGuess == true || p3isGuess == true) {
//                System.out.println("target number is " + targetNum);
//                System.out.println("Player 1 guess is " + p1.number + " which is " + p1isGuess);
//                System.out.println("Player 2 guess is " + p2.number + " which is " + p2isGuess);
//                System.out.println("Player 3 guess is " + p3.number + " which is " + p3isGuess);
//                System.out.println("At least one of the players guessed correctly. Game over!");
//                break;
//            } else {
//                System.out.println("None of the players guessed correctly, play again");
//            }
        }
        p1.setScore(p1Score);
        p2.setScore(p2Score);
        p3.setScore(p3Score);

        System.out.print("-----------------------------------Player 1 score: " + p1.score + " || ");
        System.out.print("Player 2 score: " + p2.score + " || ");
        System.out.println("Player 3 score: " + p3.score + "-----------------------------------");
    }
}