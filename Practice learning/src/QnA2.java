import java.util.Scanner;

public class QnA2 {
    public static void main(String[] args) {
        System.out.println("What is your favourite sport?");

        String firstOption = "basketball";
        String secondOption = "football";
        String thirdOption = "tennis";
        String fourthOption = "taekwondo";

        String correctOption = secondOption;

        Scanner answer = new Scanner(System.in);
        String correctAnswer = answer.next();

        if (correctOption.equals(correctAnswer.toLowerCase())) {
            System.out.println("Nice! You got the correct answer, " + correctOption);
        } else {
            System.out.println("You're wrong! The correct answer is " + correctOption);
        }
    }
    
}
