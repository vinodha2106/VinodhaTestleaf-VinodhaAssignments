package week3.day2;

public class WebElement { //super class

	public void click() {
		System.out.println("Clicked");
	}

	public String setString(String text) {
		System.out.println("setString as: " + text);
		return text;
	}

}
