import java.util.Scanner;
public class MinimumAndMaximum{
	public static void main(String...args){

	Scanner input = new Scanner(System.in);

	
	int minimum = 0 ;
	int maximum = 0 ;
	int number = 0 ;
	
	for(int count = 1 ; count <= 10 ; count++){
		System.out.print("Enter 10 input: ");
		number = input.nextInt();

		if(number > maximum)
			maximum = number ;
		if(minimum == 0 || minimum > number)
			minimum = number ;
	}
		System.out.println("The largest number is: " + maximum);
		System.out.print("The minimum number is: "+ minimum);

}

}