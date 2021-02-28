package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {

		Map<String, String> hm = new HashMap<String, String>();
		hm.put("key3", "Value3");
		hm.put("Key1", "Value1");
		hm.put("Key2", null);
		hm.put(null, "Value2"); // allow null key
		hm.put("Key4", null); // allow null value
		hm.put(null, "Value5");

		System.out.println(hm);

		System.out.println(hm.get("Key1"));

		for (String k : hm.keySet()) {

			System.out.println("Key: " + k);
			System.out.println("Value:" + hm.get(k));

		}

		System.out.println(hm.containsKey("Key4"));
		System.out.println(hm.containsValue(null));
		
		System.out.println(hm.remove(null));
		System.out.println(hm.isEmpty());
		System.out.println(hm.replace("key1", "Value", "Value01"));
		System.out.println(hm.replace("key1", "Value1", "Value01"));
		System.out.println(hm.size());

		hm.clear();

		hm = new LinkedHashMap<String, String>();
		hm.put("key3", "Value3");
		hm.put("Key1", "Value1");
		hm.put("Key2", null);
		hm.put(null, "Value2"); // allow null key
		hm.put("Key4", null); // allow null value
		hm.put(null, "Value5");

		System.out.println(hm);

		hm.clear();

		hm = new TreeMap<String, String>();
		hm.put("Key3", "Value3");
		hm.put("Key1", "Value1");
		hm.put("Key2", null);
		// hm.put(null, "Value2"); //not allow null key
		hm.put("Key4", null); // allow null value
		// hm.put(null, "Value5");
		System.out.println(hm);

		hm.clear();

		hm = new Hashtable<String, String>();
		hm.put("Key3", "Value3");
		hm.put("Key1", "Value1");
		// hm.put("Key2", null); //null value not allowed
		// hm.put(null, "Value2"); //not allow null key

		System.out.println(hm);

	}

}
