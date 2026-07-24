package programs;

import java.util.Scanner;

public class ValueChanger {
public static void main(String[] args) {
	
	System.out.println("Type your first number ");
	Scanner inpt1 = new Scanner(System.in);
	int number=inpt1.nextInt();
	System.out.println("Type your second number ");
	Scanner inpt2 = new Scanner(System.in);
	int numbers=inpt2.nextInt();
	System.out.println("a = "+number+" ; b = "+numbers);
	
	System.out.println();
	System.out.println("----------------------------------------------------------------------");
	System.out.println("Select Method : ");
	System.out.println("1 - Extra variable method ");
	System.out.println("2 -  Arthematic method");
	Scanner inpt3 = new Scanner(System.in);
	int c = inpt3.nextInt();

	// EXTRA VARIABLE METHOD OF EXCHANGING VALUES 

		
	System.out.println("----------------------------------------------------------------------");
	if (c == 1 ) {
		
		int z;
		 z = number;
		 number = numbers ;
		 numbers = z;
		 
		System.out.println("a = "+number+" ; b ="+numbers);
		System.out.println();
		
		
	} 
	
	// ARTHIMATIC METHOD OF EXCHANGING VALUES 
	
	else if (c == 2) {
		
		int x = number + numbers;
		int first = x - number;
		number = first;
		System.out.println("a ="+number);
		
		int second = x - numbers ;
		numbers = second ;
		System.out.println("b ="+numbers);
		
	}
	else{
		
		System.out.println(" Please select the options above ");
		
	}
	
	{
		
	}
	
}
}
