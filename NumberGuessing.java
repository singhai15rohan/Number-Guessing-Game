import java.util.Random;
import java.util.Scanner;


public class NumberGuessing {

    static int count = 0;
    static void startGame() {
        try (Scanner sc = new Scanner(System.in)) {
            Random random = new Random();
            int target = random.nextInt(100) + 1;
            // System.out.println(target);
            System.out.println("Guess a number between 1 to 100 : ");
            int input = sc.nextInt();
            if(input < 0)
            {
                System.out.println("Invalid Input!");
            }
            int tries = 5;
            while (tries-- > 1) {
                if (input == target) {
                    System.out.println("Bingo! You Won with " + tries + " tries left");
                    count++;
                    break;
                } else {
                    if (input < target) {
                        System.out.println("Your guess is too low!");
                    } else if (input > target) {
                        System.out.println("Your guess is too high!");
                    }
                    System.out.println("Tries left : " + tries);
                    input = sc.nextInt();
                    if(tries <= 1)
                    {
                        System.out.println("Game Over ");
                    }
                }
            }
        }
    }

    static void Instructions() {
        System.out.println("\nInstructions for the game are as follows:\n");
        System.out.println(
                "1. Guess a number between 1 to 100 which has been pre determined by the computer. \n2. You have only 5 tries");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(target);
        System.out.println("Number Guessing Game: ");
        System.out.println("Enter 1 : Instructions \nEnter 2 : Game");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Instructions();
                break;
            case 2:
                startGame();

                System.out.println("Want to play more ? enter  1 for yes and 2 for no");
                int c = sc.nextInt();
                if (c == 1) {
                    startGame();
                }
                if(c == 2)
                {
                    System.out.println("Your Score : "+count+"\nThank you for playing the game !");
                }
        }
        sc.close();
    }
}