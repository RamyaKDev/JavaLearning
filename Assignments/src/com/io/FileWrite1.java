package com.io;

import java.io.File;
import java.io.IOException;

public class FileWrite1 {

	public static void main(String[] args) throws IOException {
		File file = new File("D://1_Besant//Testing/new.txt");
//		file.createNewFile();

//		File file1=new File("D://1_Besant//Testing/sample");
//		file1.mkdir();

//		File file2=new File("D://1_Besant//Testing/sample1/sample2");
//		file2.mkdirs();

//		File file3=new File("D://1_Besant//Testing/sample1/sample2/new.txt");
////		boolean s=file3.exists();
////		System.out.println(s);
//		file3.delete();

		File newfile = new File("D://1_Besant//Testing/sample.txt");
//		newfile.createNewFile();
		file.renameTo(newfile);

	}

}
