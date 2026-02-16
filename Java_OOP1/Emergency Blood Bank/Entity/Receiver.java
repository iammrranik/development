package Entity;

public class Receiver extends User{
    
    //Member Variable
    private String bloodType;
    public static int receiverCount=0;

    // Default constructor
    public Receiver(){
        // System.out.println("E-Constructor");
        receiverCount++;
    }

    // Parameterized constructor
    public Receiver(int userId, String name, String contactNumber, String emailAddress, String bloodType) {
        super(userId, name, contactNumber, emailAddress);
        setBloodType(bloodType);
        receiverCount++;
    }

    // Setter Methods
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    // Getter Methods
    public String getBloodType() {
        return bloodType;
    }

}
