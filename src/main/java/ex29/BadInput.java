/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex29;
import java.util.Scanner;

class BadInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String values;
        System.out.print("What is the rate of return? ");
        values = in.nextLine();

        while(values.length() != 1 || values.charAt(0) == '0' || !Character.isDigit(values.charAt(0))){
            if(values.charAt(0) != '0')
                System.out.println("Sorry. That's not a valid input.");

            else
                System.out.println("Sorry. 0 isn't a valid input");
            System.out.print("What is the rate of return? ");
            values = in.nextLine();
        }

        int r = Integer.parseInt(values);
        System.out.println("It will take " + (72/r) + " years to double your initial investment.");

        in.close();
    }
}