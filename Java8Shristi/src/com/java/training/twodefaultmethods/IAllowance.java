package com.java.training.twodefaultmethods;

public interface IAllowance {
	void allowanceAmount(int amount);

	default void policyType() {
		System.out.println("Allowance");
	}
}
