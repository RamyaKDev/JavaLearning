package innerclass;
interface demo1{
	public void display();
}
//We can do this for abstract class also
public class AbstractInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo1 demo=new demo1() 
		{
			public void display() {
				System.out.println("in method");
			}
		};
		demo.display();
	}

}
