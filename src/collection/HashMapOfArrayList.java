package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapOfArrayList {

	public static void main(String[] args) {

		
		/**
		 * Storage
		 */
		
		HashMap<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("TEST1");al.add("TEST2");al.add("TEST3");al.add("TEST4");al.add("TEST5");
		
		hm.put("Name", al);
		
		System.out.println(hm);
		
		//al= new ArrayList<String>();
		al.clear();
		
		al.add("E01");al.add("E02");
		al.add("E03");al.add("E04");al.add("E05");
		hm.put("EmpId", al);
		
		System.out.println(hm);
		
		
		/**
		 * Traversing
		 */
		for (String k : hm.keySet()) {
			
			System.out.println("Key:"+k);
			System.out.println("Values:");
			ArrayList<String> a=hm.get(k);
			for (String val : a) {
				System.out.println(val);
			}
			
			System.out.println();
		}
		
		
		
		
		
		
	}

}
