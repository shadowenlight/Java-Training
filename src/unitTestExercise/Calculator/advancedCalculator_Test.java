package unitTestExercise.Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class advancedCalculator_Test {
	
	@Test
	void Add_Test() {
		var calc = new advancedCalculator_Operations();
		
		assertEquals(74.993, calc.Add(8.452, 66.541));
	}
	
	@Test
	void Sub_Test() {
		var calc = new advancedCalculator_Operations();
		
		assertEquals(50.773, calc.Sub(85.546, 34.773));
	}
	
	@Test
	void Mul_Test() {
		var calc = new advancedCalculator_Operations();
		
		assertEquals(105.03618, calc.Mul(7.562, 13.89));
	}
	
	@Test
	void Div_Test() {
		var calc = new advancedCalculator_Operations();
		
		assertEquals(7, calc.Div(49, 7));
	}
	
	@Test
	void SquareRoot_Test() {
		var calc = new advancedCalculator_Operations();
		
		assertEquals(12, calc.SquareRoot(144));
	}
	
	@Test
	void Power_Test() {
		var calc = new advancedCalculator_Operations();
		
		assertEquals(729, calc.Power(9, 3));
	}
}
