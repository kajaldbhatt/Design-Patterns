package PizzaStoreFactoryMethod;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

	public Dough createDough(){
		return new ThickCrustDough();
	}
	
	public Sauce createSauce(){
		return new PlumTomatoSauce();
	}
	
	public Cheese createCheese(){
		return new MozzarellaCheese();
	}
	
	public Veggies[] createVeggies(){
		Veggies Veggies[] = { new BlackOlives(), new Spinach(), new Eggplant() };
		return Veggies;
	}
	
	public Pepperoni createPepperoni(){
		return new SlicedPepperoni();
	}
	
	public Clams createClams(){
		return new FreshClams();
	}
}
