package week3.day2;

public class BriyaniReceipe extends Receipe {
 
	
	public void itemRequired() {
		System.out.println("Chicken is added");
	}
	
	public void briyani() {
		System.out.println("Yummy Briyani is getting ready");
	}
	
	@Override
	public void spices(int Amount) {
		System.out.println("Enter in the gram:" +Amount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BriyaniReceipe bR= new BriyaniReceipe();
		bR.lunch();
		bR.vegetables();
		bR.itemRequired();
		bR.salt();
		bR.spices(22);
		bR.briyani();

	}

}
