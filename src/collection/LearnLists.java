package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LearnLists {

	public static void main(String[] args) {

		List<String> al = new ArrayList<String>();
		al.add("CBC");
		al.add("ACB");
		al.add("ACB");
		al.add("BAC");

		List<String> al4 = new ArrayList<String>();
		al4.add("BAC");
		al4.add("ACB");
		al4.add("ACB");
		al4.add("CBC");

		System.out.println(al.containsAll(al4));

		al4.add("DAC");

		System.out.println(al.containsAll(al4));
		System.out.println(al4.containsAll(al));

		al.add(null);
		al.add("");

		al.add(2, "EFGGGG");

		System.out.println(al);

		// replacing certain content on particulr index
		al.set(1, "EFG");

		for (String string : al) {
			System.out.println(string);
		}

		System.out.println(al.size());
		al.remove(1);
		System.out.println(al);

		// 0 -initial index 2= tolastindex -1
		List<String> str = al.subList(0, 2);
		System.out.println(str);
		System.out.println(al.isEmpty());
		System.out.println(al.contains("BAC"));
		System.out.println(al.contains("BACD"));

		al.clear();
		System.out.println(al);

		al = new LinkedList<String>();
		al.add("CBC");
		al.add("ACB");
		al.add("ACB");
		al.add("BAC");
		al.add(null);
		al.add("");
		System.out.println(al);

		for (String string : al) {
			System.out.println(string);
		}

		al.clear();

		al = new Vector<String>();
		al.add("CBC");
		al.add("ACB");
		al.add("ACB");
		al.add("BAC");
		al.add(null);
		al.add("");
		System.out.println(al);

	}

}
