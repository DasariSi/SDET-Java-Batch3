package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FIleInputOutputStream {

	public static void main(String[] args) {

		/**
		 * FIle Read
		 */
		File f = new File("test.txt");
		try {
			FileInputStream fis = new FileInputStream(f);
			int content;
			while ((content = fis.read()) != -1) {
				System.out.print((char) content);
			}
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/**
		 * File Write/Append
		 */
		try {
			FileOutputStream fout = new FileOutputStream(f, true);
			String str = "Testing Inputstream in Java";
			fout.write(str.getBytes());
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
