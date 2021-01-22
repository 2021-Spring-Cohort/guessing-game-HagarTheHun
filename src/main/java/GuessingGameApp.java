

import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int guess = keyboard.nextInt();
        boolean win = false;
        while (!win) {
            if (guess == 7) {
                System.out.println("You won the Guessing Game!");
                win = true;
            } else if( guess == 0) {
                System.out.println("Oh you don't know how to play? Guess a number 1-10.");
            } else {
                System.out.println("You are bad a guessing. You lost.");
            }
        }

    }

}
