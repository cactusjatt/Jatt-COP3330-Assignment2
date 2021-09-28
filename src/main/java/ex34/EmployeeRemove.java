/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex34;
import java.util.Scanner;

public class EmployeeRemove {
    public static boolean removeEmp(String[] listOfEmployees, String removedEmployee){
        int employeeNumber = -1;

        for(int i = 0; i < 5; i++){
            if(removedEmployee.equals(listOfEmployees[i])){
                employeeNumber = i;
                break;
            }
        }
        if(employeeNumber == -1){
            System.out.println("Error. Name does not exist in employee list.");
            return false;
        }

        for(int j = 0; j < (4-employeeNumber); j++){
            listOfEmployees[employeeNumber+j] = listOfEmployees[employeeNumber+j+1];
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] listOfEmployees = new String[5];
        listOfEmployees[0] = "John Smith";
        listOfEmployees[1] = "Jackie Jackson";
        listOfEmployees[2] = "Chris Jones";
        listOfEmployees[3] = "Amanda Cullen";
        listOfEmployees[4] = "Jeremy Goodwin";

        System.out.println("There are 5 employees: ");
        for(int i = 0; i < 5; i++){
            System.out.println(listOfEmployees[i]);
        }
        System.out.print("\nEnter an employee name to remove: ");
        String removedEmployee = in.nextLine();

        if(!removeEmp(listOfEmployees, removedEmployee))
            return;

        System.out.println("\nThere are 4 employees: ");
        for(int i = 0; i < 4; i++){
            System.out.println(listOfEmployees[i]);
        }
        in.close();
    }
}
