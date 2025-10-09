package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		//should maximize the window then only app or website or landing page should load 
		//always maximize
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("vinodha2106@gmail.com");
		driver.findElement(By.id("password")).sendKeys("vino2106");
		driver.findElement(By.className("decorativeSubmit")).click();
		

	}
}
