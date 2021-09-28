/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex31;
import java.util.Scanner;

public class Karvonen {
    public static void targetRateTable(int pulse, int age){
        System.out.println("Intensity    | Rate   ");
        System.out.println("-------------|--------");

        int percent = 50, rate;

        for(int i = 0; i < 9; i++){
            percent = percent + 5;
            rate = Math.round((((220 - age) - pulse) * ((float) percent/100)) + pulse);
            System.out.println(percent + "%          | " + rate + " bpm");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pulse, age;

        System.out.print("Resting Pulse: ");
        while(!in.hasNextInt()){
            System.out.println("Invalid input");
            System.out.print("Resting Pulse: ");
            in.next();
        }
        pulse = in.nextInt();

        System.out.print("Age: ");
        while(!in.hasNextInt()){
            System.out.println("Invalid input");
            System.out.print("Age: ");
            in.next();
        }
        age = in.nextInt();
        targetRateTable(pulse, age);

        in.close();
    }
}
