// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class StartStudent {
    public static void main(String[] args){
        Student a=new Student();
        a.setName("Abul");
        a.setId("23-54XXX-3");
        a.setDepartment("CSE");
        a.setCgpa(3.75f);
        a.showInfo();
        Student b=new Student("Babul", "23-54XXX-2", "BBA", 3.8f);
        b.showInfo();
    }
}
