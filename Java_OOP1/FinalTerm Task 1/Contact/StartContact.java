// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
import java.util.Scanner;
public class StartContact{
    public static void main(String args[]) {
        Scanner scNum = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        System.out.println("Welcome to Contact Management System");
        ContactList contacts = new ContactList(1000);

        while (true) {
            System.out.println("1. Insert a New Contact");
            System.out.println("2. Show All Contacts");
            System.out.println("3. Show a Contact");
            System.out.println("4. Delete a Contact");
            System.out.println("5. Search a Contact By Name");
            System.out.println("6. Search a Contact By Number");
            System.out.println("7. Update a Contact");
			System.out.println("\t1. Update Name");
            System.out.println("\t2. Update Number");
            System.out.println("\t0. <- Back");
            System.out.println("0. Exit");
            System.out.print("Enter Your Option: ");
            int option = scNum.nextInt();
            if (option == 0) {
                break;
            }

            switch (option) {
                case 1:
					System.out.println("Enter Contact Details");
					System.out.print("Enter Person Name: ");
					String personName = scStr.nextLine();
					System.out.print("Enter Person ID: ");
					String personId = scStr.nextLine();
					System.out.print("Enter Age: ");
					int age = scNum.nextInt();
					System.out.print("Enter Mobile Number: ");
					String mobileNumber = scStr.nextLine();
					System.out.print("Enter Gender (M/F): ");
					char gender = scStr.nextLine().charAt(0);
					
					Contact contact = new Contact(personName, personId, age, mobileNumber, gender);
					contacts.insert(contact);
					System.out.println("Contact inserted successfully.");
					break;

                case 2:
					System.out.println("*** All Available Contact ***");
                    contacts.showAll();
                    break;
                case 3:
					System.out.print("Enter Person Name to search contact: ");
					String Name=scStr.nextLine();
					Contact c=contacts.getByName(Name);
					if (c!=null) {
						System.out.println("Contact found:");
						c.showDetails();
					} else {
						System.out.println("Contact not found.");
					}
                    break;

                case 4:
					System.out.print("Enter Person Name to delete contact: ");
					String name = scStr.nextLine();
					contacts.remove(name);
                    break;

                case 5:
					System.out.print("Enter Person Name to search contact: ");
					String searchName = scStr.nextLine();
					Contact contactByName = contacts.getByName(searchName);
					if(contactByName!=null){
						System.out.println("Contact found:");
						contactByName.showDetails();
					}else{
						System.out.println("Contact not found.");
					}
					break;

                case 6:
					System.out.print("Enter Mobile Number to search contact: ");
					String Number=scStr.nextLine();
					Contact cc=contacts.getByNumber(Number);
					if (cc!=null){
						System.out.println("Contact found:");
						cc.showDetails();
					}else{
						System.out.println("Contact not found.");
					}
                    break;

				case 7:
					System.out.println("Update a Contact:");
					System.out.println("\t1. Update Name");
					System.out.println("\t2. Update Number");
					System.out.println("\t0. <- Back");
					System.out.print("Enter Your Option: ");
					int updateOption = scNum.nextInt();
					scNum.nextLine(); // Consume newline
				
					switch (updateOption) {
						case 1:
							System.out.print("Enter Person Name to update: ");
							String oldName = scStr.nextLine();
							System.out.print("Enter New Name: ");
							String newName = scStr.nextLine();
							contacts.updateName(oldName, newName);
							break;
						case 2:
							System.out.print("Enter Person Name to update number: ");
							String nameToUpdateNumber = scStr.nextLine();
							System.out.print("Enter New Mobile Number: ");
							String newNumber = scStr.nextLine();
							contacts.updateNumber(nameToUpdateNumber, newNumber);
							break;
						case 0:
							break;
						default:
							System.out.println("Invalid option.");
					}
					break;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
