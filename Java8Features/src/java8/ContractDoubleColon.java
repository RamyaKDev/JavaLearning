package java8;

import java.util.function.Consumer;

public class ContractDoubleColon{ //implements Consumer1 {

	public static void main(String[] args) {
		Consumer c=(no)->System.out.println(no);
		c.accept(5000);
		ContractDoubleColon cdc=new ContractDoubleColon();
		Consumer1 c1=cdc::display;
		cdc.display(50);
	}

	
	public void display(int no) {
		
		System.out.println(no+200);
	}

}
