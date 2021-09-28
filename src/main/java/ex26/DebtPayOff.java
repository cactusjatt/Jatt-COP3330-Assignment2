/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex26;
import java.util.Scanner;

class paymentCalculator{
    double b, p, i;

    public double calculateMonthsUntilPaidOff(double b, double p, double i){
        return -((double) 1/30) * (Math.log10(1 + (b/p) * (1 - Math.pow(1 + i, 30))) / Math.log10(1 + i));
    }
}

public class DebtPayOff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        paymentCalculator account = new paymentCalculator();

        System.out.print("What is your balance? ");
        account.b = Math.ceil(in.nextDouble());
        System.out.print("What is the APR on your card (as a percent)? ");
        account.i = in.nextDouble() / 36500;
        System.out.print("What is the monthly payment you can make? ");
        account.p = Math.ceil(in.nextDouble());

        int n = (int)
                Math.ceil(account.calculateMonthsUntilPaidOff(account.b, account.p, account.i));
        System.out.println("It will take you " + n + " months to pay off this card.");

        in.close();
    }
}
