import javax.swing.JOptionPane;
// this Java code uses unit 3 programming assignment guide
public class Quiz2 {
	static int nQuestion = 0;
	static int nAnswer = 0;
	public static void main(String[] args) {
		String question = "Who invented Java Programming?\n";
         question += "A. Guido van Rossum\n";
         question += "B. James Gosling\n";
         question += "C. Dennis Ritchie\n";
         question += "D. Bjarne Stroustrup\n";
         question += "E. Elon Musk";
		check(question, "B");

		question = "In Java, strings are enclosed with?\n";
		question += "A. Double quotation mark\n";
		question += "B. Only parenthesis\n";
		question += "C. Single quotation marks\n";
		question += "D. Semicolons\n";
		question += "E. Curly braces";
		check(question, "A");
		  
		question = " Which one of the following is not a Java feature?\n";
		question += "A. Object-oriented\n";
		question += "B. Microsoft\n";
		question += "C. Portable\n";
		question += "D. Dynamic and Extensible\n";
		question += "E. Use of pointers";
		check(question, "E");
		
		question = "How many primitives are in Java?\n";
		question += "A. 4\n";
		question += "B. 5\n";
		question += "C. 8\n";
		question += "D. 1\n";
		question += "E. 7";	
		check(question, "C");
		JOptionPane.showMessageDialog(null, nAnswer + " Correct out of "+ nQuestion + " questions");
	}
       static String ask(String question) {

		     
		 while (true) {
		    	 
		   String answer = JOptionPane.showInputDialog(question);
		   answer = answer.toUpperCase();
		   boolean valid = (answer.equals("A")|| answer.equals("B")||answer.equals("C")||answer.equals("D")||answer.equals("E"));
		      
		 if(valid){
		     return answer;}
		 else if(!valid){
		    JOptionPane.showMessageDialog(null, "invalid answer.Please enter A, B, C, D, or E.");}
		 }
       }
		 static void check(String question, String correctAnswer) {
			 nQuestion ++;
			 String answer = ask(question);
			 if (answer.equals(correctAnswer)) {
				 JOptionPane.showMessageDialog(null,"Correct!");
				 nAnswer++;
			 }else {
				 JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is "+ correctAnswer+ ".");
			 }
}

}