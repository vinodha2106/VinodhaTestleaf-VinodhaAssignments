package week3.day3;

public abstract class CanaraBank implements Payments {

	@Override
	public void cashOnDelivery() {
		System.out.println("Cash on delivery option available for limit 1000");
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI Payment option available for limit 20000");
	}

	@Override
	public void cardPayments() {
		System.out.println("Card payment option available as Debit /Credit");
	}

	@Override
	public void internetBanking() {
		System.out.println("Internet Banking limit for 10000");
	}

	public void recordPaymentDetails() {
		System.out.println("Enter option to choose payment details ");
	}
}
