package SingletonPattern;

public class SingletonSynchronizeBlock {
	private volatile static SingletonSynchronizeBlock uniqueInstance;
	private SingletonSynchronizeBlock(){}
	public static SingletonSynchronizeBlock getInstance(){
		if(uniqueInstance == null){
			synchronized (SingletonSynchronizeBlock.class){
				if(uniqueInstance == null){
					uniqueInstance = new SingletonSynchronizeBlock();
				}
			}
		}
		return uniqueInstance;
	}
}	
