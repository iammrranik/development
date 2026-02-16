package Entity;

public class Admin extends User{

    //Member Variable
    private static int adminCount=0;

    // Default constructor
    public Admin(){
        adminCount++;
    }
    

    // Parameterized constructor
    public Admin(int userId, String name, String contactNumber, String emailAddress){
        // System.out.println("E-Constructor");
        super(userId, name, contactNumber, emailAddress);
        adminCount++;
    }

    @Override // Override the showAll method from User class
    public void showAll(){
        super.showAll();
    }

}
