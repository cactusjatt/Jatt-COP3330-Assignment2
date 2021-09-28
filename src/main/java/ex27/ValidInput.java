/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex27;
import java.util.Scanner;

class account{
    String first, last, employeeID, ZIP;

    public boolean first_filled(){
        if(this.first.equals(""))
            return false;
        else
            return true;
    }

    public boolean first_2char(){
        if(this.first.length() < 2)
            return false;
        else
            return true;
    }

    public boolean last_filled(){
        if(this.last.equals(""))
            return false;
        else
            return true;
    }

    public boolean last_2char(){
        if(this.last.length() < 2)
            return false;
        else
            return true;
    }

    public boolean employeeIDFormat(){
        if(this.employeeID.length() != 7)
            return false;

        for(int i = 0; i < 2; i++)
            if(!Character.isLetter(this.employeeID.charAt(i)))
                return false;

        if(this.employeeID.charAt(2) !='-')
            return false;

        for(int i = 3; i < 7; i++)
            if(!Character.isDigit(this.employeeID.charAt(i)))
                return false;
        return true;
    }

    public boolean zipCheck(){
        if(this.ZIP.length() != 5)
            return false;
        for(int i = 0; i < 5; i++){
            if(!Character.isDigit(this.ZIP.charAt(i)))
                return false;
        }
        return true;
    }

    public String validateInput(){
        String s, s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "";

        if(!first_filled())
            s1 = "The first name must be filled in.\n";

        if(!first_2char())
            s2 = "The first name must be at least 2 characters long.\n";

        if(!last_filled())
            s3 = "The last name must be filled in.\n";

        if(!last_2char())
            s4 = "The last name must be at least 2 characters long.\n";

        if(!employeeIDFormat())
            s5 = "The employee ID must be in the format of AA-1234.\n";

        if(!zipCheck())
            s6 = "The zipcode must be a 5 digit number.\n";

        if(s1.equals("") && s2.equals("") && s3.equals("") && s4.equals("") && s5.equals("") && s6.equals(""))
            s = "There were no errors found.\n";
        else s = s1+s2+s3+s4+s5+s6;

        return s;
    }
}

public class ValidInput{
    public static void main(String[] args){
        Scanner in = new

                Scanner(System.in);
        account person = new account();

        System.out.print("Enter the first name: ");
        person.first = in.nextLine();

        System.out.print("Enter the last name: ");
        person.last = in.nextLine();

        System.out.print("Enter the ZIP code: ");
        person.ZIP = in.nextLine();

        System.out.print("Enter the employee ID: ");
        person.employeeID = in.nextLine();

        String s = person.validateInput();
        System.out.println(s);

        in.close();
    }
}