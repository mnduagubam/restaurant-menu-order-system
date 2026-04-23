package restaurant_menu_order_system;
import java.util.ArrayList;
import java.util.Formatter;

public class Order {//shopping cart of each customer
	ArrayList<Menu_Item> cartItems;
	
	public Order() {
		cartItems = new ArrayList<>();
	}
	
	public void addItem(Menu_Item item) {
		cartItems.add(item);
	}
	
	public void removeItem(Menu_Item item) {
		cartItems.remove(item);
	}
	
	public double getTotal() {
	double total = 0;
	  for(Menu_Item cartItem: cartItems) {
		  if(cartItem.getSize() != null) {
			 total+=  cartItem.getPrice()*cartItem.getSize().getPriceRatio();
		  }else {
	           total +=cartItem.getPrice();
		  }
	  }
	  return total;
	}	
	
	  public void displayOrder() {
		  Formatter f = new Formatter();
		  
		  for(Menu_Item cartItem: cartItems) {
			  System.out.println(cartItem+"\n");
		  }
		  System.out.printf("\nTotal amount: $%.2f",getTotal());
		 
	}

}
