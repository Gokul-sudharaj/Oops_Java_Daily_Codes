package Final.com;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String choice;
        System.out.println("Welcome to Dice Game");
        do {
            int dice = random.nextInt(6) + 1;
            System.out.println("You rolled: " + dice);
            System.out.print("Roll again? (yes/no): ");
            choice = sc.next().toLowerCase();
            while (!choice.equals("yes") && !choice.equals("no")) {
                System.out.print("Invalid input Please enter yes or no: ");
                choice = sc.next().toLowerCase();
            }
        } while (choice.equals("yes"));
        System.out.println("Thank you for playing");
    }
}
