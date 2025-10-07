package week2.day1;

public class Browser {

	public String launchBrowser(String browserName) {

		System.out.println(browserName + " Browser Launched Successfully:");
		return browserName;
	}

	protected void loadUrl() {
		System.out.println("The URL loaded successfully:");
	}

	public String closeBrowser(String browserName) {
		System.out.println(browserName +" browser clossed successfully");
		return browserName;
	}

	public static void main(String[] args) {

		Browser browserObj = new Browser();
		//String launchBrow=browserObj.launchBrowser("Chrome");
		//System.out.println(launchBrow);
		browserObj.launchBrowser("Chrome");
		browserObj.loadUrl();
		browserObj.closeBrowser("Chrome");
	}

}
