package com.springBanking;

public abstract class BankAccountRepositoryImpl implements BankAccountRepository
{
	private void BankAccountRepositoryImplementation()
	{
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountHolderName("sam");
		bankAccount.setAccountId(11);
		bankAccount.setAccountType("Savings");
		bankAccount.setAccountBalance((long) 100342.222);
	}
	
	

}
