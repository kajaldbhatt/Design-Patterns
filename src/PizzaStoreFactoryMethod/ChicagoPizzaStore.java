package PizzaStoreFactoryMethod;

public class ChicagoPizzaStore extends PizzaStore{
	protected Pizza createPizza(String item){
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
		
		if(item.equals("cheese")){
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago style cheese pizza");
		}else if(item.equals("veggie")){
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago style veggie pizza");
		}else if(item.equals("clam")){
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago style clam pizza");
		}else if(item.equals("pepperoni")){
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago style pepperoni pizza");
		}
		
		return pizza;
	}
}
