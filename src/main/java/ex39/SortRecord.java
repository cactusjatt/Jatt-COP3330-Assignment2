/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Sarim Jatt
 */
package ex39;
import java.util.ArrayList;
import java.util.HashMap;

public class SortRecord{
    public static ArrayList<HashMap<String, String>> listMapsInput() {
        ArrayList<HashMap<String, String>> listMaps = new ArrayList<>();

        HashMap<String, String> employee = new HashMap<>();
        employee.put("First Name", "John");
        employee.put("Last Name", "Johnson");
        employee.put("Position", "Manager");
        employee.put("SepDate", "2016-12-31");

        listMaps.add(employee);

        HashMap<String, String> employee2 = new HashMap<>();
        employee2.put("First Name", "Tou");
        employee2.put("Last Name", "Xiong");
        employee2.put("Position", "Software Engineer");
        employee2.put("SepDate", "2016-10-05");
        listMaps.add(employee2);

        HashMap<String, String> employee3 = new HashMap<>();
        employee3.put("First Name", "Michaela");
        employee3.put("Last Name", "Michaelson");
        employee3.put("Position", "District Manager");
        employee3.put("SepDate", "2015-12-19");
        listMaps.add(employee3);

        HashMap<String, String> employee4 = new HashMap<>();
        employee4.put("First Name", "Jake");
        employee4.put("Last Name", "Jacobson");
        employee4.put("Position", "Programmer");
        employee4.put("SepDate", "");
        listMaps.add(employee4);

        HashMap<String, String> employee5 = new HashMap<>();
        employee5.put("First Name", "Jacquelyn");
        employee5.put("Last Name", "Jackson");
        employee5.put("Position", "DBA");
        employee5.put("SepDate", "");
        listMaps.add(employee5);

        HashMap<String, String> employee6 = new HashMap<>();
        employee6.put("First Name", "Sally");
        employee6.put("Last Name", "Webber");
        employee6.put("Position", "Web Developer");
        employee6.put("SepDate", "2015-12-18");
        listMaps.add(employee6);

        return listMaps;
    }

    public static void main( String[] args ){

        ArrayList<HashMap<String, String>> listMaps = listMapsInput();

        for(int i = 0; i < 6; i++) {
            for(int j = i+1; j < 6; j++) {
                if(listMaps.get(i).get("Last Name").charAt(0) >= listMaps.get(j).get("Last Name").charAt(0)) {
                    HashMap<String, String> temp = listMaps.get(i);
                    listMaps.set(i, listMaps.get(j));
                    listMaps.set(j, temp);
                }
            }

        }

        System.out.println("Name                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");

        for(int i = 0; i < 6; i++) {
            String fullName = listMaps.get(i).get("First Name") + " " + listMaps.get(i).get("Last Name");
            String s = String.format("%-19s | %-17s | %s", fullName, listMaps.get(i).get("Position"), listMaps.get(i).get("SepDate"));
            System.out.println(s);
        }
    }
}