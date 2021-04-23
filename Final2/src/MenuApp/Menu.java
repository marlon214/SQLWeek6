package MenuApp;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private Scanner scanner = new Scanner(System.in);
	private List<String> options = Arrays.asList(
			"Display Appetizer", "Create Appetizers", "Delete Appetizers",
			"Display Entrees", "Create Entrees", "Delete Entrees",
			"Display Desserts", "Create Desserts", "Delete Desserts");
			
	public void start() {
		// TODO Auto-generated method stub
		String select = "";
		do {
			printMenu();
			
			if (select.equals("1")) {
				displayAppetizers();
			}
			else if(select.equals("2")) {
				createAppetizers();
			}
			else if(select.equals("3")) {
				deleteAppetizers();
			}
			else if(select.equals("4")) {
				displayEntrees();
			}
			else if(select.equals("5")) {
				createEntrees();
			}
			else if (select.equals("6")) {
				deleteEntrees();
			}
			else if (select.equals("7")) {
				displayDesserts();
			}
			else if (select.equals("8")) {
				createDesserts();
			}
			else if (select.equals("9")) {
				deleteDesserts();
			}
			
			select = scanner.nextLine();
			
			
		} while (!select.equals("-1"));
		
		
			
		
	}

	private <options> void printMenu() {
		// TODO Auto-generated method stub
		System.out.println("Please Select an Options:");
		for (int i=0;i<options.size(); i++) {
			System.out.println(i+1);
		}
	}

}
