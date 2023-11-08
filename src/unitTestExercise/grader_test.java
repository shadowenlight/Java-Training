package unitTestExercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class grader_test {

	@Test
	void gradeChkF_Test() {
		var Grader = new grader();
		
		assertEquals('F', Grader.Grade(45));
	}
	
	@Test
	void gradeChkD_Test() {
		var Grader = new grader();
		
		assertEquals('D', Grader.Grade(66));
	}
	
	@Test
	void gradeChkC_Test() {
		var Grader = new grader();
		
		assertEquals('C', Grader.Grade(71));
	}
	
	@Test
	void gradeChkB_Test() {
		var Grader = new grader();
		
		assertEquals('B', Grader.Grade(89));
	}
	
	@Test
	void gradeChkA_Test() {
		var Grader = new grader();
		
		assertEquals('A', Grader.Grade(97));
	}
}