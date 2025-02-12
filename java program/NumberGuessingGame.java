import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int min = 1, max = 100;  // Define the range
        int numberToGuess = random.nextInt(max - min + 1) + min; // Generate random number
        int attempts = 5; // Set the maximum number of attempts
        int guess;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have chosen a number between " + min + " and " + max + ".");
        System.out.println("You have " + attempts + " attempts to guess it.");
        
        // Loop to take user input
        for (int i = 1; i <= attempts; i++) {
            System.out.print("Attempt " + i + ": Enter your guess: ");
            guess = scanner.nextInt();
            
            if (guess == numberToGuess) {
                System.out.println("Congratulations! You guessed the correct number: " + numberToGuess);
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
            
            if (i == attempts) {
                System.out.println("Sorry! You've used all attempts. The correct number was: " + numberToGuess);
            }
        }
        
        scanner.close(); // Close scanner to prevent resource leaks
    }
}