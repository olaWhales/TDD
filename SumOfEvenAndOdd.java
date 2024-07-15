import java.util.Scanner;
public class SumOfEvenAndOdd{
	public static void main(String...arg){

	Scanner input = new Scanner(System.in);

	int evenNumber = 0 ;
	int oddNumber = 0 ;

	for(int count = 1 ; count <= 10 ; count++){
		System.out.print("Enter ten number: ");
		int number = input.nextInt();

		if(number %2 == 0)
			evenNumber = evenNumber+number ;
			System.out.println("evenNumber: " + evenNumber);
		if(number %2 == 1)
			oddNumber = oddNumber+number ;
			System.out.println("oddNumber: " + oddNumber);
			
	}	
		System.out.println("The total number of even: "+evenNumber);
		System.out.println("The total number of odd: "+oddNumber);

}

}