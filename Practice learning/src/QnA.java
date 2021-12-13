import java.util.Scanner;

public class QnA {
    public static void main(String[] args) {
        String question = "What is Chima's occupation?";

        String a = "A. Engineer";
        String b = "B. Nurse";
        String c = "C. Pilot";
        String d = "D. Doctor";
        boolean condition = true;


        System.out.println(question);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        Scanner ans = new Scanner(System.in);
        String answr = ans.nextLine();

        while (condition) {
            if (answr.equals("d")) {
                
                System.out.println("Correct! Chima is a Doctor!"); {break;}
            } else {
                        System.out.println("Incorrect answer! Chima is a Doctor"); {break;}
                    }
                }
            }
        }
    
    

