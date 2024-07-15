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
			evenNumber = number ;
			evenNumber++ ;
	}	
		System.out.print(evenNumber);

}

}