package programs;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ArrayList_Demo_Integer_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> array = new ArrayList<Integer>();
		array.add(10);
		array.add(100);
		array.add(983);
		
		System.out.println("Adding Element in ArrayList at End :");
		int add = sc.nextInt();
		System.out.println("Before : { "+array+" }");
		array.add(add);
		System.out.println("After : { "+array+" }");
		
		System.out.println("Getting Element in ArrayList :");
		int ins = sc.nextInt();
		System.out.println("Element : { "+array.get(ins)+" }");
		
		System.out.println("Removing Element in ArrayList :");
		int rem = sc.nextInt();
		System.out.println("Before : { "+array+" }");
		array.remove(rem);
		System.out.println("After : { "+array+" }");
			
		System.out.println("Setting Element in ArrayList :");
		int set = sc.nextInt();
		System.out.println("Enter Element ");
		int set1 = sc.nextInt();
		System.out.println("Before : { "+array+" }");
		array.set(set,set1);
		System.out.println("After : { "+array+" }");
		
		System.out.println("Size of ArrayList : "+array.size());
		
		System.out.println("Is ArrayList Empty ? : "+array.isEmpty());
		
		System.out.println("Adding Element in ArrayList at First :");
		int addf = sc.nextInt();
		System.out.println("Before : { "+array+" }");
		array.addFirst(addf);
		System.out.println("After : { "+array+" }");
		
		System.out.println("The orginal ArrayList : "+array);
		ArrayList <Integer> array2 = new ArrayList<Integer>();
		array2.add(120);
		array2.add(400);
		array2.add(93);
		System.out.println("The Second ArrayList : "+array2);
		System.out.println("Are they equal ? : "+array.equals(array2));
		
		System.out.println("Getting Element in ArrayList by IndexOf:");
		int iele = sc.nextInt();
		System.out.println("Element occured first time :  "+array.indexOf(iele)+" }");
		System.out.println("Element occured last time : "+array.lastIndexOf(iele));
		
		System.out.println("Removing First Element in ArrayList :");
		System.out.println("Before : { "+array+" }");
		array.removeFirst();
		System.out.println("After : { "+array+" }");
		
		System.out.println("Removing Last Element in ArrayList :");
		System.out.println("Before : { "+array+" }");
		array.removeLast();
		System.out.println("After : { "+array+" }");
		
		array.trimToSize();
		System.out.println(array);
		
		System.out.println("Checking Element in ArrayList :");
		int con = sc.nextInt();
		System.out.println("Element : { "+array.contains(con)+" }");
		
		System.out.println("Adding Element in ArrayList at Index:");
		int addi = sc.nextInt();
		System.out.println("Enter the Elemenet :");
		int addi1 = sc.nextInt();
		System.out.println("Before : { "+array+" }");
		array.add(addi,addi1);
		System.out.println("After : { "+array+" }");
		
		System.out.println("Cloning the ArrayList  : ");
		ArrayList<Integer>arr2 =(ArrayList<Integer>)
				array.clone();
		System.out.println(arr2);
		
		System.out.println("Clearing All Elements in ArrayList : ");
		array.clear();
		System.out.println("ArrayList :"+array);
		
		
	}

}
