package cs1120;
import javax.swing.JOptionPane;
 
public class MultipleChoiceQuestion extends Question  {	
    // data members of the class 
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {
		question = query+"\n";
		question += "A. "+a+"\n";
		question += "B. "+b+"\n";
		question += "C. "+c+"\n";
		question += "D. "+d+"\n";
		question += "E. "+e+"\n";		
		correctAnswer= answer.toUpperCase();		
		
	}

	
	// ask method that takes a question and return answer in upper case 
	String ask() {
		while (true) {
			 String answer = JOptionPane.showInputDialog(question);
			 
			 answer = answer.toUpperCase();
			 
			 boolean valid = (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));
			 
			 if (valid) return answer;
				JOptionPane.showMessageDialog(null,"Invalid answer. Please enter A, B, C, D, or E.");

			 }
		
	}	

 
}