package cs1120;

//main method
public class Quiz {
	public static void main(String[] args) {	
		Question question= new TrueFalseQuestion("Soccer is fun to play!", "y");
		question.check();
		question = new TrueFalseQuestion("Learning Java is easy", "n");
		question.check();
		question = new TrueFalseQuestion("Ronaldo is soccer player?", "t");
		question.check();
		question = new TrueFalseQuestion("Bitcoin can be controller by goverment", "f");
		question.check();
		question = new TrueFalseQuestion("The highest mountain in the world is Rainier Mountain", "false");
		question.check();
 
		 question = new MultipleChoiceQuestion(
				"Which of these countries was NEVER part of the British Empire??",
				"New Zealand",
				"Kenya", 
				"Thailand", 
				"Ireland", 
				"Moscow", 
				"a");

		 question.check();
		 question = new MultipleChoiceQuestion(
				"Which of these U.S. states does NOT border Canada?",
				"Alaska",
				"Maine", 
				"Indiana", 
				"Minnesota", 
				"Washington", 
				"d");
		 question.check();
		
		 question = new MultipleChoiceQuestion(
				"Which of these countries was NOT a part of the Soviet Union?",
				"Ukraine",
				"Georgia", 
				"Usbekistan", 
				"Poland", 
				"Belarus", 
				"d");
		
		question.check();
		question = new MultipleChoiceQuestion(
				"Which of these cities is NOT a national capital?",
				"Sydney",
				"Bankgkok", 
				"New York", 
				"Prague", 
				"Cairo", 
				"a");
		 question.check();
 
		 question = new MultipleChoiceQuestion(
					"Which of these cities DOESN'T border the Mediterranean Sea??",
					"Barcelona",
					"Alexandria", 
					"Monaco", 
					"Prague", 
					"Lisbon", 
					"e");
		
		question.check();	 
		Question.showResults();
		
	}
	

}

