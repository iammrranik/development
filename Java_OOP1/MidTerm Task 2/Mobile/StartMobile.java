// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class StartMobile {
    public static void main(String[] args){
		Mobile a=new Mobile();
		a.setMobileOwnerName("Abul");
		a.setMobileNumber("01811111111");
		a.setMobileBalance(11.11);
		a.setMobileOSName("Dragon");
		a.setLock(false);
		a.showDetails();
		Mobile b=new Mobile("Babul", "01322222222", 22.22, "Linux", false);
		b.adjustAfterCall(5,0.60f);
		b.showDetails();
		Mobile c=new Mobile("Cabul", "01533333333", 33, "OneOS", false);
		c.recharge(1);
		c.showDetails();
		Mobile d=new Mobile("Dabul", "01744444444", 44, "LightOS", true);
		d.showDetails();
	}
}
