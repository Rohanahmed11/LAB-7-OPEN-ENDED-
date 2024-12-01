package Task2;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int numberToGuess = 4; 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess the number (1-5): ");
        int userGuess = scanner.nextInt();

        if (userGuess == numberToGuess) {
            System.out.println("Congratulations! ");
        } else {
            System.out.println("Sorry, correct number was " + numberToGuess);
        }
        
        scanner.close();
    }
}
