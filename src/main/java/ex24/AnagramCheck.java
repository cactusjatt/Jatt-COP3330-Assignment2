/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex24;
import java.util.Scanner;

class anagram_check{

    String s1, s2;

    public boolean isAnagram(String s1, String s2){
        boolean check = false;
        if(s1.length() != s2.length())
            return false;

        for(int i = 0; i < s1.length(); i++){
            check = false;

            for(int j = 0; j < s2.length(); j++){

                if(s1.charAt(i) == s2.charAt(j)){
                    check = true;

                    s2 = s2.substring(0,j) + "0" + s2.substring(j+1);

                    break;
                }
            }

            if(!check)
                return false;
        }
        return check;
    }
}

public class AnagramCheck{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        anagram_check anagram = new anagram_check();

        System.out.println("Enter two strings first and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        anagram.s1 = in.nextLine();
        System.out.print("Enter the second string: ");
        anagram.s2 = in.nextLine();

        boolean check = anagram.isAnagram(anagram.s1, anagram.s2);

        if(check)
            System.out.println("\"" + anagram.s1 + "\" and \"" + anagram.s2 + "\" are anagrams.");

        else
            System.out.println("\"" + anagram.s1 + "\" and \"" + anagram.s2 + "\" are not anagrams.");

        in.close();
    }
}
