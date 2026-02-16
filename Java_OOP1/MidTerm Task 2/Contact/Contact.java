// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class Contact{
	
	// Members
	private String personName;
	private String personId;
	private int age;
	private String mobileNumber;
	private char gender; // M or F
	
	// Constructor
	Contact(){
		System.out.println("E-Constructor");
	}
	Contact(String personName, String personId ,int age ,String mobileNumber,char gender){
		System.out.println("P-Constructor");
		setPersonName(personName);
		setPersonId(personId);
		setAge(age);
		setMobileNumber(mobileNumber);
		setGender(gender);
	}
	
	// Setter Methods
	public void setPersonName(String personName){
		this.personName=personName;
	}
	public void setPersonId(String personId){
		this.personId=personId;
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setMobileNumber(String mobileNumber){
		this.mobileNumber=mobileNumber;
	}
	public void setGender(char gender){
		if(gender=='M' || gender=='F') this.gender=gender; // M=Male, F=Female
		else this.gender='-'; // A=Absent
	}
	
	// Getter Methods
	public void showDetails(){
		System.out.println("Person Name: "+this.personName);
		System.out.println("Person Id: "+this.personId);
		System.out.println("Person Age: "+this.age);
		System.out.println("Mobile Number: "+this.mobileNumber);
		System.out.println("Gender: "+this.gender);
	}
	public void showOperator(){ // show sim (GP, Robi etc)
		char tmp=mobileNumber.charAt(2);
		//System.out.println(tmp);
		System.out.print("Operator: ");
		if(tmp=='3' || tmp=='7'){
			System.out.println("Grameenphone");
		}else if(tmp=='5'){
			System.out.println("Teletalk");
		}else if(tmp=='8'){
			System.out.println("Robi");
		}
		System.out.println("");
	}
	
}
