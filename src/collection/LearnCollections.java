package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollections {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Apple");
		al.add("Banana");
		al.add("Orangaes");
		al.add("Kiwis");

		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		Collections.reverse(al); //reverse elemnts of list
		System.out.println(al);

		Comparator C = Collections.reverseOrder(null);
		Collections.sort(al, C);
		System.out.println(al);
		
		Collections.sort(al, Collections.reverseOrder());
		System.out.println(al);
		
		Collections.sort(al);
		System.out.println(al);
	
		
		System.out.println(Collections.binarySearch(al, "AASD")); //-1 when search not found
		Collections.addAll(al, "Papaya","Keenu","watermelon");
		
		System.out.println(al);
		System.out.println(Collections.max(al));
		System.out.println(Collections.min(al));
		
		List<String> al2 = new ArrayList<String>();
		al2.add("al1");
		al2.add("al2");
		al2.add("al3");
		
		Collections.copy(al, al2);
		System.out.println(al);
		
		
	}

}
