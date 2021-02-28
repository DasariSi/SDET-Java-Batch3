package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListOfHashMap {

	public static void main(String[] args) {

		/**
		 * Storage
		 */
		ArrayList<HashMap<String,String>> al = new ArrayList<HashMap<String,String>>();
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Name", "TEST1");
		hm.put("EmpId", "E01");
		
		al.add(hm);
		
		hm= new HashMap<String, String>();
		
		hm.put("Name", "TEST2");
		hm.put("EmpId", "E03");
		
		al.add(hm);
		
		System.out.println(al);
		
		
		/**
		 * Traversing
		 */
		
		for (HashMap<String, String> hashMap : al) {
			
			System.out.println(hashMap);
			
			for (String key : hashMap.keySet()) {
				System.out.println("Key:"+key);
				System.out.println("Value:"+hashMap.get(key));
			}
			
		}
		
		
	}

}
