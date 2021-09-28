/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex36;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class Statistics {
    public static ArrayList<Integer> readValues() {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter a number: ");
        String input = in.nextLine();

        while(!input.equals("done")) {
            boolean check = true;
            while (input.isEmpty() || !Character.isDigit(input.charAt(0))) {
                System.out.println("Input invalid.");
                System.out.print("Enter a number: ");
                input = in.nextLine();
                if (input.equals("done")) {
                    check = false;
                    break;
                }
            }
            if(!check) break;

            numbers.add(Integer.parseInt(input));

            System.out.print("Enter a number: ");
            input = in.nextLine();
        }

        in.close();

        return numbers;
    }

    public static float average(ArrayList<Integer> numbers) {
        int total = 0;
        for(Integer nm : numbers) total = total + nm;

        return (float) total / numbers.size();
    }

    public static int min(ArrayList<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for(Integer nm : numbers) if(min > nm) min = nm;
        return min;
    }

    public static int max(ArrayList<Integer> numbers) {
        int max = 0;
        for(Integer nm : numbers) if(max < nm) max = nm;
        return max;
    }

    public static double std(ArrayList<Integer> numbers) {
        double value = 0;
        for(int i = 0; i < numbers.size(); i++) {
            value = value + Math.pow(numbers.get(i) - average(numbers), 2);
        }
        return Math.sqrt(value / numbers.size());
    }


    public static void main( String[] args )
    {
        ArrayList<Integer> numbers= readValues();

        System.out.print("Numbers: " + numbers.get(0));
        for(int i = 1; i < numbers.size(); i++) {
            System.out.print(", " + numbers.get(i));
        }

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\nThe average is " + average(numbers));
        System.out.println("The minimum is " + min(numbers));
        System.out.println("The maximum is " + max(numbers));
        System.out.println("The standard deviation is " + df.format(std(numbers)));
    }
}