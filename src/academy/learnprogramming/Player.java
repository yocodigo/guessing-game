package academy.learnprogramming;

public class Player {

    int score = 0;

    public int guessNumber() {
        int number = 7;//(int) (Math.random() * 10);
        return number;
    }

    public int setScore(int points) {
        score += points;
        return score;
    }

}