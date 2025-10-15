package week3.day2;

public class OrderLunch extends BriyaniReceipe {
	
	public String orderNo(String num) {
		System.out.println("Enter the number of Briyani " +num);
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderLunch oL=new OrderLunch();
		oL.orderNo("3");
		oL.lunch();
		oL.vegetables();
		oL.itemRequired();
		oL.salt();
		oL.spices(1);
		oL.briyani();
	}

}
