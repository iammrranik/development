public class Rectangle extends Shape{
	private float y;
	public Rectangle(){
		System.out.println("Empty Rectangle");
	}
	public Rectangle(float x, float y){
		super(x);
		this.y = y;
		System.out.println("Parameterized Rectangle");
	}
	public void setY(float y){ this.y = y;}
	public float getY(){ return this.y;}
	
	public float getArea(){
		return getX()*getY();
	}
	//override
	public void showDetails(){
		System.out.println("Length : "+ getX());
		System.out.println("Width : "+ getY());
		System.out.println("Area : "+ getArea());		
	}

	
}





