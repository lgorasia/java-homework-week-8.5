package Homework;

import java.util.Arrays;

public class Programme_19_AverageOfArray {
    public static void main(String[] args) {
        //numeric array declaration
        int[] numArray = {1789,2035,1899,2040,2255,7897,1455,787};
        int sum = 0;
        //Calculating the sum of arrays calue
        for(int i = 0; i<numArray.length; i++){
            sum = sum + numArray[i];
        }
        // Finding the average of array value

        int average= sum/numArray.length;
        System.out.println("Vlues of the elements of the array are:" + Arrays.toString(numArray));
        System.out.println("Average of all the value of the array are:" + average);
    }
}
