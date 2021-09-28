/*
 *  UCF COP3330 Fall 2021 Exercise 28 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex28;
import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        int i, n = 0, s = 0;

        for(i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();

            s += n;
        }
        System.out.println("The total is " + s);
    }
}