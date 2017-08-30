package SingletonPattern;

public class SingletonEagerInstance {
	private static SingletonEagerInstance uniqueInstance = new SingletonEagerInstance();
	private SingletonEagerInstance(){}
	public static SingletonEagerInstance getInstance(){
		return uniqueInstance;
	}
}
