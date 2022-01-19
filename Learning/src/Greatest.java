// Take three numbers from the user and print the greatest number. 
import java.util.Scanner;

public class Greatest {
    public static void main(String[] args) {
        Scanner greatestNumber = new Scanner(System.in);
        System.out.println("Enter the numbers:");

        int number1 = greatestNumber.nextInt();
        int number2 = greatestNumber.nextInt();
        int number3 = greatestNumber.nextInt();

        
        if (number1 > number2) if (number1 > number3) {
            System.out.println("The greatest number is " + number1);

        } if (number2 > number1) if (number2 > number3) {
            System.out.println("The greatest number is " + number2);

        } if (number3 > number1) if (number3 > number1) {
            System.out.println("The greatest number is " + number3); 

        greatestNumber.close();
        
        }

    }

}
