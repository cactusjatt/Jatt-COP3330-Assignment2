/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex25;
import java.util.Scanner;

class password{
    String s;

    public int passwordValidator(String s){
        boolean numCheck = false, letterCheck = false, specialCharCheck = false;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) > 47 && s.charAt(i) < 58){
                numCheck = true;
                continue;
            }

            if((s.charAt(i) > 64 && s.charAt(i) < 91) || (s.charAt(i) > 96 && s.charAt(i) < 123)){
                letterCheck = true;
                continue;
            }

            if(s.charAt(i) > 32 && s.charAt(i) < 127){
                specialCharCheck = true;
            }
        }

        if(numCheck && !letterCheck && !specialCharCheck && s.length() < 8)
            return 0;
        else if(letterCheck && !numCheck && !specialCharCheck && s.length() < 8)
            return 1;
        else if(numCheck && letterCheck && !specialCharCheck && s.length() >= 8)
            return 2;
        else if(numCheck && letterCheck && specialCharCheck && s.length() >= 8)
            return 3;
        else return 4;
    }
}

public class PasswordStrength {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        password password = new password();

        System.out.print("Please enter a password: ");
        password.s = in.nextLine();

        String printStatement;
        int strength = password.passwordValidator(password.s);
        if(strength == 0){
            printStatement = ("The password '" + password.s + "' is a very weak password.");
        }
        else if(strength == 1){
            printStatement = ("The password '" + password.s + "' is a weak password.");
        }
        else if(strength == 2){
            printStatement = ("The password '" + password.s + "' is a strong password.");
        }
        else if(strength == 3){
            printStatement = ("The password '" + password.s + "' is a very strong password.");
        }
        else{
            printStatement = ("Password invalid");
        }
        System.out.println(printStatement);
        in.close();
    }
}
