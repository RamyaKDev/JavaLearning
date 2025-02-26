package com.Collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesdemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties p=new Properties();
		FileInputStream fis= new FileInputStream("D://Eclipse//Collection//src//com//Collection//test.properties");
	p.load(fis);
	System.out.println(p);
	System.out.println(p.getProperty("idli"));
	System.out.println(p.setProperty("idli", "5"));
	FileOutputStream fos=new FileOutputStream("D://Eclipse//Collection//src//com//Collection//test.properties");
	p.store(fos, "Updated Price");
	}
	

}
