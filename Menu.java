package restaurant_menu_order_system;
import java.util.ArrayList;

public class Menu {
	private ArrayList<Menu_Item> items = new ArrayList<>();

	public Menu() { //by default
		items.add(new Menu_Item("Garlic Bread",3.30,Category.APPETIZER));
		items.add(new Menu_Item("Spaghetti Bolognese",15.89,Category.MAIN_COURSE));
		items.add(new Menu_Item("French Fries",2.56,Category.SIDES));
		items.add(new Menu_Item("Chocolate Cake",23.99,Category.DESSERT));
		items.add(new Menu_Item("Sprite",8.67,Category.DRINK));
		items.add(new Menu_Item("Iced Tea",7.00,Category.DRINK));
		items.add(new Menu_Item("Ketchup",0.00,Category.SAUCES));
		items.add(new Menu_Item("Mac and Cheese", 3.44, Category.SIDES));
		items.add(new Menu_Item("Muna's special sauce",1.99, Category.SAUCES));
		items.add(new Menu_Item("Cheeseburger",10.88,Category.MAIN_COURSE));
		items.add(new Menu_Item("Chicken Sandwich",9.47,Category.MAIN_COURSE));
		items.add(new Menu_Item("Chicken Wings", 6.95, Category.APPETIZER));
		items.add(new Menu_Item("French Toast", 12.34,Category.BREAKFAST));
		items.add(new Menu_Item("Cheese omelette", 8.24, Category.BREAKFAST));
		items.add(new Menu_Item("Spicy Chicken sandwich COMBO", 18.38,Category.COMBO));
		items.add(new Menu_Item("Ice cream", 15.80, Category.DESSERT));
	}
	
	public void addItem(Menu_Item newItem) {
		items.add(newItem);
	}
	
	public void removeItem(Menu_Item item) {
		items.remove(item);
	}
	
	public Menu_Item getItem(String inputItem) {
		inputItem = inputItem.toLowerCase().trim();
		
		for(Menu_Item item: items) {
			if(item.getName().toLowerCase().contains(inputItem)) {
			return item;
			}
		}
		return null;
		
	}
	
	public void displayMenu() {
		System.out.println("\t\t\t\t    MENU");
		int numbering = 1;
		System.out.println("APPETIZER");
		
		for(Menu_Item item: items) {
			if(item.category.name().equals("APPETIZER")) {
				System.out.println(numbering+") "+item+"\n");
				numbering++;
			}		
		}
		
	System.out.println("MAIN COURSE");
		
		for(Menu_Item item: items) {
			if(item.category.name().equals("MAIN_COURSE")) {
				System.out.println(numbering+") "+item+"\n");
				numbering++;
			}
		
		}
		
	System.out.println("DESSERT");
		
		for(Menu_Item item: items) {
			if(item.category.name().equals("DESSERT")) {
				System.out.println(numbering+") "+item+"\n");
				numbering++;
			}
			
		}
		
	System.out.println("DRINKS");
		
		for(Menu_Item item: items) {
			if(item.category.name().equals("DRINK")) {
				System.out.println(numbering+") "+item+"\n");
				numbering++;
			}
		}
		
	System.out.println("BREAKFAST");
		
		for(Menu_Item item: items) {
			if(item.category.name().equals("BREAKFAST")) {
				System.out.println(numbering+") "+item+"\n");
				numbering++;
			}
			
		}
		
	System.out.println("COMBO");
		
		for(Menu_Item item: items) {
			if(item.category.name().equals("COMBO")) {
				System.out.println(numbering+") "+item+"\n");
				numbering++;
			}
			
		}
		
	System.out.println("SIDES");
		
		for(Menu_Item item: items) {
			if(item.category.name().equals("SIDES")) {
				System.out.println(numbering+") "+item+"\n");
				numbering++;
			}
			
		}
		
	System.out.println("SAUCES");
		
		for(Menu_Item item: items) {
			if(item.category.name().equals("SAUCES")) {
				System.out.println(numbering+") "+item+"\n");
				numbering++;
			}
			
		}
	}
}
