package com.bank.chennai;

//import com.bank.chennai.SBI;

class Account_Holder {

	private static String empName;
	private static int empId;
	private static String branch_name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SBI sbi=new SBI();
sbi.create_account();
sbi.get_loan(10000);

empName = sbi.empName="Ramya";
empId = sbi.empId=45;
branch_name = SBI.branch_name;
System.out.println(empName);
System.out.println(empId);
System.out.println(branch_name);
	}

}

