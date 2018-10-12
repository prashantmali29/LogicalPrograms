
public class SingletonDemo {

	//Create private static variable to hold instance 
	private static final SingletonDemo instance = new SingletonDemo();
	
	 //private constructor to avoid client applications to use constructor
	private SingletonDemo(){
		
	}
	
	//Create public static method to return instance
	public static SingletonDemo getInstance(){
		return instance;
	} 
	
}
