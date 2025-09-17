package com.java.training.twodefaultmethods;

public class Employee implements IAllowance,IBonus{

	@Override
	public void bonusAmount(int amount) {
		System.out.println("Bonus "+(amount*2));
		
	}

	@Override
	public void allowanceAmount(int amount) {
		System.out.println("Allowance "+(amount*5));
		
	}

	@Override
	public void policyType() {
		System.out.println("Employee policy type");
		IAllowance.super.policyType();
		IBonus.super.policyType();
	}

}
