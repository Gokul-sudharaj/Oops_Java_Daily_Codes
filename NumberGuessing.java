import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random R = new Random();

        int target = R.nextInt(100) + 1;
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game");
        System.out.println("Guess the Number between 1 - 100");

        while (true) {
            System.out.print("Enter your guess: "); 
            
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                sc.next();
                continue;
            }

            guess = sc.nextInt();
            attempts++;

            if (guess > target) {
                System.out.println("The value is too High!");
            } else if (guess < target) {
                System.out.println("The value is too Low!");
            } else {
                System.out.println("You Win! Attempts: " + attempts);
                break;
            }
        }
    }
}
