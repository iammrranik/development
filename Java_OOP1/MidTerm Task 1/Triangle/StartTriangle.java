// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class StartTriangle{
    public static void main(String[] args){
        Triangle a=new Triangle();
        a.setX(3);
        a.setY(3);
        a.setZ(3);
        a.showInfo();
        Triangle b=new Triangle(3, 2, 3);
        b.showInfo();
        Triangle c=new Triangle(3, 2, 1);
        c.showInfo();
    }
}
