// Write a Java program to print the area and perimeter of a circle. 
// Radius = 7.5
public class AreaPerimeter {
    public static void main(String[] args) {
        double radius = 7.5; 
        double pi = 3.14;
        double area = pi * Math.pow(radius, 2);
        double perimeter = 2 * pi * radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);

    }
    
}
