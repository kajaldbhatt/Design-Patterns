package MenuItemIteratorPattern;

import java.util.ArrayList;

public class MenuTestDrive {
	public static void main(String args[]) {
		PanCakeHouseMenu pancakeHouseMenu = new PanCakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		ArrayList<Menu> menus = new ArrayList<Menu>();
		menus.add(pancakeHouseMenu);
		menus.add(dinerMenu);
		Waitress waitress = new Waitress(menus);
		waitress.printMenu();

	}
}
