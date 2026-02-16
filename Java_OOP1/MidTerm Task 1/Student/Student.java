// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class Student {
    private String name;
    private String id;
    private String department;
    private float cgpa;
    
    // Constructor
    Student(){
        System.out.println("E-Constructor");
    }
    Student(String name, String id, String department, float cga){
        System.out.println("P-Constructor");
        setName(name);
        setId(id);
        setDepartment(department);
        setCgpa(cga);
    }

    // Setter Methods
    public void setName(String name){
        this.name=name;
    }
    public void setId(String id){
        this.id=id;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public void setCgpa(float cgpa){
        this.cgpa=cgpa;
    }

    // Getter Methods
    public void showInfo(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Department: "+department);
        System.out.println("CGPA: "+cgpa+"\n");
    }
}
