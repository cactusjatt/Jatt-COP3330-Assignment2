/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex32;
import java.util.Scanner;
import java.util.Random;

public class NumberGuess{

    public static void guessingGame(){
        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Let's play Guess the Number!");

        char playAgain = 'y';

        while(playAgain == 'y' || playAgain == 'Y'){
            System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
            while(!in.hasNextInt()){
                System.out.println("Error. Please enter a number");
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                in.next();
            }
            int difficulty = in.nextInt();

            int guessMe = rand.nextInt((int) Math.pow(10, difficulty)) + 1;
            int numGuesses = 1;

            System.out.print("I have my number. What's your guess? ");
            while(!in.hasNextInt()){
                System.out.print("Error. Guesss again: ");
                numGuesses++;
                in.next();
            }
            int input = in.nextInt();

            while(input != guessMe){
                numGuesses++;

                if(input < guessMe){
                    System.out.print("Too low. Guess again: ");

                    while(!in.hasNextInt()){
                        System.out.print("Error. Guess again: ");
                        numGuesses++;
                    }
                    input = in.nextInt();
                }
                else if(input > guessMe){
                    System.out.print("Too high. Guess again: ");

                    while(!in.hasNextInt()){
                        System.out.print("Error. Guess again: ");
                        in.next();
                        numGuesses++;
                    }
                    input = in.nextInt();
                }
            }
            if(numGuesses == 1)
                System.out.println("You're a mind reader!");
            else
                System.out.println("You got it in " + numGuesses + " guesses!");

            System.out.print("\nDo you wish to play again (Y/N)? ");
            playAgain = in.next().charAt(0);
        }
        in.close();
    }

    public static void main(String[] args) {
        guessingGame();
    }
}