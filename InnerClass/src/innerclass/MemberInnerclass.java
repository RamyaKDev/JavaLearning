package innerclass;
 class Outer{
	 public void displayOuter() {
			System.out.println("Outer class method");
		}
	class Inner{
	public void displayInner() {
		System.out.println("Inner class method");
	}
	 }
}
public class MemberInnerclass {
public static void main(String[] args) {
	Outer.Inner in=new Outer().new Inner();
	in.displayInner();
	
	Outer out=new Outer();
	out.displayOuter();
}
}
