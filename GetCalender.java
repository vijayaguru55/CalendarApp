package org.Calender;

import java.util.Scanner;

public class GetCalender {  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year..");
        String year = input.nextLine();
        int yearIn = Integer.parseInt(year);
        new CreateCalender(yearIn);
        input.close();
    }
}