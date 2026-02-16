
import java.lang.*;

public class FixedAccount extends Account
{
	private int tenureYear;
	
	public FixedAccount(){
		super();
	}
	
	public FixedAccount(int accountNumber, String accountHolderName, double balance, int tenureYear){
		super(accountNumber,accountHolderName,balance);
		this.tenureYear = tenureYear;
		System.out.println("Parameterized FixedAccount - FA");
	}
	
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear = tenureYear;
	}
	public int getTenureYear()
	{
		return tenureYear;
	}
	
		
	//override
	public void showDetails(){
		System.out.println("\n---FixedAccount Class---");
		super.showDetails();
		System.out.println("Tenure Year: "+ tenureYear);
		System.out.println();
	}
}