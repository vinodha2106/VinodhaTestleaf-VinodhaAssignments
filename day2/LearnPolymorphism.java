package week3.day2;

public class LearnPolymorphism {

	public void returnStep(String message, String Status) {
		System.out.println("Result with 2 arg");
		System.out.println("The Message is: " + message + " ,The Status of message: " + Status);
	}

	public void returnStep(String message, String Status, boolean p) {
		System.out.println("Result wit 3 arg");
		System.out.println("The Message is: " + message + " ,The Status of message: " + Status + " ,Parameter is :" + p);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnPolymorphism lP = new LearnPolymorphism();
		lP.returnStep("Hi", "Received ");
		lP.returnStep("Hello", "Failed ", false);
	}

}
