package dinosauring;

import java.util.ArrayList;
import java.util.List;

public class Dipolasaurs {

	public static void main(String[] args) {
		
		List<Integer> first =new ArrayList<Integer>();
		first.add(1);
		first.add(2);
		first.add(3);
		first.add(4);
		first.add(5);
		first.add(6);
		first.add(7);
		first.add(8);
		first.add(9);
		first.add(10);
		
		System.out.println("Default list : "+first);
		 
		//Using conventional Loop
		
		System.out.println("################ CONVENTIONAL LOOP ###################");
		List<Integer> second= new ArrayList<Integer>();
		for(int a = 0; a <first.size(); a++) {
			
			System.out.println("My element : "+ first.get(a));
			int d = first.get(a)*2;
			second.add(d);
		}
		System.out.println("Doubled List : "+second);
		
		
		//Advanced for loop
		System.out.println("################ ADVANCED FOR  LOOP ###################");
		List<Integer> third= new ArrayList<Integer>();
				for(Integer e : first) {
					System.out.println("My element in adv  for loop : "+ e);
					
					int k=e*e;
					third.add(k);
					
				}
				System.out.println("Squaring the element : "+third);
				
		//for Each  API
				System.out.println("###############Using For each command###########");
				first.forEach(s-> System.out.println("Element :" + s));
				
				
		// stream api
				System.out.println("#############################Using Stream Api###########################");
				List<Integer> doubledList = new ArrayList<>();
				first.stream().forEach(z -> doubledList.add(z*2));
				System.out.println("DL" + doubledList);
				
	}
}
