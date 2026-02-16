// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class ContactList{
    private Contact contacts[];
    
    //Constructor
    public ContactList(){
        // System.out.println("E-Constructor");
        contacts=new Contact[100];
    }
    public ContactList(int size){
		// System.out.println("P-Constructor");
        contacts=new Contact[size];
    }

    //Features
    public void insert(Contact c){
        boolean flag=false;
        for(int i=0; i<contacts.length; i++){
            if(contacts[i]==null){
                contacts[i]=c;
                flag=true;
                break;
            }
        }
        if(flag){System.out.println("Contact Saved Successfully ");}
		else{System.out.println("Contact is Not Saved !!");}
    }
    public Contact getByName(String personName){
		Contact c=null;
		for(int i=0;i<contacts.length;i++){
			if(contacts[i] != null){
				if(contacts[i].getPersonName().equals(personName) ){
					c = contacts[i];
					break;
				}
			}
		}
		return c;
	}
    public Contact getByNumber(String mobileNumber){
		Contact c=null;
		for(int i=0;i<contacts.length;i++){
			if(contacts[i] != null){
				if(contacts[i].getMobileNumber().equals(mobileNumber) ){
					c = contacts[i];
					break;
				}
			}
		}
		return c;
	}
    public void remove(String personName){
		boolean flag = false;
		for(int i=0;i<contacts.length;i++){
			if(contacts[i] != null){
				if(contacts[i].getPersonName().equals(personName) ){
					contacts[i] = null;
					flag = true;
					break;
				}
			}
		}
		
		if(flag){System.out.println("Contact Deleted Successfully ");}
		else{System.out.println("No Contact with this Name!");}
	}
    public void showAll(){
		for(int i=0;i<contacts.length;i++){
			if(contacts[i] != null){
				contacts[i].showDetails();
			}
		}
	}
    public void updateName(String personName, String newName) {
        Contact contact = getByName(personName);
        if (contact != null) {
            contact.setPersonName(newName);
            System.out.println("Contact name updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    public void updateNumber(String personName, String newNumber) {
        Contact contact = getByName(personName);
        if (contact != null) {
            contact.setMobileNumber(newNumber);
            System.out.println("Contact number updated successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }
}
