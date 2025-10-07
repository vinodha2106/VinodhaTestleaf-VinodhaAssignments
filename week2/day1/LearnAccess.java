package week2.day1;

public class LearnAccess {

	private void method1() {
		System.out.println("Iam private method 1");
	}

	public void method2() {
		System.out.println("Iam public method 2");
	}

   	void method3() {
		System.out.println("Iam default method 3");// TODO Auto-generated method stub

	}

	protected void method4() {
		System.out.println("Iam protected method 4");
	}

	public static void main(String[] args) {
		LearnAccess access = new LearnAccess();
		access.method1();
		access.method2();
		access.method3();
		access.method4();

		// TODO Auto-generated method stub

	}

}




