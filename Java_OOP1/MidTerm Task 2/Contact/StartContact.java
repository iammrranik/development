// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class StartContact{
    public static void main(String[] args){
		Contact a=new Contact();
		a.setPersonName("Abul");
		a.setPersonId("1");
		a.setAge(11);
		a.setMobileNumber("01811111111");
		a.setGender('M');
		a.showDetails();
		a.showOperator();
		Contact b=new Contact("Babul", "2", 22, "01322222222", 'M');
		b.showDetails();
		b.showOperator();
		Contact c=new Contact("Cabul", "3", 33, "01533333333", 'C'); // will show NULL cause no M/F
		c.showDetails();
		c.showOperator();
		Contact d=new Contact("Dabul", "4", 44, "01744444444", 'F');
		d.showDetails();
		d.showOperator();
	}
}
