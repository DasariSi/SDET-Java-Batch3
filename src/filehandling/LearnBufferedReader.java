package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LearnBufferedReader {

	public static void main(String[] args) {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("test.txt")));
			String line;
			String ls = System.getProperty("line.separator");
			StringBuilder sb = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
				sb.append(ls);
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
