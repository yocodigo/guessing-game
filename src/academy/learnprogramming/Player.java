package academy.learnprogramming;

public class Player {

    int number = 0;

    public void getNumber() {
        number = (int) (Math.random() * 10);
        System.out.println("My guess is " + number);
    }
}