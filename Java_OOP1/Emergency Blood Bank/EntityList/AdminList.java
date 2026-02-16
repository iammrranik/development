package EntityList;

import Entity.*;

public class AdminList extends List{

    //Member variable
	private Admin admins[];

    //Default Constructor
	public AdminList(){
		// System.out.println("E-Constructor");
		admins=new Admin[100];
	}

    //Paramiterized Constructor
	public AdminList(int size){
		// System.out.println("P-Constructor");
        admins=new Admin[size];
    }

	//Features

	@Override // Override the methods from List class

	// Get Info

	public Admin getByUserId(int userId){
		Admin a=null;
		for(int i=0;i<admins.length;i++){
			if(admins[i] != null){
				if(admins[i].getUserId()==(userId)){
					a = admins[i];
					break;
				}
			}
		}
		return a;
	}

    public Admin getByName(String name){
		Admin a=null;
		for(int i=0;i<admins.length;i++){
			if(admins[i] != null){
				if(admins[i].getName().equals(name) ){
					a = admins[i];
					break;
				}
			}
		}
		return a;
	}

	public Admin getByContactNumber(String contactNumber){
		Admin a=null;
		for(int i=0;i<admins.length;i++){
			if(admins[i] != null){
				if(admins[i].getContactNumber().equals(contactNumber) ){
					a = admins[i];
					break;
				}
			}
		}
		return a;
	}

	public Admin getByEmailAddress(String emailAddress){
		Admin a=null;
		for(int i=0;i<admins.length;i++){
			if(admins[i] != null){
				if(admins[i].getEmailAddress().equals(emailAddress) ){
					a = admins[i];
					break;
				}
			}
		}
		return a;
	}

	// Add Admin

	public void add(Admin a){
        boolean flag=false;
        for(int i=0; i<admins.length; i++){
            if(admins[i]==null){
                admins[i]=a;
                flag=true;
                break;
            }
        }
        if(flag){System.out.println("Admin Added Successfully ");}
		else{System.out.println("Admin is not Added !!");}
    }

	// Remove Admin

	public void removeByUserId(int userId){
		boolean flag = false;
		for(int i=0;i<admins.length;i++){
			if(admins[i] != null){
				if(admins[i].getUserId()==userId){
					admins[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){System.out.println("Admin Deleted Successfully ");}
		else{System.out.println("No Admin with this Id!");}
	}

	public void removeByName(String name){
		boolean flag = false;
		for(int i=0;i<admins.length;i++){
			if(admins[i] != null){
				if(admins[i].getName().equals(name) ){
					admins[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){System.out.println("Admin Deleted Successfully ");}
		else{System.out.println("No Admin with this Name!");}
	}

	public void removeByContactNumber(String contactNumber){
		boolean flag = false;
		for(int i=0;i<admins.length;i++){
			if(admins[i] != null){
				if(admins[i].getContactNumber().equals(contactNumber) ){
					admins[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){System.out.println("Admin Deleted Successfully ");}
		else{System.out.println("No Admin with this ContactNumber!");}
	}

	public void removeByEmailAddress(String emailAddress){
		boolean flag = false;
		for(int i=0;i<admins.length;i++){
			if(admins[i] != null){
				if(admins[i].getEmailAddress().equals(emailAddress) ){
					admins[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){System.out.println("Admin Deleted Successfully ");}
		else{System.out.println("No Admin with this EmailAddress!");}
	}

	// Update Admin Info

    public void updateByUserId(int userId , int newId) {
        Admin admin = getByUserId(userId);
        if (admin != null) {
            admin.setUserId(newId);
            System.out.println("Admin id updated successfully.");
        } else {
            System.out.println("Admin not found.");
        }
    }

	public void updateByName(String name , String newName) {
        Admin admin = getByName(name);
        if (admin != null) {
            admin.setName(newName);
            System.out.println("Admin name updated successfully.");
        } else {
            System.out.println("Admin not found.");
        }
    }

	public void updateByContactNumber(String contactNumber , String newContactNumber) {
        Admin admin = getByContactNumber(contactNumber);
        if (admin != null) {
            admin.setContactNumber(newContactNumber);
            System.out.println("Admin contactNumber updated successfully.");
        } else {
            System.out.println("Admin not found.");
        }
    }

	public void updateByEmailAddress(String emailAddress , String newEmailAddress) {
        Admin admin = getByEmailAddress(emailAddress);
        if (admin != null) {
            admin.setEmailAddress(newEmailAddress);
            System.out.println("Admin emailAddress updated successfully.");
        } else {
            System.out.println("Admin not found.");
        }
    }

	// Show All

	public void showAllAdmins(){
		for(int i=0;i<admins.length;i++){
			if(admins[i] != null){
				admins[i].showAll();
			}
		}
	}

	// Show all as string



}