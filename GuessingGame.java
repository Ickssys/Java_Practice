import java.util.*;
// import java.io.*;

public class GuessingGame {
    private static final int MAX = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        intro();
        System.out.println();
        int games = 0;
        int guesses = game(input);
        games++;
        int best = guesses;
        int totalGuesses = guesses;
        while (playAgain(input)) {
            System.out.println();
            guesses = game(input);
            if (guesses < best) {
                best = guesses;
            }
            totalGuesses += guesses;
            games++;
        }
        System.out.println();
        statistics(games, totalGuesses, best);
    }

    // intro method
    public static void intro() {
        System.out.println("This program allows you to play a guessing game.");
        System.out.println("I will think of a number between 1 and");
        System.out.println("100 and will allow you to guess until ");
        System.out.println("you get it. For each guess, I will tell you");
        System.out.println("whether the right answer is higher or lower");
        System.out.println("than your guess. ");
    }

    // play game method
    public static int game(Scanner input) {
        Random rand = new Random();
        System.out.println("I'm thinking of a number between 1 and " + MAX + "...");
        int number = rand.nextInt(MAX) + 1;
        // System.out.println(number);
        System.out.print("Your guess? ");
        int guess = input.nextInt();
        int guesses = 1;
        //checking whether number is equal to guess
        if (guess == number) {
            System.out.println("You got it right in " + guesses + " guess");
        } else { //number is not equal to guess, therefore we keep checking!
            if (guess > number) {
                System.out.println("It's lower.");
            } else if (guess < number) {
                System.out.println("It's higher.");
            }
            //looping till we get the right guess
            while (number != guess) {
                System.out.print("Your guess? ");
                guess = input.nextInt();
                guesses++;
                if (guess > number) {
                    System.out.println("It's lower.");
                } else if (guess < number) {
                    System.out.println("It's higher.");
                }
            }
            System.out.println("You got it right in " + guesses + " guesses");
        }
        return guesses;
    }

    // prompts user to play another game
    public static boolean playAgain(Scanner input) {
        System.out.print("Do you want to play a again? ");
        String playAgainYesorNo = input.next();
        return playAgainYesorNo.startsWith("y") || playAgainYesorNo.startsWith("Y");
    }

    // report statistics
    public static void statistics(int games, int guesses, int bestGame) {
        double avg = (double) guesses / games;
        System.out.println("Overall results: ");
        System.out.println("\t total games = " + games);
        System.out.println("\t total guesses = " + guesses);
        System.out.printf("\t guesses/games = %.1f", avg);
        System.out.println();
        System.out.println("\t best game = " + bestGame);
    }

}
