package week3.day2;

public class Buttons extends WebElement {//sub class buttons inherits super class webelement

	public void submit() {
		System.out.println("Submitted");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buttons button = new Buttons();
		button.click();
		button.setString("Text1");
		button.submit();

	}

}
