package programs;


import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		System.out.println("************* WELCOME TO AREA CALCULATOR ******************");
		String shape = input();
		calculater(shape);
		while(true) {
			Scanner inpt_repeat = new Scanner (System.in);
			String check = inpt_repeat.next();
			if (check.equalsIgnoreCase("Yes")) {
				String in = input();
				calculater(in);
			}
			else{

				break;
			}

		}

	}

	private static String input() {
		System.out.println("------------------------------------------------");
		System.out.println("Enter the shape of which you want to know the area : ");

		System.out.println("1.Square , 2.Rectangle , 3.Triangle , 4.Circle , 5.Rhombus");
		System.out.println("------------------------------------------------");

		Scanner inpt = new Scanner(System.in);
		String shape =  inpt.next();
		return shape;
	}

	private static void calculater(String shape) {



		if (shape.equalsIgnoreCase("Square"))
		{
			System.out.println("The shape you selected is : Square");

			System.out.println("Please enter the value of side of square : ");
			Scanner inpt1 = new Scanner(System.in);
			double side = inpt1.nextInt();

			double area = side*side;
			System.err.println("Formula : Area = (Side)*(Side)");
			try {
				System.out.println("Calculating...");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The area of Square having its side - "+side+" is  ");
			System.err.println("Area of Square : "+area+" Sq.units");
		}

		else if (shape.equalsIgnoreCase("Rectangle")) {

			System.out.println("The shape you selected is : Rectangle "); 
			System.out.println("Enter the value of Length of Rectangle ");
			Scanner inpt2 = new Scanner(System.in);
			double length = inpt2.nextInt();
			System.out.println("Enter the value of Breadth of Rectanlge ");
			Scanner inpt3 = new Scanner(System.in);
			double breadth = inpt3.nextInt();
			System.err.println("Formula : Area = (Length)*(Breadth)");
			double area1 = length*breadth;
			try {
				System.out.println("Calculating...");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The area of Rectangle having its length - "+length+" and its breadth - "+breadth );
			System.err.println("Area of Rectangle is  : "+area1+" Sq.units");		}
		else if (shape.equalsIgnoreCase("Triangle")) {

			System.out.println("The shape you selected is Triangle ");
			System.out.println("Enter the value of Base of Triangle : ");
			Scanner inpt4 = new Scanner(System.in);
			double base = inpt4.nextInt();
			System.out.println("Enter the value of Height of Triangle : ");
			Scanner inpt5 =new Scanner (System.in);
			double height = inpt5.nextInt();

			double area21 = base*height;
			double area22 = area21/2;
			System.err.println("Formula : 1/2 *(Base)*(Height)");
			try {
				System.out.println("Calculating...");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The area of Triangle having base - "+base+" and height - "+height);
			System.err.println("The are of Triangle : "+area22+" Sq.units");
		}
		else if (shape.equalsIgnoreCase("Circle") ) {

			System.out.println("The shape you selected is Circle :");
			System.out.println("Enter the value of Radius of Circle :");

			Scanner inpt6= new Scanner(System.in);
			double radius = inpt6.nextInt();
			double area31= radius*radius*22;
			double area32=area31/7;
			System.err.println("Formula : πr^2 ");
			try {
				System.out.println("Calculating...");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("The area of Circle having radius - "+radius);
			System.err.println("The area of circle : "+area32+" Sq.units");
		}
		else if (shape.equalsIgnoreCase("Rhombus")) {

			System.out.println("The shape you selected is Rhombus :");
			System.out.println("Enter the value of First Diagonal of Rhombus (d1) : ");
			Scanner inpt7 = new Scanner(System.in);
			double d1= inpt7.nextInt();
			System.out.println("Enter the value of Second Diagonal of Rhombus (d2) :");
			Scanner inpt8 = new Scanner(System.in);
			double d2 = inpt8.nextInt();

			double area51=d1*d2;
			double area52 = area51/2;
			System.err.println("Formula : (d1)*(d2)/2");
			try {
				System.out.println("Calculating...");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The area of Rhombus having d1 - "+d1+" and d2 - "+d2);
			System.err.println("The area of Rhombus : "+area52+" Sq.units");
		}

		else {
			System.err.println(" Please select the correct shape :)");

		}

		System.out.println("Do you want to compute another calculation (Yes / No)");
	}

}
