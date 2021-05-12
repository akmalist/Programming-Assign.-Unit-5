package cs1120;

import javax.swing.JOptionPane;

public abstract class Question {
	static int nQuestions = 0;
	static int nCorrect = 0;	
	String question;
	String correctAnswer;	
	
	abstract String ask();
	
	// method check that take question and check the correct answer
	
	void check() {
		// increment questions each time 
		nQuestions ++; 
		//a method "ask" that asks the question
		String answer = ask();		
		if (answer.equals(correctAnswer)) {
			 // increment correct answers for correct answers
			nCorrect ++;
			JOptionPane.showMessageDialog(null, "Correct!");
		}else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is "+ correctAnswer);
		}
		
	}
	
	static void showResults() {
		// show the number of questions and correct answers
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions ");

	}

}
