package filehandling;

import java.io.File;

public class LastModifiedFIle {

	public static void main(String[] args) {

		String loc = "C:/Users/" + System.getProperty("user.name") + "/Downloads/";
		System.out.println(loc);
		File fl = new File(loc);
		
		File[] f = fl.listFiles();

		long lastmod = Long.MIN_VALUE;
		System.out.println(lastmod);
		;
		File result = null;

		for (File file : f) {

			if (file.lastModified() > lastmod) {
				lastmod = file.lastModified();
				result = file;
			}
		}

		System.out.println("Last Modified File :" + result.getPath());

	}

}
