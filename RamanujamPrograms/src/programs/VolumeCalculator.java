package programs;
import java.util.Scanner;
public class VolumeCalculator {
	public static void main(String[] args) {
		
		System.out.println("********************* Welcome to Volume Calculator**********************");
		System.out.println("Enter the name of 3-D shape to calculate volume ");
		System.out.println("1.Cube , 2.Cuboid , 3.Cylinder , 4.Cone , 5.Pyramid ");
		System.out.println("6.Sphere , 7.Rectangular Prism , 8.Semi Sphere");
		Scanner inpt = new Scanner (System.in);
		String shape=inpt.next();
		System.out.println("");
		if (shape.equalsIgnoreCase("Cube")) {
			System.out.println("The shape you chose is : Cube");
			System.out.println("");
			System.out.println("Please enter the value of Side of Cube :");
			Scanner inpt1 = new Scanner(System.in);
			double side=inpt1.nextDouble();
			System.out.println("The side of cube :-"+side);
			System.out.println("");
			System.err.println("Formula : Volume = (Side)^3");
			double volume1 =side*side*side;
			try {
				System.out.println("Calculating...");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The volume of cube having side - "+side);
			System.out.println("");
			System.err.println("The volume of cube : "+volume1);
		}
		
		else if (shape.equalsIgnoreCase("Cuboid")) {
			System.out.println("The shape you chose is : Cuboid");
			System.out.println("");
			System.out.println("Please enter the value of Length of Cuboid :");
			Scanner inpt2 = new Scanner(System.in);
			double length=inpt2.nextDouble();
			System.out.println("The length of cube :-"+length);
			System.out.println("");
			System.out.println("Please enter the value of Breadth of Cuboid :");
			Scanner inpt3 = new Scanner(System.in);
			double breadth=inpt3.nextDouble();
			System.out.println("The breadth of cuboid :-"+breadth);
			System.out.println("");
			System.out.println("Please enter the value of Height of Cuboid :");
			Scanner inpt4 = new Scanner(System.in);
			double height=inpt4.nextDouble();
			System.out.println("The height of cube :-"+height);
			System.out.println("");
			System.err.println("Formula : Volume = l*b*h");
			double volume2 =length*breadth*height;
			try {
				System.out.println("Calculating...");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("");
			System.out.println("The volume of cuboid having length - "+length+" breadth - "+breadth+" & height - "+height);
			System.out.println("");
			System.err.println("The volume of cube : "+volume2);
		}
		
		else if (shape.equalsIgnoreCase("Cylinder")) {
			System.out.println("The shape you chose is : Cylinder");
			System.out.println("");
			System.out.println("Enter the value of Radius of Cylinder :");
			Scanner inpt5=new Scanner(System.in);
			double radius1 = inpt5.nextDouble();
			System.out.println("");
			System.out.println("Enter the value of Height of Cylinder :");
			Scanner inpt6=new Scanner(System.in);
			double height1 = inpt6.nextDouble();
			System.out.println("");
			System.err.println("Formula : Volume = (π)*(r^2)*(h)");
			double volume31 = 22*radius1*radius1*height1;
			double volume3 = volume31/7;
			try {
				System.out.println("Calculating...");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The volume of cylinder having radius - "+radius1+" & height - "+height1);
			System.out.println("");
			System.err.println("The volume of Cylinder : "+volume3);
			
		}
		else if (shape.equalsIgnoreCase("Cone")) {
			System.out.println("The shape you chose is : Cone");
			System.out.println("");
			System.out.println("Enter the value of Radius of cone :");
			System.out.println("");
			Scanner inpt6 =  new Scanner (System.in);
			double radius2 = inpt6.nextDouble();
			System.out.println("Enter the value of Height of cone :");
			Scanner inpt7 =  new Scanner (System.in);
			double height2 = inpt7.nextDouble();
			System.out.println("");
			System.err.println("Formula : Volume = (1/3)*(π)*(r^2)*(h)");
			double volume41 = 22*radius2*radius2*height2;
			double volume411=volume41/3;
			double volume42 = volume411/7;
			try {
				System.out.println("Calculating...");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The volume of cone having radius - "+radius2+" & height - "+height2);
			System.out.println("");
			System.err.println("The volume of Cone is : "+volume42);
			
		}
		
		
		
		else if (shape.equalsIgnoreCase("Pyramid")) {
			System.out.println("The shape you chose is : Pyramid");
			System.out.println("");
			System.out.println("Select the type of Pyramid : ");
			System.out.println("");
			System.out.println(" 1.Triangular Pyramid  \n 2. Square Pyramid \n 3.Rectangular Pyramid \n 4.Pentagonal Pyramid");
			
			Scanner inpt10 = new Scanner(System.in);
			String pyramid_type = inpt10.next();
			
			if (pyramid_type.equalsIgnoreCase("Triangular Pyramid")) {
				System.out.println("The shape you selcected is : Triangular Pyramid");
				System.out.println("");
				System.out.println("");
			}
			else if (pyramid_type.equalsIgnoreCase("Triangular Pyramid")) {
				
			}

			else if (pyramid_type.equalsIgnoreCase("Triangular Pyramid")) {
				
			}
			
			else if (pyramid_type.equalsIgnoreCase("Triangular Pyramid")) {
				
			}
			else {
				System.err.println("Please select the appropriate shape :)");
			}

		}
		
		
		
		
		else if (shape.equalsIgnoreCase("Sphere")) {
			System.out.println("The shape you chose is : Sphere");
			System.out.println("");
			System.out.println("Enter the value of Radius of Sphere :");
			Scanner inpt8 = new Scanner(System.in);
			double radius3 = inpt8.nextDouble();
			double volume51 = radius3*radius3*radius3*22*4;
			double volume511 = volume51/21;
			System.out.println("");
			System.err.println("Formula : volume = (4/3)*(π)*(r^3)");
			try {
				System.out.println("Calculating...");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The volume of Semi sphere having radius - "+radius3);
			System.out.println("");
			System.err.println("The volume of Sphere is : "+volume511);
			
		}
		
		
		else if (shape.equalsIgnoreCase("Prism")) {
			System.out.println("The shape you chose is : Prism");
		}
		
		
		else if (shape.equalsIgnoreCase("SemiSphere")) {
			System.out.println("The shape you chose is : Semi Sphere");
			System.out.println("");
			System.out.println("Enter the value of Radius of Semi Sphere :");
			System.out.println("");
			Scanner inpt9 = new Scanner(System.in);
			double radius4 = inpt9.nextDouble();
			double volume81 = radius4*radius4*radius4*22*2;
			double volume811 = volume81/21;
			System.err.println("Formula : volume = (2/3)*(π)*(r^3)");
			System.out.println("");
			try {
				System.out.println("Calculating...");
				Thread.sleep(700);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("The volume of Semi Sphere having radius - "+radius4);
			System.out.println("");
			System.err.println("The volume of Semi Sphere is : "+volume811);
		}
		else {
			System.err.println("Please select the appropriate shape :)");
		}
	}

}
