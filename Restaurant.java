package restaurant_menu_order_system;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Formatter;

public class Restaurant {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t\t\tWELCOME TO MUNA'S RESTAURANT");
		Menu menu1 = new Menu();
		menu1.displayMenu();
		
		
		String answer = "";
		do {
		System.out.println("\t\t\t\tORDER\n\t\t\t(please type done to end)");
		Order newOrder = new Order();
		do {
			System.out.print("\nEnter item name: ");
			answer = input.nextLine();
			
			Menu_Item selected = menu1.getItem(answer);
			
			if(selected !=null) {
				newOrder.addItem(selected);
				System.out.println(selected.getName()+" added to your cart");	
			}else if( !answer.equalsIgnoreCase("done")) {
					System.out.println("Item not found. Try again...");
			}
	
		}while(!(answer.equalsIgnoreCase("done")));
		
		System.out.println("\n\t\t\tRECEIPT");
		newOrder.displayOrder();
		System.out.println("\nThank you for shopping!");
		
		System.out.print("\nAre you still there?...");
		answer = input.nextLine();
		
		if(!answer.equalsIgnoreCase("yes")){
			System.out.println("System inactive...");
		}
		}
		while(answer.equalsIgnoreCase("yes"));
	}

}
