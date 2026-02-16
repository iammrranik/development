package EntityList;
import Entity.Student;
import Entity.StudentIdCard;

public class StudentList{
	private Student students[];
	public StudentList(){
		students = new Student[5];
	}
	public StudentList(int size){
		students = new Student[size];
	}
	
	public void insert(Student s){
		boolean flag = false;
		for(int i=0;i<students.length;i++){
			if(students[i] == null){
				students[i] = s;
				flag = true;
				break;
			}
		}
		
		if(flag){System.out.println("Student Saved Successfully ");}
		else{System.out.println("Student is Not Saved !!");}	
	}
	public Student getById(String id){
		Student s = null;
		for(int i=0;i<students.length;i++){
			if(students[i] != null){
				if(students[i].getId().equals(id) ){
					s = students[i];
					break;
				}
			}
		}
		return s;
	}
	
	public void remove(String id){
		boolean flag = false;
		for(int i=0;i<students.length;i++){
			if(students[i] != null){
				if(students[i].getId().equals(id) ){
					students[i] = null;
					flag = true;
					break;
				}
			}
		}
		
		if(flag){System.out.println("Student Deleted Successfully ");}
		else{System.out.println("No Student with this Id !!");}
	}
	
	public void showAll(){
		for(int i=0;i<students.length;i++){
			if(students[i] != null){
				students[i].showDetails();
			}
		}
	}
	
	public String getAllStudentAsString(){
		String s="";
		for(int i=0;i<students.length;i++){
			if(students[i] != null){
				s+=students[i].getStudentAsString()+"\n";
			}
		}
		return s;
	}
	
}