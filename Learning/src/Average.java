// Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        
        System.out.println("Enter the first, second and third number.");

        int number1 = numbers.nextInt();
        int number2 = numbers.nextInt();
        int number3 = numbers.nextInt();

        System.out.println("The average of the three numbers is " + (number1 + number2 + number3) / 3);

        numbers.close();
    }
    
}
