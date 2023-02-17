import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int range = 100; // Change this to set the range of the generated number.
        int generatedNumber = random.nextInt(range) + 1;
        int maxAttempts = 10; // Change this to set the maximum number of attempts.
        int attempts = 0;
        boolean isCorrect = false;
        
        System.out.println("Welcome to Guess The Number!");
        System.out.println("I have generated a number between 1 and " + range + ". Can you guess it in " + maxAttempts + " attempts?");
        
        while (attempts < maxAttempts && !isCorrect) {
            System.out.print("Attempt " + (attempts + 1) + ": Enter your guess: ");
            int guess = input.nextInt();
            attempts++;
            if (guess == generatedNumber) {
                isCorrect = true;
                System.out.println("Congratulations, you guessed the number in " + attempts + " attempts!");
            } else if (guess < generatedNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Your guess is too high. Try again.");
            }
        }
        
        if (!isCorrect) {
            System.out.println("Sorry, you did not guess the number in " + maxAttempts + " attempts.");
            System.out.println("The number was " + generatedNumber + ".");
        }
        
        input.close();
    }

}
