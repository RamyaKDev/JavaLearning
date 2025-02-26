package com.bank.madurai;

import com.bank.chennai.*;

class Account_Holder_Madurai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI sbi=new SBI();
		sbi.create_account();
		sbi.get_loan(10000);
		String empName = sbi.empName="AdhiPranav";
		int empId = sbi.empId=25;
		String branch_name = SBI.branch_name;
		System.out.println(empName);
		System.out.println(empId);
		System.out.println(branch_name);
	}

}
