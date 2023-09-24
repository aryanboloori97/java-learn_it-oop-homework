package oop_homework_3;

import java.util.ArrayList;
import java.util.List;

public class Account {					
	int id;
	List<Transaction> transactions = new ArrayList<Transaction>();

	private class Transaction{
	
		Account accountFrom;
		Account accountTo;
		double amount;
		StandardAccountOperation operation;
		
		
	public Transaction(Account accountFrom, Account accountTo, double amount, StandardAccountOperation operation) {
		super();
		this.accountFrom = accountFrom;
		this.accountTo = accountTo;
		this.amount = amount;
		this.operation = operation;
	}
}
	
	public void sendMoneyToAccount(Account receiverAccount, double amount) {
		
		Transaction transactionSender = new Transaction(this, receiverAccount, amount, StandardAccountOperation.MONEY_TRANSFER_SEND);
		Transaction transactionReceiver = new Transaction(null, null, amount, StandardAccountOperation.MONEY_TRANSFER_RECEIVER);
		this.transactions.add(transactionSender);
		receiverAccount.transactions.add(transactionReceiver);
		
	}
	
	public void withdrawMoney(double amount) {
		Transaction transaction = new Transaction(this, null, amount, StandardAccountOperation.WITHDRAW);
		this.transactions.add(transaction);

	}
	
	public Transaction[] getTransactions(){
		
		Transaction[] arrayTransactions = new Transaction[this.transactions.size()];
		this.transactions.toArray(arrayTransactions);
		return arrayTransactions;
		
		
	}
	
	
}
