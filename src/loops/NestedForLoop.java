package loops;

public class NestedForLoop {

	public static void main(String[] args) {

		for (int i = 1; i <= 24; i++) // hour
		{

			System.out.println("Minutes clock started");
			for (int j = 1; j <= 60; j++) { // minutes
				System.out.println(j);

			}

			System.out.println("Hour");
			System.out.println(i);

		}

	}

}
