package dinosauring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryCounter {
	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<String>();
		Map<String,Integer> nice = new HashMap<String,Integer>();
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
