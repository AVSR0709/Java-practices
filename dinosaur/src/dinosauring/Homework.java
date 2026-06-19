package dinosauring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 20 ; i++) {
			
			int z=i*i;
			System.out.println(i +" X " +i +" = "+z );
		}
		System.out.println("###################");
		
		
		for (int i = 1; i <=10; i++) {
			
			for (int j = 1; j <= 10; j++) {
				
				int k=i*j;
				System.out.println(i +" X "+j +" = "+k);
				
				
			}
			System.out.println("###################");
		
		
		
		}
		
List<GetSetGo> Employee = new ArrayList<GetSetGo>();
		
		GetSetGo first=new GetSetGo();
		first.setName("Mukesh Ambani");
		first.setId(848720);
		first.setRole("Waiter");
		first.setPlace(true);
		Employee.add(first);
		System.out.println(Employee); 
	}
}
