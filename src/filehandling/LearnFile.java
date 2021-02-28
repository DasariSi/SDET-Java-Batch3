package filehandling;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LearnFile {

	public static void main(String[] args) {

		String path = "C:\\Users\\YOGESH RANA\\Desktop\\DevLab Training\\SDET-Java1.txt";
		path = "C:/Users/YOGESH RANA";

		File f = new File("test.txt");

		if (f.exists())
			System.out.println("File ALready Exists");
		else {
			System.out.println("File do not exist.. please create it");

			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println(f.isFile());
		System.out.println(f.isHidden());
		System.out.println(f.isDirectory());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());

		//long l = f.lastModified();

		String s="C:\\Users\\YOGESH RANA\\Desktop\\DevLab Training";
		
		File f2 = new File(s);
		// f2.mkdir();

		List<File> al = new ArrayList<File>();

		File[] f3 = f2.listFiles();
		System.out.println(f3.length);
		for (File file : f3) {
			System.out.println(file.getPath());

			if (file.getName().endsWith(".txt"))
				al.add(file);
		}
		System.out.println(al);

	}

}
