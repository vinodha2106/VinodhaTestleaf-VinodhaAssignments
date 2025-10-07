package week2.day1;

public class EdgeBrowser {

	public static void main(String[] args) {

		Browser eBrowser = new Browser();
		eBrowser.launchBrowser("Edge");
		eBrowser.loadUrl();
		eBrowser.closeBrowser("Edge");
		//String launchBrowser=eBrowser.launchBrowser("Edge");
		// System.out.println(launchBrowser);
		// System.out.println(eBrowser.closeBrowser(launchBrowser));
	}

}
