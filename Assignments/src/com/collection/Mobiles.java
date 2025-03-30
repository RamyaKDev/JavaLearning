package com.collection;

public class Mobiles implements Comparable {
String brand;
int price,ram;
public Mobiles(String brand, int price, int ram) {
	
	this.brand = brand;
	this.price = price;
	this.ram=ram;
}
void display() {
	System.out.println(this.brand+" "+this.price+" "+this.ram);
}
public String toString() {
	return this.brand+" "+this.price;
	
}
@Override
public int compareTo(Object o) {
	Mobiles mobile=(Mobiles) o;
	
	if(this.price>mobile.price)
		return 1;
	else if(this.price<mobile.price)
		return -1;
	else
	return 0;
	
}

}
