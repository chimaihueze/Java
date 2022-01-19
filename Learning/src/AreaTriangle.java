// Write a Java program that takes two numbers representing the height and base of a triangle as input to calculate and print the average of the triangle.
import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
    
        Scanner areaTriangle = new Scanner(System.in);
        System.out.println("Enter the height and base of the triangle.");

        float height = areaTriangle.nextInt();
        float base = areaTriangle.nextInt();

        float area = (height * base) / 2;

        System.out.println("The area of the triangle is " + area);

        areaTriangle.close();

    }
    
}
