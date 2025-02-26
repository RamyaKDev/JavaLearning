package com.assignments;

public abstract class HeadOffice {
	public void check_accounts(int amount) {
		System.out.println(amount);
	}
	public int pay_tax(int amount) {
		return amount;
	}
	public abstract void receive_Customers();
}
