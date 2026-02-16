package EntityList;

import Entity.*;

public class DonorList extends List{

    //Member variable
    private Donor donors[];

	//Default Constructor
	public DonorList(){
		// System.out.println("E-Constructor");
		donors = new Donor[100];
	}

    //Paramiterized Constructor
	public DonorList(int size){
		// System.out.println("P-Constructor");
		donors = new Donor[size];
	}

	//Features

	@Override // Override the methods from List class

	//Get Info

	public Donor getByUserId(int userId){
		Donor d = null;
		for(int i=0;i<donors.length;i++){
			if(donors[i] != null){
				if(donors[i].getUserId()==userId ){
					d = donors[i];
					break;
				}
			}
		}
		return d;
	}

	public Donor getByBloodGroup(String bloodGroup){
		Donor d = null;
		for(int i=0;i<donors.length;i++){
			if(donors[i] != null){
				if(donors[i].getBloodGroup().equals(bloodGroup) ){
					d = donors[i];
					break;
				}
			}
		}
		return d;
	}

	public Donor getByRhFactor(String rhFactor){
		Donor d = null;
		for(int i=0;i<donors.length;i++){
			if(donors[i] != null){
			    if(donors[i].getRhFactor().equals(rhFactor) ){
				    d = donors[i];
					break;
				}
			}
		}
		return d;
	}

	public Donor getByMedicalCertificate(boolean medicalCertificate){
		Donor d = null;
		for(int i=0;i<donors.length;i++){
		    if(donors[i] != null){
				if(donors[i].getMedicalCertificate()==medicalCertificate){
					d = donors[i];
					break;
				}
			}
		}
		return d;
	}

	public Donor getByAreaName(String areaName){
		Donor d = null;
		for(int i=0;i<donors.length;i++){
        	if(donors[i] != null){
				if(donors[i].getAreaName().equals(areaName) ){
					d = donors[i];
				    break;
				}
			}
		}
		return d;
	}

	public Donor getByZipCode(String zipCode){
		Donor d = null;
		for(int i=0;i<donors.length;i++){
        	if(donors[i] != null){
				if(donors[i].getZipCode().equals(zipCode) ){
					d = donors[i];
				    break;
				}
			}
		}
		return d;
	}

	// Add Donor

	public void add(Donor d){
		boolean flag = false;
		for(int i=0;i<donors.length;i++){
			if(donors[i] == null){
				donors[i] = d;
				flag = true;
				break;
			}
		}
		if(flag){
			System.out.println("Donor Saved Successfully ");
		}else{
			System.out.println("Donor is Not Saved !!!");
		}
	}

	// Remove Donor

	public void removeByBloodGroup(String bloodGroup){
		boolean flag = false;
		for(int i=0;i<donors.length;i++){
			if(donors[i] != null){
				if(donors[i].getBloodGroup().equals(bloodGroup) ){
					donors[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Donor Deleted Successfully ");
		}else{
			System.out.println("No Donor with this Blood Group !!!");
		}
	}

	public void removeByRhFactor(String rhFactor){
		boolean flag = false;
		for(int i=0;i<donors.length;i++){
			if(donors[i] != null){
				if(donors[i].getRhFactor().equals(rhFactor) ){
					donors[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Donor Deleted Successfully ");
		}else{
			System.out.println("No Donor with this Rh Factor !!!");
		}
	}

	public void removeByMedicalCertificate(boolean medicalCertificate){
		boolean flag = false;
		for(int i=0;i<donors.length;i++){
			if(donors[i] != null){
				if(donors[i].getMedicalCertificate()==medicalCertificate){
					donors[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Donor Deleted Successfully ");
		}else{
			System.out.println("No Donor with this Medical Certificate !!!");
		}
	}

	public void removeByAreaName(String areaName){
		boolean flag = false;
		for(int i=0;i<donors.length;i++){
			if(donors[i] != null){
				if(donors[i].getAreaName().equals(areaName) ){
					donors[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Donor Deleted Successfully ");
		}else{
			System.out.println("No Donor with this Area Name !!!");
		}
	}

	public void removeByZipCode(String zipCode){
		boolean flag = false;
		for(int i=0;i<donors.length;i++){
			if(donors[i] != null){
				if(donors[i].getZipCode().equals(zipCode) ){
					donors[i] = null;
					flag = true;
					break;
				}
			}
		}
		if(flag){
			System.out.println("Donor Deleted Successfully ");
		}else{
			System.out.println("No Donor with this Zip Code !!!");
		}
	}

	// Update Donor Info

	public void updateByBloodGroup(int userId, String newbloodGroup) {
		Donor donors = getByUserId(userId);
        if (donors != null) {
			donors.setBloodGroup(newbloodGroup);
            System.out.println("Blood Group updated successfully.");
		}else{
			System.out.println("Blood Group not found.");
		}
	}

	public void updateByRhFactor(int userId, String newrhFactor) {
		Donor donors = getByUserId(userId);
        if (donors != null) {
			donors.setRhFactor(newrhFactor);
            System.out.println("Rh Factor updated successfully.");
		}else{
			System.out.println("Rh Factor not found.");
		}
	}

	public void updateByMedicalCertificate(int userId, boolean newmedicalCertificate) {
		Donor donors = getByUserId(userId);
        if (donors != null) {
			donors.setMedicalCertificate(newmedicalCertificate);
            System.out.println("Medical Certificate updated successfully.");
		}else{
			System.out.println("Medical Certificate not found.");
		}
	}

	public void updateByAreaName(int userId, String newareaName) {
		Donor donors = getByUserId(userId);
        if (donors != null) {
			donors.setAreaName(newareaName);
            System.out.println("Area Name updated successfully.");
		}else{
			System.out.println("Area Name not found.");
		}
	}

	public void updateByZipCode(int userId, String newzipCode) {
		Donor donors = getByUserId(userId);
        if (donors != null) {
			donors.setZipCode(newzipCode);
            System.out.println("Zip Code updated successfully.");
		}else{
			System.out.println("Zip Code not found.");
		}
	}

	// Show All
	
	public void showAllDonors(){
		for(int i=0;i<donors.length;i++){
			if(donors[i] != null){
				donors[i].showAll();
			}
		}
	}

	// Show all as string



}