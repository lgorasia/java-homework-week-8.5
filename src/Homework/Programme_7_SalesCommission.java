package Homework;



import java.util.Scanner;

public class Programme_7_SalesCommission {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ener seller's name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Seller's ID: ");
        int sellerID = scanner.nextInt();
        System.out.println("Enter Sales Amount: ");
        int salesAmount = scanner.nextInt();
        System.out.println("Enter basic salary: ");
        int basicSalary = scanner.nextInt();
        // creating object to call instance metood

        Programme_7_SalesCommission salesCommission = new Programme_7_SalesCommission();
        int grossSalary = basicSalary + salesCommission.calculateCommission(salesAmount);
        System.out.println(" Seller name is                           :" + name);
        System.out.println(" Seller id is                             :" + sellerID);
        System.out.println(" Seller sales amout is                    :" + salesAmount);
        System.out.println(" Seller basic salary is                   :" + basicSalary);
        System.out.println(" Seller gross salary is                   :" + grossSalary);
        //closing the scanner object
        scanner.close();


    }

    // calculating the sales commission
    public int calculateCommission(int salesAmount) {
        int commission;
        if (salesAmount >= 50000) {
            commission = (salesAmount * 35) / 100;
            System.out.println("sales Commission is " + commission);
        } else if (salesAmount >= 30000) {
            commission = (salesAmount * 20) / 100;
            System.out.println("Sales commission is" + commission);
        } else if (salesAmount >= 20000) {
            commission = (salesAmount * 10) / 100;
            System.out.println("Sales commissio is" + commission);
        } else if (salesAmount >= 10000) {
            commission = (salesAmount * 5) / 100;
            System.out.println("Sales commission is:" + commission);
        } else {
            commission = (salesAmount * 2) / 100;
            System.out.println("Sales commission is" + commission);
        }
        return commission;
    }
}
