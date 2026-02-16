
import java.lang.*;

public class SavingsAccount extends Account
{
	private double interestRate;
	public static int savingsCount=0;
	public SavingsAccount(){
		//super();
		savingsCount++;
	}
	public SavingsAccount(int accountNumber, String accountHolderName, 
							double balance,double interestRate){
		super(accountNumber,accountHolderName,balance);
		this.interestRate = interestRate;
				System.out.println("Parameterized Account-SA");
		savingsCount++;
	}
	
	public void setInterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	public double getInterestRate()
	{
		return interestRate;
	}
	public void showDetails()
	{	System.out.println("----------------------------------");
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account HolderName: "+accountHolderName);
		System.out.println("Balance: "+balance);
		System.out.println("Interest Rate: "+interestRate);
	}
}