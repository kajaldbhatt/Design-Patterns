package PizzaStoreFactoryMethod;

public class PizzaTestDrive {
	public static void main(String args[]){
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Joel ordered pizza "+pizza);
		
		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Mark ordered pizza" +pizza);
		
		pizza = nyStore.orderPizza("clam");
		System.out.println("Maria ordered pizza "+pizza);
		
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Maria ordered pizza "+pizza);
		
		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Maria ordered pizza "+pizza);
		
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Maria ordered pizza "+pizza);
		
		pizza = nyStore.orderPizza("veggie");
		System.out.println("Maria ordered pizza "+pizza);
		
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Maria ordered pizza "+pizza);
	}
}
