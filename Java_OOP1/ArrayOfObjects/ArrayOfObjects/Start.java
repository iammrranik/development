import java.util.Scanner;
public class Start{
	public static void main(String []args){
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		System.out.print("Enter the number of Students: ");
		int size = scNum.nextInt();
		Student students[] = new Student[size];
		
		for(int i=0;i<students.length;i++){
			System.out.println("Enter Details For Student: "+(i+1));
			students[i] = new Student();
			System.out.print("Enter Name: ");
			students[i].setName(scStr.nextLine());
			System.out.print("Enter Id: ");
			students[i].setId(scStr.nextLine());
			System.out.print("Enter Age: ");
			students[i].setAge(scNum.nextInt());
			System.out.print("Enter Cgpa: ");
			students[i].setCgpa(scNum.nextFloat());
		}
		
		for(int i=0;i<students.length;i++){
			students[i].showDetails();
		}
		
		for(int i=0;i<students.length;i++){
			System.out.println(students[i].getCgpa());
		}
		
		
	}
}