package programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryCounter {
	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		Map<String,Integer> nice = new HashMap<String,Integer>();
		
		nice.keySet().size();
		fruits.add("Apple");
		fruits.add("Apple");
		fruits.add("Pineapple");
		fruits.add("Banana");
		fruits.add("Ice Apple");
		fruits.add("Apple");
		fruits.add("Watermelon");
		fruits.add("Apple");
		fruits.add("Ice Apple");
		fruits.add("Pineapple");
		fruits.add("Pineapple");
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Orange");
		int Keep = fruits.size();
		
 for(String f : fruits) {
	 if(nice.containsKey(f)) {
		int c =  nice.get(f);
		nice.put(f, c +1);
	 }else {
		 nice.put(f,1);
	 }
 }
System.out.println("My Map : "+ nice );		
		
		
		
		
		for (int i = 0; i < Keep; i++) {
			int count = 1;
			String mood = fruits.get(i);
			if (!nice.containsKey(mood)) {
				nice.put(mood,count);
				
			}else {
				nice.put(mood, nice.get(mood)+1);
				
			}
			
			
			}
		System.out.println(nice +"");
		
		
		
	}

}
