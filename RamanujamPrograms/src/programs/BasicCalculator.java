package programs;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {

		System.out.println(" ################### WELCOME TO BASIC CALCULATOR ###############");
		while(true) {
			System.out.println("---------------------------------------------------------------------------------");
			System.out.println("Do you want to calculate  ?");
			Scanner want = new Scanner(System.in);
			boolean ok;
			ok = want.nextBoolean();
			if(ok) {
				Scanner inpt = new Scanner(System.in);

				System.out.println("Type the First number ");
				double number;
				number=inpt.nextInt();

				System.out.println("Type the Arthematic Function : { + ; - ; X ; /} ");
				String functions;
				functions=inpt.next();

				System.out.println("Type the Second number ");
				double second;
				second=inpt.nextInt();

				calculator(number, functions, second);
			}
			else {
				System.out.println("Thank you for using my unintelligent calculator");
				break;
			}
		}
	}
	public static void calculator(double number, String functions, double second) {

		if (functions.equals("+")){

			double sum=number+second;
			System.out.println(number +" + " +second +" = "+sum);


		}

		else if(functions.equals("-")){

			double diff=number-second;
			System.out.println(number +" - " +second +" = "+diff);
		}

		else if(functions.equals("x")){

			double pro=number*second;
			System.out.println(number +" X " +second +" = "+pro);
		}

		else if(functions.equals("/")){

			double quo=number/second;
			System.out.println(number +" ÷ " +second +" = "+quo);
		}

		else if (functions.equals("")) {

			System.err.println("This Arthematic Function is not given ");
		}


		else { System.err.println("This Arthematic Function is not availabe "); 
		}
	}



}
