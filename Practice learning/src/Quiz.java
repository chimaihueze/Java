import javax.swing.JOptionPane;
public class Quiz {
    public static void main(String[] args) {
        String question = "What is your name?\n";
        question += "A. My name is Chima\n"
        + "B. My name is Chris\n"
        + "C. My name is Ijay\n"
        + "D. My name is Anna\n"
        + "E. My name is Ebuka";

        String answer;

        do {
        answer = JOptionPane.showInputDialog(question);
        answer = answer.toUpperCase();

        if(!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B") 
        && !answer.equalsIgnoreCase("C") && !answer.equalsIgnoreCase("D"))
        JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D or E");
            else {
                if (answer.equals("A"))
                {
                    JOptionPane.showMessageDialog(null, "Oh! That's your name");
                    break;
                        }
                        else
                            JOptionPane.showMessageDialog(null, "That's not your name. Please try again.");
                                }
                                    }while(!answer.equalsIgnoreCase("A"));

    }
}