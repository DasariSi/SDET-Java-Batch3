package collection;

import java.util.HashMap;

public class PrintOccur {

	public static void main(String[] args) {

		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		
		String str="ABD is legend";
		
		for(int i=0;i<str.length();i++)
		{
			char c= str.charAt(i);
			
			if(hm.containsKey(c))
				hm.put(c, hm.get(c)+1);
			else
				hm.put(c, 1);
			
		}
		
		for (Character k : hm.keySet()) {
			System.out.println("Key:"+k+" Value:"+hm.get(k));
		}
		
	}

}
