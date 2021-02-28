package exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LearnCheckedExceptions {

	/**
	 * FileNotFOund exception IOException ClassNotFoundException
	 * 
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) {

		try {
			func();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void func() throws IOException, ClassNotFoundException {

		FileInputStream fi = null;

		fi = new FileInputStream(new File("Test.txt"));

		int n;

		while ((n = fi.read()) != -1) {
			System.out.println((char) n);
		}

		fi.close();

		String driver = "com.mysql.jdbc.driver";
		Class.forName(driver);

	}

}
