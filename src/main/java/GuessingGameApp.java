

import java.util.Random;
import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int guess = -2;
        boolean win = false;
        int guessCount = 0;
        Random numberPicker =  new Random();
        int answer = 0;
        while (answer == 0) {
            answer = numberPicker.nextInt();
        }


        while (!win && guessCount<3) {
            guess = keyboard.nextInt();
            if (guess == answer) {
                win = true;
                System.out.println("You won the Guessing Game!");
            }
            switch (guess) {
                case 0:
                    System.out.println("Oh you don't know how to play? Guess an int.");
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
                guessCount++;
            }
        }
        if (guess != answer){
            System.out.println("You lost the Guessing Game.");
        }
        System.out.println("For testing purposes, the answer is: " + answer);



    }

}
