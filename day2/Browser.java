package week3.day2;

public class Browser {

	public String browserVariable;
	public int browserVersion;

	public String openUrl(String browserVariable) {
		System.out.println("The URL for browser : " + browserVariable + " is opened");
		return browserVariable;
	}

	public String closeUrl(String browserVariable) {
		System.out.println("The URL for browser : " + browserVariable + " is closed");
		return browserVariable;
	}

	public void navigateBack() {
		System.out.println("Navigate to back screen");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser br = new Browser();
		br.navigateBack();

	}

}
