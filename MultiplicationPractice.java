import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MultiplicationPractice{
	
	@Test
	public void testMultiplicationWithoutMultiplicationSign(){

	//given
	MultiplicationPracticing calculator = new MultiplicationPracticing();


	//when
	int result = calculator.multiplicationPractice(2, 2);


	//assert
	assertEquals(4, result);
	
}

}