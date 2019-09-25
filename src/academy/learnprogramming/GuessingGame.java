package academy.learnprogramming;

public class GuessingGame {

    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();

    public void StartGame() {
//        p1.getNumber();
//        System.out.println(p1.number);
        int targetNum = (int) (Math.random() * 10);
        p1.getNumber();
        p2.getNumber();
        p3.getNumber();

        boolean p1isGuess = false;
        boolean p2isGuess = false;
        boolean p3isGuess = false;

        System.out.println("target number is " + targetNum);
        System.out.println("p1 number is " + p1.number);
        System.out.println("p2 number is " + p2.number);
        System.out.println("p3 number is " + p3.number);

//        if(targetNum == p1.number){
//            p1isGuess = true;
//        }
//
//        if(targetNum == p2.number){
//            p2isGuess = true;
//        }
//
//        if(targetNum == p3.number){
//            p3isGuess = true;
//        }

    }
}