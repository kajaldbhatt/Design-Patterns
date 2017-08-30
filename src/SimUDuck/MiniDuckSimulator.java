package SimUDuck;

/**
 * 
 * @author Kajal Mandalia
 * 
 * The drawback of this design pattern is that we cant change duck's behavior
 * at runtime.
 *
 */
public class MiniDuckSimulator {
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
	}
}
