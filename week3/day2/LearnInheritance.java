package week3.day2;

public class LearnInheritance {
	
	public void fruits() {
		System.out.println("Fruits added");
	}
	
	public void vegetables() {
		System.out.println("Vegetables added");
	}
	
	public void spices(int Amount) {
		System.out.println("Spices addded" +Amount +"milligram");
	}
	
	public void salt() {
		System.out.println("SALT added");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnInheritance lI=new LearnInheritance();
		lI.fruits();
		lI.vegetables();
		lI.salt();
		lI.spices(2);
	}

}
