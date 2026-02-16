// MD. MINHAJ ROWFUN RABBI ANIK
// 23-54110-3

class AirTransporter{
	private String manufacturer;
	private double maxAltitude;
	private double maxSpeed;
	AirTransporter(){}
	AirTransporter(String manufacturer, double maxAltitude, double maxSpeed){
		setManufacturer(manufacturer);
		setMaxAltitude(maxAltitude);
		setMaxSpeed(maxSpeed);
	}
	public void setManufacturer(String manufacturer){
		this.manufacturer=manufacturer;
	}
	public void setMaxAltitude(double maxAltitude){
		this.maxAltitude=maxAltitude;
	}
	public void setMaxSpeed(double maxSpeed){
		this.maxSpeed=maxSpeed;
	}
	public String getManufacturer(){
		return manufacturer;
	}
	public double getMaxAltitude(){
		return maxAltitude;
	}
	public double getMaxSpeed(){
		return maxSpeed;
	}
	public void showDetails(){
		System.out.println("Air Transporter Details");
		System.out.println("Manufacturer : "+getManufacturer());
		System.out.println("Maximum Altitude : "+getMaxAltitude()+" ft");
		System.out.println("Maximum Speed : "+getMaxSpeed()+" KM/Hr");
	}
}