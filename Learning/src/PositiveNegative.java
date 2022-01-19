// Write a Java program to get a number from the user and print whether it is positive or negative.

import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {

        Scanner positiveNegative = new Scanner(System.in);
        System.out.println("Enter the number:");

        int number = positiveNegative.nextInt();

        if (number < 0) {System.out.println(number + " is a negative number.");
    } else {
        System.out.println(number + " is a positive number.");

        positiveNegative.close();
    }

    }
    
}
