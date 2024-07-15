import org.junit.jupiter.api.Test;
public class Calculator2{



	@Test
	public void TestingTwoNumbers(){


	//given
	Calculator calculator = new Calculator(int number1, int number2);

	//when
	int result = calculator.Calculator2(5,5); 
	
	//assert
	assertEquals(25, result);


}


}