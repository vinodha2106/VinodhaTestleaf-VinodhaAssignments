package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UseSelectForFB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Instantiate Chrome Browser

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://en-gb.facebook.com/");

		// Create new account
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("FirstName");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("LastName");

		// DOB
		Thread.sleep(2000);
		WebElement dob = driver.findElement(By.name("birthday_day"));
		Select dateofBirth = new Select(dob);
		dateofBirth.selectByVisibleText("10");

		WebElement mob = driver.findElement(By.name("birthday_month"));
		Select monthOfBirth = new Select(mob);
		monthOfBirth.selectByValue("5");

		WebElement yob = driver.findElement(By.name("birthday_year"));
		Select yearOfBirth = new Select(yob);
		yearOfBirth.selectByVisibleText("2000");

		driver.findElement(By.xpath("//input[@id='sex' and @value='1']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("abcdtest@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123@abC");

		System.out.println("FB Registration is successful");
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(5000);
		driver.close();

	}

}
