package com.question_3;

import java.util.Scanner;

public class AccountDetails {
	
	Scanner sc = new Scanner(System.in);
	
	
	public Account getAccountDetails(int accountId, String accountType, int balance) {
		
		if(balance<=0) {
			
			System.out.println("Balance should be positive");
			
			System.out.println("enter balance: ");
			
			balance = sc.nextInt();
			
			if(balance<=0) {
				
				getAccountDetails(accountId, accountType, balance);
				
			}
			
		}
		
		return new Account(accountId, accountType, balance);
		
	}
	
	public int getWithdrawAmount(int withdrawnBalance) {
		
		if(withdrawnBalance<=0) {
			
			System.out.println("Amount should be positive");
			
			System.out.println("enter the amount you want to withdraw: ");
			
			withdrawnBalance = sc.nextInt();
			
			if(withdrawnBalance<=0) {
				
				getWithdrawAmount(withdrawnBalance);
				
			}
			
		}
		
		return withdrawnBalance;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the account details: ");
		
		System.out.println("enter the account id: ");
		
		int accountId = sc.nextInt();
		
		System.out.println("enter account type: ");
		
		String accountType = sc.next();
		
		System.out.println("enter balance: ");
		
		int balance = sc.nextInt();
		
		AccountDetails accountDetails = new AccountDetails();
		
		Account account = accountDetails.getAccountDetails(accountId,accountType,balance);
		
		System.out.println("enter the amount to withdraw: ");
		
		int withdrawnBalance = sc.nextInt();
		
		int amountToBeWithdraw = accountDetails.getWithdrawAmount(withdrawnBalance);
		
		account.withdraw(amountToBeWithdraw);
		
	}

}
