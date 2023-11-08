package unitTestExercise;

public class grader {
	public char Grade(int score) {
		
		if(score < 0) 
			throw new IllegalArgumentException("Cannot be lower than zero.");	
		else if(score < 60)
			return'F';
		else if(score < 70)
			return'D';
		else if(score < 80)
			return'C';
		else if(score < 90)
			return'B';
		else
			return'A';		
	}
}
