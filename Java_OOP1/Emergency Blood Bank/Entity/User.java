package Entity;

public class User{

    //Member Variable
    private int userId;
    private String name;
    private String contactNumber;
    private String emailAddress;
	public static int userCount=0;

    // Default constructor
    public User(){
        // System.out.println("E-Constructor");
        userCount++;
    }

    // Parameterized constructor
    public User(int userId, String name, String contactNumber, String emailAddress){
        // System.out.println("P-Constructor");
        setUserId(userId);
        setName(name);
        setContactNumber(contactNumber);
        setEmailAddress(emailAddress);
        userCount++;
    }

    // Setter Methods
    public void setUserId(int userId) {
        this.userId=userId;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setContactNumber(String contactNumber) {
        this.contactNumber=contactNumber;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress=emailAddress;
    }

     // Getter Methods
    public int getUserId() {
        return userId;
    }
    public String getName() {
        return name;
    }
    public String getContactNumber() {
        return contactNumber;
    }
    public String getEmailAddress() {
        return emailAddress;
    }

    // Show All Information Method

    public void showAll(){
        System.out.println("=======================");
        System.out.println("User ID: "+userId);
        System.out.println("Name: "+name);
        System.out.println("Contact Number: "+contactNumber);
        if(emailAddress!=null){ // Check if emailAddress has a value
            System.out.println("Email Address: "+emailAddress);
        }
        System.out.println("=======================");
    }

    public String getAllAsString(){
		String s = "";
		s+="=======================\n";
        s+="User ID: " +userId+"\n";
        s+="Name: " + name+"\n";
        s+="Contact Number: " + contactNumber+"\n";
        if(emailAddress!=null){
            s+="Email: " + emailAddress+"\n";
        }
        s+="=======================";
        return s;
	}

}