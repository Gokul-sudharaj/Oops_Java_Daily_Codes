import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println(" Welcome to the Quiz Game!\n");
        System.out.println("Q1: What is the capital of India?");
        System.out.println("a) Mumbai\nb) Delhi\nc) Chennai\nd) Kolkata");
        System.out.print("Your answer: ");
        char ans1 = sc.next().toLowerCase().charAt(0);
        if (ans1 == 'b') {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! Correct answer is b) Delhi\n");
        }
        System.out.println("Q2: 2 + 2 = ?");
        System.out.println("a) 3\nb) 4\nc) 5\nd) 6");
        System.out.print("Your answer: ");
        char ans2 = sc.next().toLowerCase().charAt(0);
        if (ans2 == 'b') {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! Correct answer is b) 4\n");
        }
        System.out.println("Q3: Which language is used for Android development?");
        System.out.println("a) Python\nb) Java\nc) C\nd) HTML");
        System.out.print("Your answer: ");
        char ans3 = sc.next().toLowerCase().charAt(0);
        if (ans3 == 'b') {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! Correct answer is b) Java\n");
        }
        System.out.println("Q4: Which planet is known as the Red Planet?");
        System.out.println("a) Earth\nb) Venus\nc) Mars\nd) Jupiter");
        System.out.print("Your answer: ");
        char ans4 = sc.next().toLowerCase().charAt(0);
        if (ans4 == 'c') {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! Correct answer is c) Mars\n");
        }
        System.out.println("Q5: Which data structure uses FIFO?");
        System.out.println("a) Stack\nb) Queue\nc) Tree\nd) Graph");
        System.out.print("Your answer: ");
        char ans5 = sc.next().toLowerCase().charAt(0);
        if (ans5 == 'b') {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! Correct answer is b) Queue\n");
        }
        System.out.println("🎯 Final Score: " + score + "/5");
        if (score == 5) {
            System.out.println(" Excellent!");
        } else if (score >= 3) {
            System.out.println(" Good Job!");
        } else {
            System.out.println(" Try Again!");
        }
    }
}
