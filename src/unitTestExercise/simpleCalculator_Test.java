package unitTestExercise;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class simpleCalculator_Test {

	@Test
	void Add_Test() {
		var calculator = new simpleCalculator();
		
		assertEquals(4, calculator.Add(2, 2));
	}
	
	@Test
	void Sub_Test() {
		var calculator = new simpleCalculator();
		
		assertEquals(7, calculator.Sub(8, 1));
	}
	
	@Test
	void Mul_Test() {
		var calculator = new simpleCalculator();
		
		assertEquals(81, calculator.Mul(9, 9));
	}
	
	@Test
	void Div_Test() {
		var calculator = new simpleCalculator();
		
		assertEquals(1, calculator.Div(15, 15));
	}

}
