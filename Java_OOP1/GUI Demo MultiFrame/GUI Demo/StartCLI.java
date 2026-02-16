import java.util.Scanner;
import Entity.*;
import EntityList.*;

public class StartCLI{
	public static void main(String args[]){
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		
		System.out.println("Welcome to Student Management System");
		StudentList students = new StudentList(100);
		
		while(true){
			System.out.println("1. Insert a Student");
			System.out.println("2. Issue an Id");
			System.out.println("3. Remove a Student");
			System.out.println("4. Show All Student");
			System.out.println("0. Exit");
			System.out.print("Enter Your Option: ");
			int option = scNum.nextInt();
			if(option == 0){break;}
			
			switch(option){
				case 1:
					System.out.println("Enter Student Details");
					System.out.print("Enter Name: ");
					String name = scStr.nextLine();
					System.out.print("Enter Student Id: ");
					String id = scStr.nextLine();
					System.out.print("Enter Age: ");
					int age = scNum.nextInt();
					System.out.print("Enter Cgpa: ");
					float cgpa = scNum.nextFloat();
					System.out.print("Enter Blood Group: ");
					String bloodGroup = scStr.nextLine();
					Student s = new Student(name,id,age,cgpa);
					s.setBloodGroup(bloodGroup);
					students.insert(s);
					break;	
					
				case 2:
					System.out.print("Enter Student Id to Issue Id Card: ");
					id = scStr.nextLine();
					Student tempS = students.getById(id);
					if(tempS!=null){
						System.out.print("Enter Id Card No: ");
						int idNo = scNum.nextInt();
						System.out.print("Enter Id Card Validity: ");
						String validity = scStr.nextLine();
						System.out.print("Enter Print Balance: ");
						double balance = scNum.nextDouble();
						
						StudentIdCard idCard = new StudentIdCard(idNo,validity,balance);
						tempS.setIdCard(idCard);
					}
					else{
						System.out.println("No Student found with this Id");
					}
					break;	
				case 3:
					System.out.print("Enter Student Id to Remove: ");
					id = scStr.nextLine();
					students.remove(id);
					break;
					
				case 4:
					System.out.println("****All Available Students****");
					students.showAll();
					break;	
				default:
				
			}
			
		}
		
	}
}