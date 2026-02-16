import java.lang.*;

public class Account
{
	protected int accountNumber;
	protected String accountHolderName;
	protected double balance;
	public static int accountCount=0;
 
	public Account()
	{	
		System.out.println("Empty Account");
		this.accountNumber=-1;
		this.accountHolderName="No Name Set";
		this.balance=-1;
		accountCount++;
	}
	public Account(int accountNumber, String accountHolderName, double balance){	
		//this();
		System.out.println("Parameterized Account-P");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		accountCount++;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName = accountHolderName;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public int getAccountNumber(){return accountNumber;}
	public String getAccountHolderName(){return accountHolderName;}
	public double getBalance(){return balance;}
	
	
	public void deposit(double amount){
		if(amount>0){
			balance += amount;
		}
	}
	public void withdraw(double amount){
		if(amount>0 && amount<=balance){
			balance -= amount;
		}
		else{
			System.out.println("Not Enough Balance");
		}
	}
	
	public void showDetails()
	{
		System.out.println("\n---Account Class---");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Balance: "+balance);	
	}
}