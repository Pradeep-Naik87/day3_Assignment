package com.interfaces2;

public class AccountHolder implements SBI {

	@Override
	public void deposit() {
		System.out.println("Depositing Amount");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdrawing Amount");

	}

}
