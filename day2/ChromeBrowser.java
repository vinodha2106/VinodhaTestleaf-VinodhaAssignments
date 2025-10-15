package week3.day2;

public class ChromeBrowser extends Browser {

	public void openIncognito() {
		System.out.println("Incognito mode is opened");

	}

	public void clearCache() {
		System.out.println("Cache got cleared");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeBrowser cB = new ChromeBrowser();
		cB.browserVariable = "Chrome";
		cB.browserVersion = 141;
		cB.openUrl("Chrome");
		cB.openIncognito();
		cB.navigateBack();
		cB.closeUrl("Chrome");
		
	}

}
