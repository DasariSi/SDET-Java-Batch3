package comparators;

import java.util.ArrayList;
import java.util.Collections;

public class LearnComparable {

	public static void main(String[] args) {

		ArrayList<Movie> al = new ArrayList<Movie>();
		al.add(new Movie("Special 26", 2013, 4));
		al.add(new Movie("Baby", 2015, 3));
		al.add(new Movie("Holiday", 2014, 5));

		System.out.println("Before SOrting");

		for (Movie movie : al) {
			System.out.println(movie.getName() + " - " + movie.getYear() + " - " + movie.getRating());
		}

		Collections.sort(al);

		System.out.println("After Sorting");

		for (Movie movie : al) {
			System.out.println(movie.getName() + " - " + movie.getYear() + " - " + movie.getRating());
		}

	}

}
