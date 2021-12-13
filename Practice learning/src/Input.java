import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        String firstName = "Chima", lastName = "Ihueze";
        System.out.println("What is " + firstName + "'s" + " cGPA?");
        
        Scanner cGPA = new Scanner(System.in);
        double CGPA = cGPA.nextDouble();

        System.out.println(firstName + " " + lastName + "'s" + " cGPA is " + CGPA);
        cGPA.close();

    }
    
}
