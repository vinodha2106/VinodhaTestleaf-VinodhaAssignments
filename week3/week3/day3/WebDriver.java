package week3.day3;

public interface WebDriver {

	//unimplemented methods
	//default modifier for the method is as below
	void findElement();
	
	//we need to make it public method
	//its a abstract method
	public void findElements();

	//till 1. java->it was 100% abstract method->unimplemented method
	
	static void click() {
		System.out.println("click");
	}

	//interface allows unimplemented abstract class without method body
	//default/static access modifier is must for implementing a method body
	
	//impleted default method
	default void submit() {
		
	}
	
	
	
}

