package PizzaStoreFactoryMethod;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	Veggies veggies[];
	Cheese cheese;
	Pepperoni pepperoni;
	Clams clam;
	
	ArrayList toppings = new ArrayList();
	
	void prepare(){
		System.out.println("Preparing :"+name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		
		for(int i=0; i<toppings.size();i++){
			System.out.println(" "+toppings.get(i));
		}
	}
	
	void bake(){
		
	}
	
	void cut(){
		
	}
	
	void box(){
		
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
}
