import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100
        int randomNumber = random.nextInt(100) + 1;
        int maxAttempts = 5; // Maximum number of attempts allowed
        int attempts = 0;
        int userGuess = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Try to guess the number between 1 and 100.");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                break; // Exit the loop if the guess is correct
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        // Check if the user couldn't guess the number within the allowed attempts
        if (attempts == maxAttempts && userGuess != randomNumber) {
            System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + randomNumber + ".");
        }

        // Close the scanner
        scanner.close();
    }
}
