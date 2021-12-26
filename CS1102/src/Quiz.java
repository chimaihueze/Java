public class Quiz {

	public static void main(String[] args) {
		MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
				"What is air?",
        "air is a mixture of liquids",
        "air is a mixture of gases",
        "air is a mixture of water and wind",
        "air sourrounds us",
        "air is the air you breath in for life",
        "b");
		question1.check();

	   Question question2 = new MultipleChoiceQuestion(
		 "Which of this a domestic animal?",
	    "Lizard", 
		"Lion",
	    "Zebra",
		"Crocodile",
		"Dog",
		"e");
		question2.check();
	
		Question question3 = new MultipleChoiceQuestion(	
		"In Java, strings are enclosed with?",
		"Double quotation mark",
		"Only parenthesis",
		"Single quotation marks",
		"Semicolons",
		"curly braces",
		"a");
		question3.check();

		Question question4 = new MultipleChoiceQuestion(
		"How many primitives are in Java?",
		"4",
		"5",
		"8",
		"1",
		"7",
		"c");		
		question4.check();
		
		Question question5 = new MultipleChoiceQuestion(
		"Which of these is correct for a class?",
		"Class defines object",
		" Class subscribes object",
		"Class is a blueprint for object",
		"Class creates constructors",
		"Class modifies object",
		"c");
		question5.check();
				
		
		Question question = new TrueFalseQuestion("Java is an OOP language", "y");
		question.check();
		
		question = new TrueFalseQuestion("Which one is not true?", "false");
		question.check();
		
		question = new TrueFalseQuestion("API stands for All people instance", "n");
		question.check();
		
		question = new TrueFalseQuestion("This course is programing 1", "true");
		
		question.check();
		question.showResults();
		



	}
       
				
}
