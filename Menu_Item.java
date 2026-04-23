package restaurant_menu_order_system;

public class Menu_Item { //holds the blueprint of a specific menu item
	String name;
	double price; //the base price until the size is taking into consideration
	Category category;  
	Size size;
	
	public Menu_Item(String name, double price, Category category, Size size) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.size = size;
	}
	
	public Menu_Item(String name, double price, Category category) {
		this.name = name;
		this.price = price;
		this.category = category;
		this.size = null;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public Category getCategory() {
		return this.category;
	}

	public Size getSize() {
		return this.size;
	}
	
	public String toString() {
		if(size !=null) {
			return this.name+" ("+this.size+")"+" - $"+ this.price;
		}else {
			return this.name+" - $"+ this.price;
		}
	}

}
