package academy.learnprogramming;

public class Player {

    public int number = 0;
    int score = 0;

    public void getNumber() {
        number = (int) (Math.random() * 10);
    }

    public void setScore(int points) {
        score = points;
    }

}