/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex33;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class MagicBall {
    public static void magicBallResponse(){
        ArrayList<String> answerList = new ArrayList<>();
        answerList.add("Yes");
        answerList.add("No");
        answerList.add("Maybe");
        answerList.add("Ask again later.");

        Random rand = new Random();

        System.out.print(answerList.get(rand.nextInt(4)));
    }

    public static void main(String[] args) {

        //Magic 8 Ball code
        Scanner in = new Scanner(System.in);

        System.out.print("What's your question?\n> ");
        in.nextLine();
        System.out.println();

        magicBallResponse();

        in.close();
    }
}