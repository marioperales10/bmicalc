package bmicalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	
	public class BMICalcTest {
	
	@Test 
	public void BMITest1() {
		BMICalcImpl  Pr = new BMICalcImpl();
		assertEquals((18.75), Pr.bmi(75.0, 2.0));
	}

	@Test
	public void Categorytest1() {
		BMICalcImpl Pr1 = new BMICalcImpl();
		assertEquals(("NORMAL"), Pr1.category(22));
	}
	
	@Test
	public void Categorytest2() {
		BMICalcImpl Pr4 = new BMICalcImpl();
		assertEquals(("OBESE"), Pr4.category(30));
	}
	
	
	@Test 
	public void BooleanTest1() {
		BMICalcImpl Pr2 = new BMICalcImpl();
		assertTrue(Pr2.abdominalObesity(90, 'M')); 
	}
	
	@Test 
	public void BooleanTest2() {
		BMICalcImpl Pr3 = new BMICalcImpl();
		assertFalse(Pr3.abdominalObesity(85,'M'));
	}
}

	

