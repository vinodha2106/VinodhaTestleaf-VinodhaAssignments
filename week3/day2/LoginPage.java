package week3.day2;

public class LoginPage extends BasePage {   //Loginpage inherits from bassepage

	@Override
	public void performCommonTasks() {
		System.out.println("Perform common task inside login page");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginPage page = new LoginPage();
		page.findElement();
		page.enterText();
		page.performCommonTasks();
	}

}
