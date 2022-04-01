package Homework;

import java.util.Scanner;

public class Programme_8_CityName {
    public static void main(String[] args) {
        //Scanner declaratio for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter alphabet between A to F");
        char city = scanner.next().charAt(0);
        // object creation
        Programme_8_CityName cityName = new Programme_8_CityName();
        cityName.printCity(city);
        //Closing the scanner object
        scanner.close();

    }

    //Printing city name
    public void printCity(char city) {
        if (city == 'A' || city == 'a') {

            System.out.println("Aberdeen");
        } else if (city == 'B' || city == 'b') {
            System.out.println("Belfast");
        } else if (city == 'C' || city == 'c') {

            System.out.println("Cmbridge");
        }else if (city =='D' || city =='d'){
            System.out.println("Derby");
        }else if (city =='E' || city =='e'){
            System.out.println("Edinburg");
        }else if (city == 'F' || city == 'f'){
            System.out.println("Feltham");
        }else{
            System.out.println("Enter alphabet from A to F");
        }
    }
}