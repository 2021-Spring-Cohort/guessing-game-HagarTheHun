

import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int guess; //= keyboard.nextInt();
        boolean win = false;
        int guessCount = 0;

//        while (!win) {
//            if (guessCount>1) {
//                System.out.println("Game over!");
//                break;
//            }
//            if (guess == 7) {
//                System.out.println("You won the Guessing Game!");
//                win = true;
//            } else if( guess == 0) {
//                System.out.println("Oh you don't know how to play? Guess a number 1-10.");
//                guessCount--;
//                guess = keyboard.nextInt();
//                 There is a error here, if you guess wrong first and then guess 0 twice,
//                 you can get 2 more guesses.  Probably alternate between guess and 0 forever.
//            } else {
//                System.out.println("You are bad a guessing. Try again.");
//                guess = keyboard.nextInt();
//            }
//            guessCount++;
        while (!win && guessCount<2) {
            guess = keyboard.nextInt();
            switch (guess) {
                case 7:
                    win = true; // you got the right answer
                    System.out.println("You won the Guessing Game!");
                    break;
                case 0:
                    System.out.println("Oh you don't know how to play? Guess an int.");
                    //guess = keyboard.nextInt();
                    break;
                case -1:
                     guessCount = 5; //quit program
                    break;
                default:
                    System.out.println("Wrong answer!");
                    if (7>guess) {
                        System.out.println("The answer is a little higher!");
                    } else {
                    System.out.println("The answer is a little lower!");
                }
                    //guess = keyboard.nextInt();
                guessCount++;
            }
        }



    }

}
