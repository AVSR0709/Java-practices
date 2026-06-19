package dinosauring;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class steganosaurs {
	
	public static void main(String[] args) {
		
		System.out.println("******************************** About Set and Using all commands ************************************");
		System.out.println("________________________________________________________________________________________________________");
		System.out.println("________________________________________________________________________________________________________");
		
		// Creating a Set //
		Set<String> good=new HashSet<String>();
		
		//Using commands of set // 
		System.out.println();
		System.out.println("################ Adding elements in a Set ################");
		good.add("USA");
		good.add("Russia");
		good.add("China");
		good.add("India");
		good.add("Japan");
		good.add("Germany");
		good.add("Taiwan");
		good.add("Indonesia");
		good.add("Pakistan");
		good.add("Israel");
		System.out.println();
		System.out.println(good);
		System.out.println();
		System.out.println("############### Finding element by its position ##############");	
		System.out.println();

		
		System.out.println("############## Removing an element #############");
		System.out.println();
		System.out.println("------------------------ Removing Pakistan from set ----------------");
		good.remove("Pakistan");
		System.out.println();
		System.out.println(good);
		System.out.println();
		System.out.println("############### Checking an element in Set #################");
		System.out.println();
		System.out.println("Does set contain Sri Lana {True/False} : "+good.contains("Sri Lanka"));
		
		
		
		// Comparison of List and Set 
		System.out.println();
		System.out.println("########################### Comparison of Set and List ############################ ");
		System.out.println();
		ArrayList<String> beta=new ArrayList<String>();
		Set<String> alpha=new HashSet<String>();
	
		alpha.add("A");
		beta.add("A");
		System.out.println("Elements in Set : "+alpha);
		System.out.println("Elements in List : "+beta); 
		
		System.out.println();
		System.out.println("****************** Adding duplicate Numbers ***********************");
		System.out.println();
		alpha.add("A");
		beta.add("A");
		System.out.println("Elements in Set : "+alpha);
		System.out.println("Elements in List : "+beta);
		System.out.println();

		System.out.println("------->  SET DOESNT CONSIDER DULPICATES <--------- ");
		System.out.println("------->  List DOES CONSIDER DULPICATES <--------- ");
		
		System.out.println();
		beta.remove("A");
		alpha.add("E");
		beta.add("E");
		alpha.add("G");
		beta.add("G");
		alpha.add("C");
		beta.add("C");
		alpha.add("D");
		beta.add("D");
		alpha.add("F");
		beta.add("F");
		alpha.add("H");
		beta.add("H");
		alpha.add("B");
		beta.add("B");
		
		System.out.println("Elements in Set : "+alpha);
		System.out.println("Elements in List : "+beta);
		System.out.println();
		System.out.println("------->  SET doesnt keep in  order <--------- ");
		System.out.println("------->  List keeps elements in order they are added <--------- ");
		
		LinkedList<String> myll = new LinkedList<>();
		
		myll.add("A");
		myll.add("B");
		myll.add("C");
		
		System.out.println("Linked List:" + myll);
		
		myll.push("D");
		myll.push("K");
		System.out.println("After push :" + myll);
		myll.pop();
		System.out.println("After pop:" + myll);
		
		
		
	}
}
