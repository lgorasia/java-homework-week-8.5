package Homework;

import java.util.Scanner;

public class Programme_16_FindPositiveNegative {
    public static void main(String[] args) {
        // Scanner declaration for reading input fom console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        findNumberIsPositiveNegativeOrZero(number);
        // closing the scanner objrct
        scanner.close();

    }

    // Finding the number is Positive Negative or zero
    public static void findNumberIsPositiveNegativeOrZero(int number) {
        if (number > 0) {
            System.out.println(number + "is a Positive number");
        } else if (number < 0) {
            System.out.println(number + "Is a Negative number");
        } else {
            System.out.println(number + "is Zerom");
        }
    }
}
