import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Choose a number between 1 and 20");
       
        int inputtedNumber = number.nextInt();

        if (inputtedNumber < 5) {
            System.out.println("Congrats, enjoy your lucky number!");
        } else {
                    System.out.println("Oops! Quite Unfortunate");
                    number.close();
                }
            }
        }
    
    

