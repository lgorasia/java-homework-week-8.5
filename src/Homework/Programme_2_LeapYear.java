package Homework;

import java.util.Scanner;

public class Programme_2_LeapYear {
    public static void main(String[] args) {
        //Scanner declaration for reading input for consol
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the year: ");
        int year = scanner.nextInt();
        Programme_2_LeapYear leapYear = new Programme_2_LeapYear();
        leapYear.isItLeapYear(year);
        //close the scanner object
        scanner.close();


    }

    // Checking if it is leapyear or not
    public void isItLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return;
        }
        System.out.println("The year" + year + "is not a leap year");
    }
}
