package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ApplicationOfMaps {

	public static void main(String[] args) {
		
		Scanner inpt = new Scanner(System.in);
		System.out.println("Type the Key value you want to check");
		int number;
		number=inpt.nextInt();
		
	
		Map<Integer,String> good = new HashMap<>();
		good.put(0,"USA");
		good.put(1,"Russia");
		good.put(2,"China");
		good.put(3,"India");
		good.put(4,"Iran");
		good.put(5,"Yemen");
		good.put(6,"Japan");
		good.put(7,"Mexico");
		
		System.out.println("Key Value that you want to check :" +number);
		System.out.println("Default Map : "+good);
		
		if (good.containsKey(number)) {
			System.out.println("Your Key Value is present in Map : ");
			System.out.println();
			System.out.println("Your value is : "+good.get(number));
			
		} else {
			System.out.println("Your Key Value is present in Map : ");
			System.out.println();
			
			System.out.println("What is the value you want to add : ");
			System.out.println();
			String value;
			value=inpt.next();
			good.put(number, value);
			System.out.println();
			System.out.println("New Key and value is added : "+ good);
		}
		
	}
	
}
