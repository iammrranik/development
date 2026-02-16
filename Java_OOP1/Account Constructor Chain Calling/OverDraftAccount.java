public class OverDraftAccount extends SavingsAccount{
	private double limit;
	public OverDraftAccount(int accountNumber, 
							  String accountHolderName, 
							  double balance, 
							  double interestRate,
							  double limit){
			super(accountNumber,accountHolderName,balance,interestRate);
			this.limit = limit;  
	}
	//overriding parent class method
	public void withdraw(double amount){
		if(amount>0 && amount<= balance+limit){
			balance -= amount;
		}
		else{
			System.out.println("Not Enough Balance");
		}
	}
	
	
	public void showDetails(){
		super.showDetails();
		if(balance<0){System.out.println("Over Draft Limit: "+ (balance+ this.limit) );}
		else{System.out.println("Over Draft Limit: "+this.limit);}
		
		System.out.println("----------------------------------");
	}
}