package com.java.training.twodefaultmethods;

public interface IBonus {
	void bonusAmount(int amount);

	default void policyType() {
		System.out.println("Bonus");
	}
}
