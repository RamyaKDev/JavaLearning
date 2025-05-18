package com.io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindMobilenumberfromFile {
	public static void main(String[] args) throws IOException {
		File folder=new File("C:/Users/ramya/OneDrive/Documents/Test");
		folder.mkdir();
		File note=new File("C:/Users/ramya/OneDrive/Documents/Test/test.txt");
		note.createNewFile();
		FileWriter pen = new FileWriter(note);		
		pen.write("A picture word essay  refers to an essay that utilizes a combination of "
				+ "images 68768 and written words to convey a message or tell a story. "
				+ "It's a form of visual storytelling, where the pictures and the words "
				+ "9879345634 work together to create a cohesive narrative.");
		pen.close();		
		BufferedReader reader=new BufferedReader(new FileReader("C:/Users/ramya/"
				+ "OneDrive/Documents/Test/test.txt"));
	
	Pattern pattern=Pattern.compile("[6-9][0-9]{9}");
	String input=reader.readLine();
		while(input!=null) {							
			Matcher matcher=pattern.matcher(input);
			while(matcher.find()) {
				System.out.print(matcher.group());				
			}			
			input=reader.readLine();
			System.out.println(" ");		}
		reader.close();
	} }
