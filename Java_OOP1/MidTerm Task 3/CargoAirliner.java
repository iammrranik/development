// MD. MINHAJ ROWFUN RABBI ANIK
// 23-54110-3

class CargoAirliner extends AirTransporter{
	private int maxCargoWeight;
	CargoAirliner(){};
	CargoAirliner(String manufacturer, double maxAltitude, double maxSpeed, int maxCargoWeight){
		super(manufacturer, maxAltitude, maxSpeed);
		setmaxCargoWeight(maxCargoWeight);
	}
	public void setmaxCargoWeight(int weight){
		this.maxCargoWeight=weight;
	}
	public int getmaxCargoWeight(){
		return maxCargoWeight;
	}
	public void showDetails(){
		super.showDetails();
		System.out.println("Max Weight Capacity : "+getmaxCargoWeight()+" KG\n");
	}
}