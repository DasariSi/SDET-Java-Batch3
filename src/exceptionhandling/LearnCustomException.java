package exceptionhandling;

public class LearnCustomException {

	public static void main(String[] args) {

		try {
			throw new MyCustomException("Testing Custom Exception");
		} catch (MyCustomException e) {
			e.printStackTrace();
		}

	}

}
