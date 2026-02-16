package Entity;
import java.time.*;

public class Donor extends User{

    //Member Variable
    private String bloodGroup;
    private String rhFactor;
    private LocalDate lastDonationDate; // Using LocalDate from java.time package
    private boolean medicalCertificate;  // Have fitness certificate? true=yes, false=no
    private String areaName;
    private String zipCode;
    public static int donorCount=0;

    // Default constructor
    public Donor(){
        // System.out.println("E-Constructor");
        donorCount++;
    }

    // Parameterized constructor
    public Donor(int userId, String name, String contactNumber, String emailAddress, 
                    String bloodGroup, String rhFactor, LocalDate lastDonationDate, 
                    boolean medicalCertificate, String areaName, String zipCode){
        super(userId, name, contactNumber, emailAddress);
        setBloodGroup(bloodGroup);
        setRhFactor(rhFactor);
        setLastDonationDate(lastDonationDate);
        setMedicalCertificate(medicalCertificate);
        setAreaName(areaName);
        setZipCode(zipCode);
        donorCount++;
    }

    // Setter Methods
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }
    public void setLastDonationDate(LocalDate lastDonationDate) {
        this.lastDonationDate = lastDonationDate;
    }
    public void setMedicalCertificate(boolean medicalCertificate) {
        this.medicalCertificate = medicalCertificate;
    }
    public void setAreaName(String areaName){
        this.areaName = areaName;
    }
    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    // Getter Methods
    public String getBloodGroup(){
        return bloodGroup;
    }
    public String getRhFactor(){
        return rhFactor;
    }
    public LocalDate getLastDonationDate(){
        return lastDonationDate;
    }
    public boolean getMedicalCertificate(){
        return medicalCertificate;
    }
    public String getAreaName(){
        return areaName;
    }
    public String getZipCode(){
        return zipCode;
    }

    /* External  Methods */

    public boolean checkEligibility(LocalDate donationDate) {
        if (lastDonationDate == null || donationDate.minusMonths(3).isAfter(lastDonationDate)) {
            return true; // Can donate if 3 months have passed since last donation
        }else{
            return false;
        }
    }

    @Override // Override the showAll method from User class
    public void showAll(){
        super.showAll();
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Rh Factor: " + rhFactor);
        System.out.println("Last Donation Date: ");
        if(lastDonationDate != null){
            System.out.println(lastDonationDate);
        }else{
            System.out.println("No last donation recorded.");
        }
        System.out.println("Medical Certificate: " + medicalCertificate);
        System.out.println("Area: " + areaName);
        System.out.println("Zip Code: " + zipCode);
    }

}