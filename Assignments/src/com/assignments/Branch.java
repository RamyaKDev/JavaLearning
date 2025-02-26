package com.assignments;
//import com.assignments.*;

	public class Branch extends BranchPlan{
		
		@Override
		public void receive_Customers() {
			// TODO Auto-generated method stub
			System.out.println("overridden method");
		}
		
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	//HeadOffice branch= new Branch();
	Branch branch= new Branch();
	branch.check_accounts(1000);
	int tax_amount=branch.pay_tax(2000);
	System.out.println("Tax amount "+tax_amount);
	branch.receive_Customers();
	//BranchPlan branch1= new Branch();
	branch.do_interview();
}
	
}
