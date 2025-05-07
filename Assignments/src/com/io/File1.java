package com.io;

import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		File file=new File("D://1_Besant//Testing/sample1/sample2/new.txt");
		file.createNewFile();
		
		File file1=new File("D://1_Besant//Testing/sample1/sample2/movie.mp4");
		file1.createNewFile();
		
		File folder=new File("D://1_Besant//Testing/sample1/sample2");
		String[] files=folder.list();
		
		
		for(int i=0;i<files.length;i++)
		{
			//if(files[i].endsWith(".mp4"))
			System.out.println(files[i]);
		}

	}

}
