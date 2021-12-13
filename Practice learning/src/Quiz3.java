// this Java code uses unit 3 programming assignment guide
public class Quiz3 {

	public static void main(String[] args) {
		MultipleChoiceQuestion question1 = new MultipleChoiceQuestion(
		"Who invented Java Programming?",
        "Guido van Rossum",
        "James Gosling",
        "Dennis Ritchie",
        "Bjarne Stroustrup",
        "Elon Musk",
        "b");
		question1.check();

		 
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion(
		"Which one of the following is not a Java feature?",
	    "Object-oriented", 
		"Microsoft",
	    "Portable",
		"Dynamic and Extensible",
		"Use of pointers",
		"e");
		question2.check();
	

		
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion(

	
		"Which of these is not a programming language?",
		"Snake",
		"Python",
		"Java",
		"Javascript",
		"PHP",
		"a");
		question3.check();

		
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion(

		"How many primitives are in Java?",
		"4",
		"5",
		"8",
		"1",
		"7",
		"c");
		question4.check();
		
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion(
		"Which of these is correct for a class?",
		"Class defines object",
		"Class subscribes object",
		"Class is a blueprint for object",
		"Class creates constructors",
		"Class modifies object",
		"c");
		question5.check();
				
		MultipleChoiceQuestion.showResults();

	}
       
				
}
