/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex37;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class PasswordGenerate {
    public static ArrayList<Character> lettersList() {
        ArrayList<Character> letters = new ArrayList<>();
        for(int i = 0; i < 26; i++) {
            letters.add((char) (97+i));
        }
        for(int i = 0; i < 26; i++) {
            letters.add((char) (65+i));
        }

        return letters;
    }

    public static ArrayList<Character> numbersList() {
        ArrayList<Character> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++) numbers.add((char) (48+i));

        return numbers;
    }

    public static ArrayList<Character> specialCharList() {
        ArrayList<Character> specialChars = new ArrayList<>();
        for(int i = 0; i < 15; i++) specialChars.add((char) (33+i));
        for(int i = 0; i < 7; i++) specialChars.add((char) (58+i));
        for(int i = 0; i < 6; i++) specialChars.add((char) (91+i));
        for(int i = 0; i < 4; i++) specialChars.add((char) (123+i));
        return specialChars;
    }

    public static ArrayList<Character> makePassword(int length, int numNumbers, int numSpecialChars) {
        ArrayList<Character> letters = lettersList();
        ArrayList<Character> numbers = numbersList();
        ArrayList<Character> specialChars = specialCharList();

        Random rand = new Random();
        ArrayList<Character> password = new ArrayList<>();

        int numNumbersInPassword = 0, numSpecialCharsInPassword = 0, numLetters = 0;
        for(int i = 0; i < (rand.nextInt(3) + length); i++) {
            int randomNum = rand.nextInt(3);
            if(numLetters < (numNumbersInPassword + numSpecialCharsInPassword) + 1) randomNum = 0;
            else if(numNumbersInPassword < numNumbers) randomNum = 1;
            else if(numSpecialCharsInPassword < numSpecialChars) randomNum = 2;
            if(randomNum == 0) {
                password.add(letters.get(rand.nextInt(52)));
                numLetters++;
            }
            else if(randomNum == 1) {
                password.add(numbers.get(rand.nextInt(10)));
                numNumbersInPassword++;
            }
            else {
                password.add(specialChars.get(rand.nextInt(specialChars.size())));
                numSpecialCharsInPassword++;
            }
        }

        return password;
    }

    public static void passwordShuffle(int length, ArrayList<Character> password) {
        Random rand = new Random();

        for(int i = 0; i < length; i++) {
            char temp = password.get(i);
            int randValue = rand.nextInt(length);
            password.set(i, password.get(randValue));
            password.set(randValue, temp);
        }
    }

    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        int length, numSpecialChars, numNumbers;
        System.out.print("What's the minimum length? ");
        length = in.nextInt();
        System.out.print("How many special characters? ");
        numSpecialChars = in.nextInt();
        System.out.print("How many numbers? ");
        numNumbers = in.nextInt();

        ArrayList<Character> password = makePassword(length, numNumbers, numSpecialChars);
        passwordShuffle(length, password);
        for(char c: password) System.out.print(c);

        in.close();
    }
}