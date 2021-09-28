/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex38;
import java.util.Scanner;

public class ValueFilter{
    public static int[] filterEvenNumbers(int[] numberArray){
        int[] evenNumberArray = new int[numberArray.length];
        for(int i = 0; i < numberArray.length; i++) evenNumberArray[i] = 1;
        int j = 0;

        for(int num: numberArray) {
            if(num % 2 == 0) {
                evenNumberArray[j] = num;
                j++;
            }
        }

        return evenNumberArray;
    }

    public static void main( String[] args ){

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String numbersString = in.nextLine();

        String[] numbersStringFixed = numbersString.split(" ");
        int[] numberArray = new int[numbersStringFixed.length];
        for(int i = 0; i < numbersStringFixed.length; i++) numberArray[i] = Integer.parseInt(numbersStringFixed[i]);

        int[] evenNumberArray = filterEvenNumbers(numberArray);
        System.out.print("The even numbers are");
        for(int num: evenNumberArray) if(num != 1) System.out.print(" " + num);
        System.out.println(".");

        in.close();
    }
}