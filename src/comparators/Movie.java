package comparators;

public class Movie implements Comparable<Movie> {

	private int year;
	private String name;
	private int rating;

	public Movie(String name, int year, int rating) {
		this.name = name;
		this.year = year;
		this.rating = rating;
	}

	public int getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Movie o) {

		System.out.println("Inside COmpareTo::"+year+" --"+ o.year);
		
		if(year == o.year)
			return 0;
		else if(year > o.year)
			return 1;
		else
			return -1;
	
	}
	
}
