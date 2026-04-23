package restaurant_menu_order_system;

public enum Size {
	SMALL(1.0),
	MEDIUM(1.5),
	LARGE(2.0);
	
	private double priceRatio; //size of one
	
	Size(double ratio){
		priceRatio = ratio;
	}
	
	public double getPriceRatio() {
		return this.priceRatio;
	}
	
	

}
