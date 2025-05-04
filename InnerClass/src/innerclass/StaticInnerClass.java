package innerclass;
class Outer1{
	 public void displayOuter() {
			System.out.println("Outer class method");
		}
	static class Inner1{
	public void displayInner() {
		System.out.println("Inner class method");
	}
	 }
}
public class StaticInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer1.Inner1 in=new Outer1.Inner1();
				in.displayInner() ;
	}

}
