

import java.util.Random;
import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int guess = -2; //= keyboard.nextInt();
        boolean win = false;
        int guessCount = 0;
        Random numberPicker =  new Random();
        int answer = 0;
        while (answer == 0) {
            answer = numberPicker.nextInt();
        }

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
        while (!win && guessCount<3) {
            guess = keyboard.nextInt();
            if (guess == answer) {
                win = true;
                System.out.println("You won the Guessing Game!");
            }
            switch (guess) {
//                case (answer):
//                    win = true; // you got the right answer
//                    System.out.println("You won the Guessing Game!");
//                    break;
                case 0:
                    System.out.println("Oh you don't know how to play? Guess an int.");
                    //guess = keyboard.nextInt();
                    break;
                case -1:
                     guessCount = 5; //quit program
                    break;
                default:
                    System.out.println("Wrong answer!");
                    if (answer>guess) {
                        System.out.println("The answer is a little higher!");
                    } else {
                    System.out.println("The answer is a little lower!");
                }
                    //guess = keyboard.nextInt();
                guessCount++;
            }
        }
        if (guess != answer){
            System.out.println("You lost the Guessing Game.");
        }
        System.out.println("For testing purposes, the answer is: " + answer);



    }

}
