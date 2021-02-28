package comparators;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {

		System.out.println("Inside RatingCOmpare Method:"+o1.getRating()+" -- "+o2.getRating());
		
		
		if (o1.getRating() < o2.getRating())
			return -1;
		else if (o1.getRating() > o2.getRating())
			return 1;
		else
			return 0;

	}

}
