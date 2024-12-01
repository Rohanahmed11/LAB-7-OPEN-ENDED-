package Task2;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int numberToGuess = 4; 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess the number (1-10): ");
        int userGuess = scanner.nextInt();

        if (userGuess == numberToGuess) {
            System.out.println("Congratulations! You guessed it right!");
        } else {
            System.out.println("Sorry, the correct number was " + numberToGuess);
        }
        
        scanner.close();
    }
}
