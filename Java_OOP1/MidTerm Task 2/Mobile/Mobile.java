// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class Mobile{
	
	//Members
	private String mobileOwnerName;
	private String mobileNumber; // SIM number 
	private double mobileBalance;
	private String mobileOSName;
	private boolean lock; // true means phone is lock, false means unlock
	
	//Constructor
	Mobile(){
		System.out.println("E-Constructor");
	}
	Mobile(String mobileOwnerName, String mobileNumber ,double mobileBalance, String mobileOSName, boolean lock){
		System.out.println("P-Constructor");
		setMobileOwnerName(mobileOwnerName);
		setMobileNumber(mobileNumber);
		setMobileBalance(mobileBalance);
		setMobileOSName(mobileOSName);
		setLock(lock);
	}
	
	// Setter Methods
	public void setMobileOwnerName(String mobileOwnerName){
		this.mobileOwnerName=mobileOwnerName;
	}
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	public void setMobileBalance(double mobileBalance){
		this.mobileBalance=mobileBalance;
	}
	public void setMobileOSName(String mobileOSName){
		this.mobileOSName=mobileOSName;
	}
	public void setLock(boolean lock){
		this.lock=lock;
	}
	public void recharge(int amount){
		if(this.lock==false) this.mobileBalance+=amount;
	}
	
	//Getter Methods
	public void showDetails(){
		if(this.lock==false){
			System.out.println("Mobile Owner Name: "+mobileOwnerName);
			System.out.println("Mobile Number: "+mobileNumber);
			System.out.println("Mobile Balance: "+mobileBalance);
			System.out.println("Mobile OS Name: "+mobileOSName);
			System.out.println("Mobile Lock: "+lock+"\n");
		}
	}
	public float adjustAfterCall (float timeDuration, float costPerMinute){
		if(this.lock==false){
			float cost=timeDuration*costPerMinute;
			float adjustedBalance=(float)(mobileBalance)-cost;
			this.mobileBalance=adjustedBalance;
			System.out.println("Current Balance: "+mobileBalance+" Cost: "+cost);
			return cost;
		}
		return 0;
	}
	
}
