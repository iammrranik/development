public class StudentIdCard{
	private int idNo;
	private String validity;
	private double printCardBalance;
	
	public StudentIdCard(){}
	public StudentIdCard(int idNo,String validity,double printCardBalance){
		this.idNo = idNo;
		this.validity = validity;
		this.printCardBalance = printCardBalance;
	}
	
	public void setValidity(String validity){
		this.validity = validity;
	}
	public String getValidity(){return validity;}
	
	public void showDetails(){
		System.out.println("Id No: "+idNo);
		System.out.println("Validity: "+validity);
		System.out.println("Print Card Balance: "+printCardBalance);
	}
}