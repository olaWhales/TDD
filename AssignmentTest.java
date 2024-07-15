import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class AssignmentTest{


	@Test
	public void testforpositiveCitizenTax(){

	//given
	Assignment calculator = new Assignment();

	//when
	double result = calculator.Assignments(30_000);

	//assert
	assertEquals(4_500,result);


}


	@Test
	public void testforNegativeCitizenTax(){

	//given
	Assignment calculator = new Assignment();

	//when
	double result = calculator.Assignments(30_000);

	//assert
	assertThrows(RuntimeException.class, ()-> calculator.Assignments(-4_500) );

}

}