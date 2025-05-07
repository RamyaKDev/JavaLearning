package com.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReader1 {

	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("D://1_Besant//Testing//sample/new.txt");
		int no=reader.read();
		int spaces=1;// Number of words can count based on spaces
		int no_of_sentences=0;
		while(no!=-1) {
		System.out.print((char)no);
		
		no=reader.read();
		if((char)no==' ')
			spaces++;
		
		if((char)no=='.')
			no_of_sentences++;
		}
		System.out.println();
		System.out.println("number of words "+spaces);
		System.out.println();
		System.out.println("number of sentences "+no_of_sentences);
	}

}
