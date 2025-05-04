package innerclass;



class Outer3{
	 public void displayOuter() {
			System.out.println("Outer class method");
			class Inner3{
				public void displayInner() {
					System.out.println("Inner class method");
				}
				 }
			Inner3 in=new Inner3();
			in.displayInner();
		}
	 
	
}
public class MethodLocalInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer3 out= new  Outer3();
		 out.displayOuter();
	}

}
