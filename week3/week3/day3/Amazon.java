package week3.day3;

public class Amazon extends CanaraBank {

	@Override
	public void internetBanking() {
		System.out.println("Amazon doesnt allow internet banking for this product");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Amazon amazon = new Amazon();
		amazon.recordPaymentDetails(); // from abstract class
		amazon.cardPayments();
		amazon.upiPayments();
		amazon.cashOnDelivery();
		amazon.internetBanking();
		
	}
}
