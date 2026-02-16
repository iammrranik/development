public class Box extends Rectangle{
	private float z;
	
	public Box(){}
	public Box(float x,float y,float z){
		super(x,y);
		this.z = z;
	}
	public void setZ(float z){ this.z = z;}
	public float getZ(){ return this.z;}
	public float getVolume(){
		return getX()*getY()*getZ();
	}
	//overriding
	public void showDetails(){
		System.out.println("Length:"+getX());
		System.out.println("Width:"+getY());
		System.out.println("height:"+getZ());
		System.out.println("Volume:"+getVolume());
	}
}