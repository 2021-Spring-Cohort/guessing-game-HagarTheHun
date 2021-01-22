import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int guess = keyboard.nextInt();
        if (guess == 7) {
            System.out.println("You won the Guessing Game!");
        } else {
            System.out.println("You are bad a guessing. You lost.");
        }
    }

}
