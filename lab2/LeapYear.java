package lab2;

import java.util.Scanner;

public class LeapYear {              // Class name

    public static void main(String[] args) {
    	Scanner s1 = new Scanner(System.in);    // take the user input
    	System.out.println("Enter The Year");
        int year = s1.nextInt();

        if (year % 400 == 0) {           // check the condition 
            System.out.println(" This Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}


