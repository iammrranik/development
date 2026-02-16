public class Shape{
	private float x;
	
	public Shape(){System.out.println("Empty Shape");}
	public Shape(float x){
		System.out.println("Parameterized Shape");
		this.x = x;
	}
	public void setX(float x){ this.x = x;}
	public float getX(){ return this.x;}
	public void showDetails(){
		System.out.println("Line : "+x);
	}
}