package programs;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_Demo_Double_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  ArrayList<Double>ar = new ArrayList<Double>();
		  ArrayList<Double>arr = new ArrayList<Double>();
		  
		  ar.add(5.0);
		  ar.add(20.0);
		  ar.add(30.3);
		  ar.add(1, 40.5);
		  ar.addAll(ar);
		 
		  System.out.println(ar);
		  System.out.println(ar.get(2));
		      ar.set(2 ,35.6);
		  System.out.println(ar);
		  ar.remove(3);
		  System.out.println(ar);
		     ar.remove(0);
		  System.out.println(ar);
		  ar.contains(20.0);
		  System.out.println(ar.contains(20.0));
		  
		  System.out.println(ar.size());
		  
		  System.out.println(ar.isEmpty());
		 Collections.sort(ar);
		  System.out.println(ar);
		   
		  arr.add(3.0);
		  arr.toArray();
		  System.out.println(arr);
		 
	}

}
