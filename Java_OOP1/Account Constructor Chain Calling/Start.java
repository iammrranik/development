public class Start
{
	public static void main(String args[])
	{
		Account a = new Account();	Account a1 = new Account();
		FixedAccount f1 = new FixedAccount(); FixedAccount f2 = new FixedAccount();

		SavingsAccount savings[] = new SavingsAccount[4];
		 savings[0] = new SavingsAccount(221,"KAMAL",20000,2.7);
		 savings[1] = new SavingsAccount(222,"KAMAL",50000,1.5);
		// savings[2] = new SavingsAccount(223,"KAMAL",22000,3.5);
		 savings[3] = new SavingsAccount(224,"KAMAL",8000,7.5);
		
		for(int i=0;i<4;i++){
			if(savings[i]!=null){
				savings[i].showDetails();
			}
		}
		
		System.out.println(Account.accountCount);
		System.out.println(SavingsAccount.accountCount);
		System.out.println(SavingsAccount.savingsCount);
		System.out.println(FixedAccount.accountCount);
		
		
	/*
		OverDraftAccount oda = new OverDraftAccount(111,"Rahim",20000,2.5,5000);
		oda.showDetails();
		oda.withdraw(20000);
		oda.showDetails();
		oda.withdraw(1000);
		oda.showDetails();
		
		oda.withdraw(3000);
		oda.showDetails();
		
		oda.withdraw(4000);
		oda.showDetails();
		
		oda.deposit(10000);
		oda.showDetails();
	*/
	/*
	
		Account acc = new Account(1111,"RM",500);
		acc.showDetails();
		
		Account acc1 = new Account(2222);
		acc1.showDetails();
		
		Account acc2 = new Account();
		acc2.showDetails();
		
		System.out.println("===========Fixed Account========");
		
		FixedAccount fa = new FixedAccount(3333,"MR",1000,5);
		fa.showInfo();
		
		FixedAccount fa1 = new FixedAccount();
		fa1.showInfo();
	*/
		
	}
}