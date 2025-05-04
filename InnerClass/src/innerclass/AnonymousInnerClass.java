package innerclass;
class Outer4{
	 public void display() {
			System.out.println("Outer class method");
		}
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		Outer4 out=new Outer4() 
		{
			public void display() {
				System.out.println("AnonymousInnerClass method");
			}
		};
		out.display();

	}

}
