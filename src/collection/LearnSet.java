package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		/**
		 * Hash set
		 */
		Set<String> s1 = new HashSet<String>();
		s1.add("BD");
		s1.add("AB");
		s1.add("EF");
		s1.add("AB");
		s1.add(null);
		s1.add("");
		System.out.println("Hash Set -Random:" + s1);

		s1.clear();

		s1 = new LinkedHashSet<String>();
		s1.add("BD");
		s1.add("AB");
		s1.add("EF");
		s1.add("AB");
		s1.add("AB");
		s1.add(null);

		System.out.println("Linked Hash Set - Insertion Order:" + s1);
		s1.clear();

		s1 = new TreeSet<String>();
		s1.add("BD");
		s1.add("AB");
		s1.add("EF");
		s1.add("AB");
		// s1.add(null);

		System.out.println("Tree Set - Sorting Order:" + s1);

		Iterator<String> itr = s1.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}

}
