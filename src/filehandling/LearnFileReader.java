package filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LearnFileReader {

	public static void main(String[] args) {

		File f = new File("test.txt");

		try {
			FileReader fr = new FileReader(f);
			int content;
			while ((content = fr.read()) != -1) {
				System.out.print((char) content);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
