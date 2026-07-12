package programs;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class FunctionsOfList {
	
	static List<String> Animals =new ArrayList<String>();
	
	public static void main(String[] args) {
			Animals.add("Dog");
			Animals.add("Cat");
			Animals.add("Horse");
		System.out.println(Animals);
		System.out.println("******************Adding a new element******************");
		    Animals.add("Bear");
		System.out.println(Animals);
		System.out.println("*******************Removing an element********************");
		Animals.remove(0);
		System.out.println(Animals);
		System.out.println("*****************Checking a element in list *****************");
		System.out.println("Does list contain Horse ?");
		System.out.println(Animals.contains("Horse"));
		System.out.println("******************Adding New element in 2nd position **********************");
		Animals.add(1,"Elephant");
		System.out.println(Animals);
		System.out.println("********************Finding element by its position ******************************");
		System.out.println("What is first element in list ?");
		System.out.println(Animals.get(0));
		System.out.println("*********************Clearing every element in list****************************");
		Animals.clear();
		System.out.println(Animals);
	}
	
	List<String> good = new LinkedList<String>();
	
}
