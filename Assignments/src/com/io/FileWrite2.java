package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite2 {

	public static void main(String[] args) throws IOException {
		File note=new File("D://1_Besant//Testing//sample/new.txt");
		note.createNewFile();
		
		//Using FileWriter
		FileWriter pen=new FileWriter(note);
		pen.write("This is my first line.");
		pen.write("\n");
		pen.write("This is my second line.");
		pen.write("\n");
		//pen.close();
	   
		 // Using BufferedWriter
		
		BufferedWriter writer= new BufferedWriter(pen);
		writer.append("This is my third line.");
		writer.newLine();
		writer.append("This is my fourth line.");
		 writer.flush();
		 writer.close();
	   

	}

}
