package creational.singleton;

public class SingletonPattern {

	private static SingletonPattern singletonInstance;

	private SingletonPattern(){}

	public synchronized static SingletonPattern getInstance(){
		if( singletonInstance == null ){
			singletonInstance = new SingletonPattern();
		}

		return singletonInstance;
	}

}
