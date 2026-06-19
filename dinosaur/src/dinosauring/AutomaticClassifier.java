package dinosauring;

import java.util.ArrayList;
import java.util.List;

public class AutomaticClassifier {
	
	public static void main(String[] args) {
		
		List<Integer> even=new ArrayList<Integer>();
		List<Integer> odd=new ArrayList<Integer>();
		
		for (int k = 1; k <= 100; k++) {
			
			int z=k%2;
			if (z==0) {
				
				even.add(k);
				
				
			} 
			else{
				
				
				odd.add(k);

			}
			
			
			
			
		}
		System.out.println("List of Even Numbers : "+even);
		System.out.println("List of Odd Numbers : "+odd);
		
		
		System.out.println("############### FOR LOOP ###################");
		for (int m = 1; m <= 10; m++) {
			System.out.println(m);
		}
		
		System.out.println("############### WHILE LOOP ##################");
		
		int r=1;
		while ( r<=10 ) {
			System.out.println(r);
			r++;
		}
		
		
		System.out.println("############### DO WHILE LOOP ##################");
		int l=1;
		 do {
			 System.out.println(l);
			 l++;
		 }
		 while (l<=10);
		 
	}
	private void Sysout() {
		// TODO Auto-generated method stub

	}
}
		 
			
	
	


