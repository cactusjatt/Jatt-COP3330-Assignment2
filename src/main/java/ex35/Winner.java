/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex35;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Winner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> namesList = new ArrayList<>();

        System.out.print("Enter a name: ");
        String s = in.nextLine();

        while(!s.isEmpty()){
            namesList.add(s);
            System.out.print("Enter a name: ");
            s = in.nextLine();
        }

        Random rand = new Random();
        System.out.println("The winner is..." + namesList.get(rand.nextInt(namesList.size())));

        in.close();
    }
}