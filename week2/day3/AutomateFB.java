package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFB {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.close();
	}

}
