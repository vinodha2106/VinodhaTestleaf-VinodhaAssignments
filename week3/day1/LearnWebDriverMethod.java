package week3.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWebDriverMethod {

	public static void main(String[] arg) {
		ChromeOptions option = new ChromeOptions();
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml;jsessionid=node01xabjjzshexhz1w1db3wlthzqb7250304.node0");
		
		//getcurrenturl method
		String url=driver.getCurrentUrl();
		System.out.println("Current url is: " +url);
		
	}
}
