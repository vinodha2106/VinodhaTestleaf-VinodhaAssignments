package week3.day2;

public class EdgeBrowser extends ChromeBrowser {

	public void takeSnap() {
		System.out.println("Snap is taken in Edge");
	}

	public void clearCookies() {
		System.out.println("Cookies cleared in Edge browser");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeBrowser eB = new EdgeBrowser();
		eB.openUrl("Edge");
		eB.takeSnap();
		eB.clearCookies();
		eB.closeUrl("Edge");
		eB.openUrl("Chrome");
		eB.openIncognito();
		eB.closeUrl("Chrome");

	}

}
