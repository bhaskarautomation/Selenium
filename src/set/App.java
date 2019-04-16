package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		//Hashset does not retain order
		
		//Set<String> set1 = new HashSet<String>();
		
		//LinkedHashset remembers the order you add items in
		
		//Set<String> set1 = new LinkedHashSet<String>();
		
		//Treeset sorts in natural order
		
		Set<String> set1 = new TreeSet<String>();
		
		if(set1.isEmpty());
		{
			System.out.println("Set is empty at the start");
		}
		
		set1.add("dog");
		set1.add("cat");		
		set1.add("rat");
		set1.add("snake");
		set1.add("bear");
		
		set1.add("bear");		
		System.out.println(set1);
		
		if(set1.isEmpty());
		{
			System.out.println("Set is empty after adding some items");
		}
		//Adding duplicates items does nothing in sets.It will simply ignore the duplicates
		
		
		
		if(set1.isEmpty());
		{
			System.out.println("Set is empty at the end");
		}
		
		//////Iteration////////
		
		for(String element:set1)
		{
			System.out.println(element);
			
		}
		
		///////Does set contains a given item//////
		
		if(set1.contains("ardvark")){
		
			System.out.println("contains ardvark");
		}
		
		if(set1.contains("cat")){
			
			System.out.println("contains cat");
		}
		
		
		
	}

}
