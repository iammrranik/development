// ID: 23-54110-3
// MD. MINHAJ ROWFUN RABBI ANIK
public class Triangle {
    private int x, y, z;

    // Constructor
    Triangle(){
        System.out.println("E-Constructor");
    }
    Triangle(int x, int y, int z){
        System.out.println("P-Constructor");
        setX(x);
        setY(y);
        setZ(z);
    }

    // Setter Methods
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setZ(int z){
        this.z=z;
    }

    //Getter Methods
    public void showInfo(){
        System.out.println("X= "+x+",Y= "+y+",Z= "+z);
        testTriangle();
    }
    public void testTriangle(){
        System.out.print("Triangle Type: ");
        if(x==y && y==z){
            System.out.println("Equilateral");
        }else if(x==y || y==z || z==x){
            System.out.println("Isosceles");
        }else{
            System.out.println("Scalene");
        }
        System.out.println("");
    }
}
