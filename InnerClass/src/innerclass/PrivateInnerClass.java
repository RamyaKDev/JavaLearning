package innerclass;
class Outer2{
	 public void displayOuter() {
			System.out.println("Outer class method");
			Inner2 in=new Inner2();
			in.displayInner();
		}
	private class Inner2{
	public void displayInner() {
		System.out.println("Inner class method");
	}
	 }
	
}
public class PrivateInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Outer2 out= new  Outer2();
		 out.displayOuter();
	}

}
