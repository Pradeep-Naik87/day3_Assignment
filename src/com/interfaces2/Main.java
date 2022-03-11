package com.interfaces2;

public class Main {
	public static void main(String[] args) {
		AccountHolder acc = new AccountHolder();
		acc.deposit();
		acc.withdraw();

		SBI acc2 = new AccountHolder();
		acc2.deposit();
		acc2.withdraw();
	}
}
