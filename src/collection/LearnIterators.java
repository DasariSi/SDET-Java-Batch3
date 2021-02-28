package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LearnIterators {

	public static void main(String[] args) {

		
		List<String> al = new ArrayList<String>();
		al.add("CBC");
		al.add("ACB");
		al.add("ACB");
		al.add("BAC");

		ListIterator<String> itr =null;		
		itr = al.listIterator();
		
		itr.add("New");
		
		System.out.println("Forward---------");
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		System.out.println("Backward---------");
		
		while(itr.hasPrevious())
			System.out.println(itr.previous());
		
		
		
		
		
		
		
	}

}
