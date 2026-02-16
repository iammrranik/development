import java.util.Scanner;
public class Start{
	public static void main(String []args){
		Scanner scNum = new Scanner(System.in);
		Scanner scStr = new Scanner(System.in);
		
		
		String name = scStr.nextLine();
		String id = scStr.nextLine();
		int age = scNum.nextInt();
		
		Student s1 = new Student(name,id,age,scNum.nextFloat());
		
		s1.showDetails();
		
		
		Student s2 = new Student();
		s2.setAge(scNum.nextInt());
		s2.setName(scStr.nextLine());
		s2.setId(scStr.nextLine());
		s2.setCgpa(scNum.nextFloat());
		
		s2.showDetails();
		
		Student s3 = new Student(scStr.nextLine(),
								scStr.nextLine(),
								scNum.nextInt(),
								scNum.nextFloat());
		
	}
}