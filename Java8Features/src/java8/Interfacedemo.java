package java8;

@FunctionalInterface 
public interface Interfacedemo {
	public static void main(String[] args) {
		Interfacedemo.show();
	}
public int add(int no1,int no2);
public static void show() {
	System.out.println("static method in interface");
}
public default void display() {
	System.out.println("default method in interface");
}
}
